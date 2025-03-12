import Consola.Consola;
import Puntuacion.Puntuacion;
import Valoracion.Valoracion;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Error: Debe proporcionar una contraseña como argumento.");
            System.exit(1);
        }

        String password = args[0];

        // Inicializar componentes
        Consola consola = new ConsolaImpl();
        Puntuacion puntuacion = new PuntuacionImpl();
        Valoracion valoracion = new ValoracionImpl(8); // Umbral inicial: 8

        // Calcular puntuación
        int score = puntuacion.calcular(password);
        String categoria = valoracion.obtenerCategoria(score);

        // Mostrar resultados
        consola.mostrarMensaje("Contraseña evaluada: " + password + "\n");
        consola.mostrarMensaje("Puntuación: " + score + "/10\n");
        consola.mostrarMensaje("Categoría: " + categoria + "\n\n");

        // Pedir confirmación si es necesario
        boolean confirmado = false;
        if (score < 8) {
            confirmado = consola.pedirConfirmacion("La contraseña es débil. ¿Desea continuar de todos modos?");
        }

        // Verificar si la contraseña es aceptable
        boolean aceptada = valoracion.esAceptable(score, confirmado);

        // Mostrar resultado final
        consola.mostrarMensaje("\nResultado final:\n");
        if (aceptada) {
            consola.mostrarMensaje("La contraseña ha sido ACEPTADA.\n");
        } else {
            consola.mostrarMensaje("La contraseña ha sido RECHAZADA.\n");
        }

        // Cerrar recursos
        ((ConsolaImpl)consola).cerrar();
    }
}

