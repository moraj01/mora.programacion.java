package ej520;

import java.util.ArrayList;

public class ONG {
    private ArrayList<Voluntario> voluntarios = new ArrayList<Voluntario>();
    private boolean mayor = true;

    public ONG(ArrayList<Voluntario> voluntarios) {
        this.voluntarios = voluntarios;
    }

    public ArrayList<Voluntario> getVoluntarios() {
        return voluntarios;
    }

    public void setVoluntarios(ArrayList<Voluntario> voluntarios) {
        this.voluntarios = voluntarios;
    }
    public boolean annadevoluntario(Voluntario voluntarioanndir){
        voluntarios.add(voluntarioanndir);
        return true;
    }
    public Voluntario siguiente(){
        Voluntario voluntariodevolver = null;
        int edad = 0;
        if(voluntarios.isEmpty()){
            return null;
        }
        if(mayor){
            for(Voluntario voluntariocomprobar:voluntarios){
                if(voluntariocomprobar.getEdad()>edad){
                    edad = voluntariocomprobar.getEdad();
                    voluntariodevolver = voluntariocomprobar;
                }
            }
            return voluntariodevolver;
        }
        else {
            edad = 150;
            for(Voluntario voluntariocomprobar:voluntarios){
                if(voluntariocomprobar.getEdad()<edad){
                    edad = voluntariocomprobar.getEdad();
                    voluntariodevolver = voluntariocomprobar;
                }
            }
            return voluntariodevolver;
        }

    }

    @Override
    public String toString() {
        return "ONG{" +
                "voluntarios=" + voluntarios +
                '}';
    }
}
