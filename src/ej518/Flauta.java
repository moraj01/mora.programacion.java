package ej518;

public class Flauta extends Instrumento {
    private int orificios;

    public Flauta(int orificios) {
        this.orificios = orificios;
    }

    @Override
    public Nota tocarNota() {
        return Nota.DO;
    }

    public int getOrificios() {
        return orificios;
    }

    public void setOrificios(int orificios) {
        this.orificios = orificios;
    }

    @Override
    public String toString() {
        return "Flauta{" +
                "orificios=" + orificios +
                '}';
    }
}
