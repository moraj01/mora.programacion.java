package ej514;

import ej513.Circulo;

public class Bola {
    private ej513.Circulo Circulo;

    public Bola(Circulo circulo) {
        Circulo = circulo;
    }
    public boolean colision(Bola bola1, Bola bola2){
        double sumaradios = bola1.getCirculo().getRadio()+ bola2.getCirculo().getRadio();
        double distanciapuntos = Math.sqrt((bola2.getCirculo().getCentro().getX()-bola1.getCirculo().getCentro().getX()) + (bola2.getCirculo().getCentro().getY()-bola1.getCirculo().getCentro().getY()));
        if(distanciapuntos<sumaradios){
            return true;
        }
        else{
            return false;
        }
    }

    public Circulo getCirculo() {
        return Circulo;
    }

    public void setCirculo(Circulo circulo) {
        Circulo = circulo;
    }

    @Override
    public String toString() {
        return "Circulo "+Circulo;
    }
}
