package ej518;


public class Guitarra extends Instrumento {
    private int cuerdas;

    public Guitarra(int cuerdas) {
        this.cuerdas = cuerdas;
    }

    @Override
    public Nota tocarNota() {
        return Nota.RE;
    }

    public int getCuerdas() {
        return cuerdas;
    }

    public void setCuerdas(int cuerdas) {
        this.cuerdas = cuerdas;
    }

    @Override
    public String toString() {
        return "Guitarra{" +
                "cuerdas=" + cuerdas +
                '}';
    }
}
