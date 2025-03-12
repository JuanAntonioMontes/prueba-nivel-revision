package puntuacion.Tipo;

public class ContieneLetrasImpl implements ContieneLetras {
    @Override
    public boolean tieneLetras(String password) {
        return password.matches(".*[a-zA-Z].*");
    }
}
