package Puntuacion;

import Puntuacion.Tipo.*;

public class PuntuacionPorTipoImpl implements PuntuacionPorTipo {
    private ContieneLetras contieneLetras;
    private ContieneMayusculasYMinusculas contieneMayMin;
    private ContieneNumeros contieneNumeros;
    private ContieneSimbolos contieneSimbolos;

    public PuntuacionPorTipoImpl() {
        this.contieneLetras = new ContieneLetrasImpl();
        this.contieneMayMin = new ContieneMayusculasYMinusculasImpl();
        this.contieneNumeros = new ContieneNumerosImpl();
        this.contieneSimbolos = new ContieneSímbolosImpl();
    }

    @Override
    public int calcularPuntuacionPorTipo(String password) {
        int puntos = 0;

        if (contieneLetras.tieneLetras(password)) {
            puntos += 1;
        }

        if (contieneMayMin.tieneMayusculasYMinusculas(password)) {
            puntos += 2;
        }

        if (contieneNumeros.tieneNumeros(password)) {
            puntos += 1;
        }

        if (contieneSimbolos.tieneSimbolos(password)) {
            puntos += 2;
        }

        return puntos;
    }
}