package Valoracion;

public interface Valoracion {
    String obtenerCategoria(int puntuacion);
    boolean esAceptable(int puntuacion, boolean confirmado);
}
