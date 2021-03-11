package ej513;

public class Circulo {
    private Punto Centro;
    private double radio = 2;
    private double diametro;
    private double circunferencia;

    public Circulo(Punto centro) {
        Centro = centro;
    }

    public double calculadiametro(){
        diametro = radio * 2;
        return diametro;
    }
    public double calculacircunferencia(){
        circunferencia = diametro * 3.1415;
        return circunferencia;
    }

    public Punto getCentro() {
        return Centro;
    }

    public void setCentro(Punto centro) {
        Centro = centro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Punto "+Centro;
    }
}
