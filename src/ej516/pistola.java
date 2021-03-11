package ej516;

public class pistola extends armafuego {
    private int calibre;

    public pistola(float potencia, boolean cargada, int calibre) {
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
