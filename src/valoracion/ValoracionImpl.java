package valoracion;

public class ValoracionImpl implements Valoracion {
    private int umbral;

    public ValoracionImpl(int umbral) {
        this.umbral = umbral;
    }

    @Override
    public String obtenerCategoria(int puntuacion) {
        if (puntuacion <= 2) {
            return "Muy débil";
        } else if (puntuacion <= 5) {
            return "Débil";
        } else if (puntuacion <= 7) {
            return "Moderada";
        } else if (puntuacion <= 9) {
            return "Fuerte";
        } else {
            return "Muy fuerte";
        }
    }

    @Override
    public boolean esAceptable(int puntuacion, boolean confirmado) {
        return puntuacion >= umbral || confirmado;
    }

    public void setUmbral(int umbral) {
        this.umbral = umbral;
    }
}
