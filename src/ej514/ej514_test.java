package ej514;

import ej513.Circulo;
import ej513.Punto;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ej514_test {
    Punto Punto_1;
    Circulo Circulo_1;
    Punto Punto_2;
    Punto Punto_3;
    Circulo Circulo_2;
    Circulo Circulo_3;
    Bola Bola_1;
    Bola Bola_2;
    Bola Bola_3;

    @BeforeEach
    void Setup(){
        Punto_1 = new Punto(50, 20);
        Punto_2 = new Punto(20, 50);
        Punto_3 = new Punto(80, 81);
        Circulo_1 = new Circulo(Punto_1);
        Circulo_2= new Circulo(Punto_2);
        Circulo_3= new Circulo(Punto_3);
        Circulo_1.calculadiametro();
        Circulo_1.calculacircunferencia();
        Bola_1 = new Bola(Circulo_1);
        Bola_2 = new Bola(Circulo_2);
        Bola_3 = new Bola(Circulo_3);
    }
    @AfterEach
    void  setdown(){

    }
    @Test
    void construcotr(){
        assertDoesNotThrow(()-> new Punto(5, 6));
        assertDoesNotThrow(()-> new Circulo(Punto_2));
        assertDoesNotThrow(()-> new Bola(Circulo_1));
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
    void setcirculo(){
        assertEquals(Circulo_1, Bola_1.getCirculo());
        Bola_1.setCirculo(Circulo_2);
        assertEquals(Circulo_2, Bola_1.getCirculo());
    }
    @Test
    void colision(){
        assertEquals(true, Bola_1.colision(Bola_1, Bola_2));
        assertEquals(false, Bola_2.colision(Bola_2, Bola_3));
    }
    @Test
    void tostring(){
        assertEquals("Eje X = 50 Eje Y = 20", Punto_1.toString());
        assertEquals("Punto Eje X = 50 Eje Y = 20", Circulo_1.toString());
        assertEquals("Circulo Punto Eje X = 50 Eje Y = 20", Bola_1.toString());
    }
}
