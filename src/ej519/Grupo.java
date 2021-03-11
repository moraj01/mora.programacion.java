package ej519;

import java.util.ArrayList;

public class Grupo {
    private ArrayList<persona> grupo = new ArrayList<persona>();

    public Grupo(persona persona1){
        this.grupo = new ArrayList<persona>();
        grupo.add(persona1);
    }
    public Grupo(ArrayList grupo1){
        this.grupo = grupo1;
    }

    public ArrayList<persona> getGrupo() {
        return grupo;
    }

    public void setGrupo(ArrayList<persona> grupo) {
        this.grupo = grupo;
    }
    public boolean registrapersona(persona personaandir) {
        for (persona persona : grupo) {
            if (persona == personaandir) {
                return false;
            }
        }
        grupo.add(personaandir);
        return true;
    }
    public boolean eliminapersona(persona personaelimar){
        if(grupo.contains(personaelimar)){
            grupo.remove(personaelimar);
            return  true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "grupo=" + grupo +
                '}';
    }
}
