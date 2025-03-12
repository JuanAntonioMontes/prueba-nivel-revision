package Consola;

public class ConsolaImpl implements Consola {
    private java.util.Scanner scanner;

    public ConsolaImpl() {
        scanner = new java.util.Scanner(System.in);
    }

    @Override
    public boolean pedirConfirmacion(String mensaje) {
        mostrarMensaje(mensaje + " (s/n): ");
        String respuesta = scanner.nextLine().trim().toLowerCase();
        return respuesta.equals("s") || respuesta.equals("si") || respuesta.equals("sí");
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        System.out.print(mensaje);
    }

    public void cerrar() {
        if (scanner != null) {
            scanner.close();
        }
    }
}
