package ej513;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ej513_test {
    Punto Punto_1;
    Circulo Circulo_1;
    Punto Punto_2;
    Circulo Circulo_2;

    @BeforeEach
    void Setup(){
        Punto_1 = new Punto(50, 20);
        Punto_2 = new Punto(20, 50);
        Circulo_1 = new Circulo(Punto_1);
        Circulo_2= new Circulo(Punto_2);
        Circulo_1.calculadiametro();
        Circulo_1.calculacircunferencia();
    }
    @AfterEach
    void  setdown(){

    }
    @Test
    void construcotr(){
        assertDoesNotThrow(()-> new Punto(5, 6));
        assertDoesNotThrow(()-> new Circulo(Punto_2));
    }
    @Test
    void setX(){
        assertEquals(50, Punto_1.getX());
        Punto_1.setX(80);
        assertEquals(80, Punto_1.getX());
    }
    @Test
    void sety(){
        assertEquals(20, Punto_1.getY());
        Punto_1.setY(80);
        assertEquals(80, Punto_1.getY());
    }
    @Test
    void setradio(){
        assertEquals(2, Circulo_1.getRadio());
        Circulo_1.setRadio(20);
        assertEquals(20, Circulo_1.getRadio());
    }
    @Test
    void setPunto(){
        assertEquals(Punto_1,Circulo_1.getCentro());
        Circulo_1.setCentro(Punto_2);
        assertEquals(Punto_2,Circulo_1.getCentro());
    }
    @Test
    void calculardiametro(){
        assertEquals(4.0, Circulo_1.calculadiametro());
    }
    @Test
    void calculacircunferencia(){
        assertEquals(12.566, Circulo_1.calculacircunferencia());
    }
    @Test
    void tostring(){
        assertEquals("Eje X = 50 Eje Y = 20", Punto_1.toString());
        assertEquals("Punto Eje X = 50 Eje Y = 20", Circulo_1.toString());
    }
}
