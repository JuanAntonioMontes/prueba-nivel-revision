package Puntuacion;

public class PuntuacionPorLongitudImpl implements PuntuacionPorLongitud {
    @Override
    public int calcularPuntuacionPorLongitud(String password) {
        int length = password.length();

        if (length >= 7 && length <= 8) {
            return 1;
        } else if (length >= 9 && length <= 12) {
            return 2;
        } else if (length > 12) {
            return 3;
        }

        return 0; // De 0 a 6 caracteres: 0 puntos
    }
}
