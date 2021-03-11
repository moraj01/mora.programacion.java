package ej515;

import java.util.Arrays;

public class Escuadron {
    private Soldado[] soldados = new Soldado[15];



    public Escuadron(Soldado[] soldados) {
        if(soldados.length>1){
            this.soldados = soldados;
        }
        else{
            System.out.println("No se puede crear un escuadron sin ningun soladado");
            return;
        }

    }
    public int potenciafuego(){
        int i;
        int potencia = 0;
        for(i=0;i<soldados.length;i++){
            if(soldados[i]!=null){
                potencia += soldados[i].getPotenciadeFuego();
            }
        }
        return potencia;
    }

    public boolean annadesoldado(Soldado soldadoannadir){
        int i;
        boolean existe = false;
        for(i=0;i<soldados.length ;i++){
            if(soldados[i]==soldadoannadir){
                existe = true;

            }
        }
        for(i=0;i<soldados.length;i++){
            if(soldados[i]==null && !existe){
                soldados[i] = soldadoannadir;
                return true;
            }
        }
        return false;
    }
    public boolean elimansoldado(Soldado soldadoelimar){
        int i;
        for(i=0;i<soldados.length;i++){
            if(soldados[i]==soldadoelimar){
                soldados[i] = null;
                return true;
            }
        }
        return false;
    }

    public Soldado[] getSoldados() {
        return soldados;
    }

    public void setSoldados(Soldado[] soldados) {
        this.soldados = soldados;
    }

    @Override
    public String toString() {
        int i;
        int numero_soldadoa = 0;
        for(i=0;i<soldados.length;i++){
            if(soldados[i]!=null){
                numero_soldadoa ++;
            }
        }
        Soldado[] soldadosactivos = new Soldado[numero_soldadoa];
        for(i=0;i<soldados.length;i++){
            if(soldados[i]!=null){
                soldadosactivos[i] = soldados[i];
                           }
        }
        return "Escuadron{" +
                "Soldados=" + Arrays.toString(soldadosactivos) +
                '}';
    }
}
