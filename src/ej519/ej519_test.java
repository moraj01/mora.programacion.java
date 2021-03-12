package ej519;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class ej519_test {
    Cliente cliente1;
    Proveedor proveedor2;
    Grupo grupo1;
    List<Persona> grupo2 = new ArrayList<Persona>();
    Proveedor proveedor1;
    Cliente clientevip;

    @BeforeEach
    void setUp(){
        cliente1 = new Cliente("Juan","Perez",34,7985,700);
        clientevip = new Cliente("Amancio","Ortega",75,3434,870000);
        grupo1 = new Grupo(cliente1);
        proveedor1 = new Proveedor("Manuel","Ramos",54,"gfwgvK",45);
        proveedor2 = new Proveedor("Paco","Luca",47,"asda",3);
    }
    @AfterEach
    void setdown(){

    }
    @Test
    void constructor(){
        assertDoesNotThrow(()-> new Cliente("Pepe","Viruela",23,4324,600));
        assertDoesNotThrow(()-> new Proveedor("Kilian","Rata",34,"234f",67));
        assertDoesNotThrow(()-> new Grupo(clientevip));
        assertDoesNotThrow(()-> new Grupo(grupo2));
    }
    @Test
    void setproductos(){
        assertEquals(45,proveedor1.getN_productos());
        proveedor1.setN_productos(34);
        assertEquals(34,proveedor1.getN_productos());
    }
    @Test
    void hascodepersona(){
        clientevip.hashCode();
        cliente1.hashCode();
        assertFalse(clientevip.equals(cliente1));
        clientevip.setEdad(cliente1.getEdad());
        clientevip.setApellidos(cliente1.getApellidos());
        clientevip.setNombre(cliente1.getNombre());
        assertTrue(clientevip.equals(cliente1));
    }
    @Test
    void hashcodeproveedor(){
        proveedor1.hashCode();
        assertFalse(proveedor1.equals(proveedor2));
        proveedor2.setCodigo(proveedor1.getCodigo());
        assertTrue(proveedor1.equals(proveedor2));
    }

    @Test
    void setedad(){
        assertEquals(34, cliente1.getEdad());
        cliente1.setEdad(54);
        assertEquals(54,cliente1.getEdad());
    }
    @Test void setgrupo(){
        grupo2.add(cliente1);
        assertEquals(grupo2,grupo1.getGrupo());
        grupo2.add(clientevip);
        grupo1.setGrupo(grupo2);
        assertEquals(grupo2,grupo1.getGrupo());
    }
    @Test
    void setid() {
        assertEquals(7985, cliente1.getId());
        cliente1.setId(752);
        assertEquals(752, cliente1.getId());
    }
    @Test
    void setcodigo(){
        assertEquals("gfwgvK", proveedor1.getCodigo());
        proveedor1.setCodigo("12l");
        assertEquals("12l",proveedor1.getCodigo());
    }
    @Test
    void registrapersona(){
        assertFalse(grupo1.registrapersona(cliente1));
        assertTrue(grupo1.registrapersona(clientevip));
    }
    @Test
    void eliminapersona(){
        assertTrue(grupo1.eliminapersona(cliente1));
        assertFalse(grupo1.eliminapersona(clientevip));
    }
    @Test
    void setdinero(){
        assertEquals(700,cliente1.getDinerogastado());
        cliente1.setDinerogastado(1200);
        assertEquals(1200,cliente1.getDinerogastado());
    }
    @Test
    void setvip(){
        assertFalse(cliente1.isVip());
        cliente1.setVip(true);
        assertTrue(cliente1.isVip());
        assertTrue(clientevip.isVip());

    }
    @Test
    void getnombre(){
        assertEquals("Juan", cliente1.getNombre());
        cliente1.setNombre("Pepe");
        assertEquals("Pepe", cliente1.getNombre());
    }
    @Test
    void getapellido(){
        assertEquals("Ortega",clientevip.getApellidos());
        clientevip.setApellidos("Nuñez");
        assertEquals("Nuñez",clientevip.getApellidos());
    }
    @Test
    void tostring(){
        assertEquals("Proveedor{codigo='gfwgvK', n_productos=45.0}",proveedor1.toString());
        assertEquals("Cliente{id=7985, dinerogastado=700.0, vip=false}",cliente1.toString());
        assertEquals("Grupo{grupo=[Cliente{id=7985, dinerogastado=700.0, vip=false}]}",grupo1.toString());

    }

}
