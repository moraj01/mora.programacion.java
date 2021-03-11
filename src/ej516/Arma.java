package ej516;

public class Arma {
    private float potencia;

    public Arma(float potencia) {
        this.potencia = potencia;
    }

    public double atacar(){
        float ataque;
        ataque = potencia;
        return ataque;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "arma{" +
                "potencia=" + potencia +
                '}';
    }
}
