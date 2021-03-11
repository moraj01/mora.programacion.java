package ej516;

public class armablanca extends arma{
    private boolean afilada;
    private float reduccionsinafilar;


    public armablanca(float potencia, boolean afilada, float reduccionsinafilar) {
        super(potencia);
        this.afilada = afilada;
        this.reduccionsinafilar = reduccionsinafilar;
    }
    public void afilar(){
        if(afilada == false){
            setAfilada(true);
            return;
        }
        else {
            return;
        }
    }
    public float atacar(){
        float ataque;
        if(afilada == true){
           ataque = getPotencia();
           return  ataque;
       }
        else{
            ataque = getPotencia() * reduccionsinafilar;
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
