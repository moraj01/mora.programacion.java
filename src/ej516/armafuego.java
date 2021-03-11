package ej516;

public class armafuego extends arma {
    private boolean cargada;

    public armafuego(float potencia, boolean cargada) {
        super(potencia);
        this.cargada = cargada;
    }
    public boolean cargar(){
        if (cargada == false){
            setCargada(true);
            return cargada;
        }
        if (cargada==true){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean disparar(){
        if(cargada == true){
            setCargada(false);
            return true;
        }
        if(cargada==false){
            return false;
        }
        return false;
    }
    public float atacar(){
        float ataque  = 0;
        if(cargada==false){
         return ataque;
        }
        if(cargada==true){
            ataque = getPotencia() * 2;
            return ataque;
        }
        return ataque;
    }

    public boolean isCargada() {
        return cargada;
    }

    public void setCargada(boolean cargada) {
        this.cargada = cargada;
    }

    @Override
    public String toString() {
        return "armafuego{" +
                "cargada=" + cargada +
                '}';
    }
}
