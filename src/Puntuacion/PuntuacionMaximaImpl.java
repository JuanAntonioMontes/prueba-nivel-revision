package Puntuacion;

import Puntuacion.Tipo.*;

public class PuntuacionMaximaImpl implements PuntuacionMaxima {
    private ContieneLetras contieneLetras;
    private ContieneMayusculasYMinusculas contieneMayMin;
    private ContieneNumeros contieneNumeros;
    private ContieneSimbolos contieneSimbolos;

    public PuntuacionMaximaImpl() {
        this.contieneLetras = new ContieneLetrasImpl();
        this.contieneMayMin = new ContieneMayusculasYMinusculasImpl();
        this.contieneNumeros = new ContieneNumerosImpl();
        this.contieneSimbolos = new ContieneSímbolosImpl();
    }

    @Override
    public int calcularPuntuacionMaxima(String password) {
        // Verifica si tiene máximo en longitud (más de 12)
        boolean maxLongitud = password.length() > 12;

        // Verifica si tiene letras
        boolean tieneLetras = contieneLetras.tieneLetras(password);

        // Verifica si tiene mayúsculas y minúsculas
        boolean tieneMayMin = contieneMayMin.tieneMayusculasYMinusculas(password);

        // Verifica si tiene números
        boolean tieneNumeros = contieneNumeros.tieneNumeros(password);

        // Verifica si tiene símbolos
        boolean tieneSimbolos = contieneSimbolos.tieneSimbolos(password);

        // Si tiene máximo en todo, devuelve 1 punto extra
        if (maxLongitud && tieneLetras && tieneMayMin && tieneNumeros && tieneSimbolos) {
            return 1;
        }

        return 0;
    }
}