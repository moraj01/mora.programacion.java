package ej516;

public class Hacha extends Armablanca {
    private int filos;

    public Hacha(float potencia, boolean afilada, float reduccionsinafilar, int filos) {
        super(potencia, afilada, reduccionsinafilar);
        this.filos = filos;
    }

    public int getFilos() {
        return filos;
    }

    public void setFilos(int filos) {
        this.filos = filos;
    }

    @Override
    public String toString() {
        return "hacha{" +
                "filos=" + filos +
                '}';
    }
}
