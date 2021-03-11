package ej516;

public class hacha extends armablanca{
    private int filos;

    public hacha(float potencia, boolean afilada, float reduccionsinafilar, int filos) {
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
