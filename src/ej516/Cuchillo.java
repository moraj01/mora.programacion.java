package ej516;

public class Cuchillo extends Armablanca {
    public Cuchillo(float potencia, boolean afilada, float reduccionsinafilar) {
        super(potencia, afilada, reduccionsinafilar);
    }

    @Override
    public String toString() {
        return "cuchillo{}";
    }
}
