package ej516;

public class Escopeta extends Armafuego {
    private  boolean recortada;
    private float aumentorecortada;

    public Escopeta(float potencia, boolean cargada, boolean recortada, float aumentorecortada) {
        super(potencia, cargada);
        this.recortada = recortada;
        this.aumentorecortada = aumentorecortada;
    }
    public double atacar(){
        double ataque;
        if(isCargada() == true){
            if (recortada == true) {
                ataque = getPotencia()+(getPotencia() * aumentorecortada);
                return ataque;

            }
            else {
                ataque = getPotencia();
                return ataque;
            }
        }
        else {
            ataque = 0;
            return ataque;
        }
    }

    public boolean isRecortada() {
        return recortada;
    }

    public void setRecortada(boolean recortada) {
        this.recortada = recortada;
    }

    public float getAumentorecortada() {
        return aumentorecortada;
    }

    public void setAumentorecortada(float aumentorecortada) {
        this.aumentorecortada = aumentorecortada;
    }

    @Override
    public String toString() {
        return "escopeta{" +
                "recortada=" + recortada +
                ", aumentorecortada=" + aumentorecortada +
                '}';
    }
}
