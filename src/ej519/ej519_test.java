package ej519;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ej519_test {
    Cliente cliente1;
    Grupo grupo1;
    Proveedor proveedor1;

    @BeforeEach
    void setUp(){
        cliente1 = new Cliente(562,700);
//        grupo1 = new Grupo(cliente1);
        proveedor1 = new Proveedor("adal",47);
    }
    @AfterEach
    void setdown(){

    }
    @Test
    void setid() {
        assertEquals(562, cliente1.getId());
        cliente1.setId(752);
        assertEquals(752, cliente1.getId());
    }
    @Test
    void setcodigo(){
        assertEquals("adal", proveedor1.getCodigo());
        proveedor1.setCodigo("12l");
        assertEquals("12l",proveedor1.getCodigo());
    }
    @Test
    void annadirpersona(){

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

    }
    @Test
    void tostring(){
        assertEquals("",proveedor1.toString());
        assertEquals("",cliente1.toString());
        assertEquals("",grupo1.toString());
    }

}
