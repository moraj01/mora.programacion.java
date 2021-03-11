package ej516;

public class arma {
    private float potencia;

    public arma(float potencia) {
        this.potencia = potencia;
    }

    public float atacar(){
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
