package puntuacion.Tipo;

public class ContieneNumerosImpl implements ContieneNumeros {
    @Override
    public boolean tieneNumeros(String password) {
        return password.matches(".*\\d.*");
    }
}
