package ej516;

public class Armablanca extends Arma {
    private boolean afilada;
    private float reduccionsinafilar;


    public Armablanca(float potencia, boolean afilada, float reduccionsinafilar) {
        super(potencia);
        this.afilada = afilada;
        this.reduccionsinafilar = reduccionsinafilar;
    }
    public boolean afilar(){
        if(afilada == false){
            setAfilada(true);
            return true;
        }
        else {
            return false;
        }
    }
    public double atacar(){
        double ataque;
        if(afilada == true){
           ataque = getPotencia();
           return  ataque;
       }
        else{
            ataque = getPotencia()-(getPotencia() * reduccionsinafilar);
            return ataque;
        }
    }

    public boolean isAfilada() {
        return afilada;
    }

    public void setAfilada(boolean afilada) {
        this.afilada = afilada;
    }

    public float getReduccionsinafilar() {
        return reduccionsinafilar;
    }

    public void setReduccionsinafilar(float reduccionsinafilar) {
        this.reduccionsinafilar = reduccionsinafilar;
    }

    @Override
    public String toString() {
        return "armablanca{" +
                "afilada=" + afilada +
                ", reduccionsinafilar=" + reduccionsinafilar +
                '}';
    }
}
