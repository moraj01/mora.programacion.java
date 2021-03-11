package ej518;


public class guitarra extends instrumento {
    private int cuerdas;

    public guitarra(int cuerdas) {
        this.cuerdas = cuerdas;
    }

    @Override
    public nota tocarNota() {
        return nota.RE;
    }

    public int getCuerdas() {
        return cuerdas;
    }

    public void setCuerdas(int cuerdas) {
        this.cuerdas = cuerdas;
    }
}
