package ej516;

public class rifle extends armafuego {
    private  float alcance;


    public rifle(float potencia, boolean cargada, float alcance) {
        super(potencia, cargada);
        this.alcance = alcance;
    }

    public float getAlcance() {
        return alcance;
    }

    public void setAlcance(float alcance) {
        this.alcance = alcance;
    }

    @Override
    public String toString() {
        return "rifle{" +
                "alcance=" + alcance +
                '}';
    }
}
