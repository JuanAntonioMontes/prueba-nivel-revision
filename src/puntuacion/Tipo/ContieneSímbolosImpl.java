package puntuacion.Tipo;

public class ContieneSímbolosImpl implements ContieneSimbolos {
    @Override
    public boolean tieneSimbolos(String password) {
        return password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*");
    }
}
