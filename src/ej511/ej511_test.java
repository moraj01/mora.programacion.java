package ej511;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ej511_test {
    Cliente pepito;
    Cuenta caixa;
    Cliente manolo;
    Cuenta unicaja;
    Cuenta Santander;

    @BeforeEach
    void setUp(){
        pepito = new Cliente("PEPE","VIRUELA","41451L");
        caixa = new Cuenta("124145T",150,pepito);
        unicaja = new Cuenta("124145T", 1542,manolo);
    }


    @AfterEach
    void tearDown() {
    }

    @Test
    void constructor() {
        assertDoesNotThrow(() -> new Cliente("Manolo", "El Del BOMBO", "31676341M"));
        assertDoesNotThrow(() -> new Cuenta("14141Y",1351451, pepito));

    }
    @Test
    void Ingreso(){
        assertEquals(150, caixa.getSaldo());
        caixa.Ingreso(150);
        assertEquals(300, caixa.getSaldo());
    }
    @Test
    void Retirada(){
        assertEquals(150, caixa.getSaldo());
        caixa.Retirada(100);
        assertEquals(50, caixa.getSaldo());
    }
    @Test
    void setNombre(){
        assertEquals("PEPE", pepito.getNombre());
        pepito.setNombre("POPO");
        assertEquals("POPO", pepito.getNombre());
    }
    @Test
    void setApellido(){
        assertEquals("VIRUELA", pepito.getApellidos());
        pepito.setApellidos("RUBALCABA");
        assertEquals("RUBALCABA", pepito.getApellidos());
    }
    @Test
    void setDNI(){
        assertEquals("41451L", pepito.getDni());
        pepito.setDni("56789K");
        assertEquals("56789K", pepito.getDni());
    }
    @Test
    void setNCUenta(){
        assertEquals("124145T", caixa.getN_Cuenta());
        caixa.setN_Cuenta("4346T");
        assertEquals("4346T", caixa.getN_Cuenta());
    }
    @Test
    void setSaldo(){
        assertEquals(150, caixa.getSaldo());
        caixa.setSaldo(1000000000);
        assertEquals(1000000000, caixa.getSaldo());
    }
    @Test
    void setDueño(){
        assertEquals(pepito, caixa.getDueño());
        caixa.setDueño(manolo);
        assertEquals(manolo, caixa.getDueño());

    }
    @Test
    void hasch(){
        assertEquals(2018999540, caixa.hashCode());
    }
    @Test
    void ToString(){
        assertEquals("PEPE , VIRUELA , 41451L", pepito.toString());
    }
    @Test
    void equals(){
        assertEquals(false, caixa.equals(Santander));
        assertEquals(true, caixa.equals(unicaja));
    }
}
