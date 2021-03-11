package ej516;

public class Pistola extends Armafuego {
    private int calibre;

    public Pistola(float potencia, boolean cargada, int calibre) {
        super(potencia, cargada);
        this.calibre = calibre;
    }

    public int getCalibre() {
        return calibre;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }

    @Override
    public String toString() {
        return "pistola{" +
                "calibre=" + calibre +
                '}';
    }
}
