package ej518;

public class flauta  extends instrumento {
    private int orificios;

    public flauta(int orificios) {
        this.orificios = orificios;
    }

    @Override
    public nota tocarNota() {
        return nota.DO;
    }

    public int getOrificios() {
        return orificios;
    }

    public void setOrificios(int orificios) {
        this.orificios = orificios;
    }
}
