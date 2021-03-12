package ej519;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private List<Persona> grupo = new ArrayList<Persona>();

    public Grupo(Persona persona1){
        this.grupo = new ArrayList<Persona>();
        grupo.add(persona1);
    }
    public Grupo(List<Persona> grupo1){
        this.grupo = grupo1;
    }

    public List<Persona> getGrupo() {
        return grupo;
    }

    public void setGrupo(List<Persona> grupo) {
        this.grupo = grupo;
    }
    public boolean registrapersona(Persona personaandir) {
        for (Persona persona : grupo) {
            if (persona.equals(personaandir)) {
                return false;
            }
        }
        grupo.add(personaandir);
        return true;
    }
    public boolean eliminapersona(Persona personaelimar){
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
