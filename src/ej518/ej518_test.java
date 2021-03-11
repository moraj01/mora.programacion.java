package ej518;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ej518_test {
    Flauta travesera;
    Guitarra psr;

    @BeforeEach
    void setup(){
        travesera = new Flauta(7);
        psr = new Guitarra(6);
    }
    @AfterEach
    void setdown(){

    }
    @Test
    void constructor(){
        assertDoesNotThrow(()->new Guitarra(7));
        assertDoesNotThrow(()->new Flauta(7));
    }
    @Test
    void nota(){
        assertEquals(Nota.RE, psr.tocarNota());
        assertEquals(Nota.DO, travesera.tocarNota());
    }
    @Test
    void setcuerdas(){
        assertEquals(6,psr.getCuerdas());
        //se rompe una cuerda
        psr.setCuerdas(5);
        assertEquals(5,psr.getCuerdas());
    }
    @Test
    void setorificios(){
        assertEquals(7, travesera.getOrificios());
        //le abro un boquete con un taladro
        travesera.setOrificios(8);
        assertEquals(8, travesera.getOrificios());
    }
    @Test
    void tostring(){
        assertEquals("Guitarra{cuerdas=6}",psr.toString());
        assertEquals("Flauta{orificios=7}",travesera.toString());
    }
}
