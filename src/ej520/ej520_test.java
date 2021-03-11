package ej520;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;


public class ej520_test {
    Voluntario voluntario1;
    Voluntario voluntario2;
    ArrayList<Voluntario> grupovoluntarios = new ArrayList<>();
    ArrayList<Voluntario> grupovoluntarios2 = new ArrayList<>();
    ONG unicef;

    @BeforeEach
    void setup(){
        voluntario1 = new Voluntario("Juanito Macande",27);
        voluntario2= new Voluntario("Paco Candela",32);
        grupovoluntarios.add(voluntario1);
        grupovoluntarios.add(voluntario2);
        unicef = new ONG(grupovoluntarios);
    }
    @AfterEach
    void setdown(){

    }
    @Test
    void constructor(){
        assertDoesNotThrow(()->new Voluntario("Nacho Queso",56));
        assertDoesNotThrow(()-> new ONG(grupovoluntarios));
    }
    @Test
    void anndevoluntario(){
        unicef.setVoluntarios(grupovoluntarios2);
        unicef.annadevoluntario(voluntario1);
        grupovoluntarios.add(voluntario1);
        assertEquals(unicef.getVoluntarios(),grupovoluntarios2);
    }
    @Test
    void siguiente(){
        assertEquals(unicef.siguiente(),voluntario2);
        assertEquals(unicef.siguiente(),voluntario1);
        assertEquals(unicef.siguiente(), null);
    }
    @Test
    void setvoluntarios(){
        assertEquals(unicef.getVoluntarios(), grupovoluntarios);
        unicef.setVoluntarios(grupovoluntarios2);
        assertEquals(unicef.getVoluntarios(), grupovoluntarios2);
    }
    @Test
    void setnombre(){
        assertEquals("Juanito Macande",voluntario1.getNombre());
        voluntario1.setNombre("Francisco Fuego");
        assertEquals("Francisco Fuego",voluntario1.getNombre());
    }
    @Test
    void setedad(){
        assertEquals(27,voluntario1.getEdad());
        voluntario1.setEdad(45);
        assertEquals(45,voluntario1.getEdad());
    }
    @Test
    void tostring(){
        assertEquals("Voluntario{nombre='Juanito Macande', edad=27}",voluntario1.toString());
        assertEquals("ONG{voluntarios=[Voluntario{nombre='Juanito Macande', edad=27}, Voluntario{nombre='Paco Candela', edad=32}]}",unicef.toString());
    }

}
