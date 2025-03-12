package puntuacion;

public class PuntuacionImpl implements Puntuacion {
    private PuntuacionPorLongitud puntuacionPorLongitud;
    private PuntuacionPorTipo puntuacionPorTipo;
    private PuntuacionMaxima puntuacionMaxima;

    public PuntuacionImpl() {
        this.puntuacionPorLongitud = new PuntuacionPorLongitudImpl();
        this.puntuacionPorTipo = new PuntuacionPorTipoImpl();
        this.puntuacionMaxima = new PuntuacionMaximaImpl();
    }

    @Override
    public int calcular(String password) {
        int puntos = 0;

        // Obtener puntos por longitud
        puntos += puntuacionPorLongitud.calcularPuntuacionPorLongitud(password);

        // Obtener puntos por tipo de caracteres
        puntos += puntuacionPorTipo.calcularPuntuacionPorTipo(password);

        // Verificar si merece punto extra por máximos
        puntos += puntuacionMaxima.calcularPuntuacionMaxima(password);

        // Asegurar que la puntuación esté en el rango 1-10
        return Math.max(1, Math.min(10, puntos));
    }
}