public class ContieneMayusculasYMinusculasImpl implements ContieneMayusculasYMinusculas {
    @Override
    public boolean tieneMayusculasYMinusculas(String password) {
        boolean tieneMayusculas = password.matches(".*[A-Z].*");
        boolean tieneMinusculas = password.matches(".*[a-z].*");
        return tieneMayusculas && tieneMinusculas;
    }
}
