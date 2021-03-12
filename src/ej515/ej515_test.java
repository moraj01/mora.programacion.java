package ej515;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ej515_test {

    Escuadron escuadron_1;
    Soldado soldado_1;
    Soldado soldado_2;
    Soldado soldado_3;
    Soldado[] peloton1 = new Soldado[15];
    Soldado[] peloton2 = new Soldado[15];

    @BeforeEach
    void setup(){
        soldado_1 = new Soldado("Mario","Piso",50);
        soldado_2 = new Soldado("Arnold","Salchicha",100);
        soldado_3 = new Soldado("Forest","Gump",999);
        peloton1[0] = soldado_1;
        peloton1[1] = soldado_2;
        peloton2[2] = soldado_3;
        escuadron_1 = new Escuadron(peloton1);

    }
    @AfterEach
    void setdown(){

    }

    @Test
    void constructor(){
        assertDoesNotThrow(()-> new Soldado("Prueba","preuba",867));
        assertDoesNotThrow(()-> new Escuadron(peloton1));
    }
    @Test
    void getnombre(){
        assertEquals("Mario",soldado_1.getNombre());
        soldado_1.setNombre("Manolo");
        assertEquals("Manolo",soldado_1.getNombre());
    }

    @Test
    void potenciadefuego(){
        assertEquals(150,escuadron_1.potenciafuego());
    }
    @Test
    void getapellido(){
        assertEquals("Piso",soldado_1.getApellido());
        soldado_1.setApellido("Chalet");
        assertEquals("Chalet",soldado_1.getApellido());
    }
    @Test
    void getptencia(){
        assertEquals(999,soldado_3.getPotenciadeFuego());
        soldado_3.setPotenciadeFuego(1000);
        assertEquals(1000,soldado_3.getPotenciadeFuego());
    }
     @Test
     void getsoldado(){
        assertEquals(escuadron_1.getSoldados(), peloton1);
        escuadron_1.setSoldados(peloton2);
         assertEquals(escuadron_1.getSoldados(), peloton2);
     }
    @Test
    void annadesoldado(){
        assertEquals(true,escuadron_1.annadesoldado(soldado_3));
        assertEquals(false,escuadron_1.annadesoldado(soldado_2));
    }
    @Test
    void eliminasoldado(){
        assertEquals(true,escuadron_1.elimansoldado(soldado_1));
        assertEquals(false,escuadron_1.elimansoldado(soldado_3));
    }
     @Test
    void tostring(){
        assertEquals("Soldado{Nombre='Forest', Apellido='Gump', PotenciadeFuego=999}",soldado_3.toString());
        assertEquals("Escuadron{Soldados=[Soldado{Nombre='Mario', Apellido='Piso', PotenciadeFuego=50}, Soldado{Nombre='Arnold', Apellido='Salchicha', PotenciadeFuego=100}]}",escuadron_1.toString());
     }
}
