package ej516;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ej516_test {

    Arma arma1;
    Arma arma2;
    Armablanca lanza;
    Armablanca machete;
    Armafuego ak48;
    Hacha tomahawk;
    Escopeta remingtom;
    Cuchillo karambit;
    Rifle g36;
    Pistola glock;

    @BeforeEach
    void setup(){
        arma1 = new Arma(20);
        arma2 = new Arma(25);
        lanza = new Armablanca(30, false, 0.10f);
        machete = new Armablanca(40,true, 0.15f);
        ak48 = new Armafuego(75,true);
        tomahawk = new Hacha(45,true,0.17f,2);
        remingtom = new Escopeta(90,false,false,0.25f);
        karambit = new Cuchillo(35,false,0.20f);
        g36 = new Rifle(65,false,99);
        glock = new Pistola(60,true,45);

    }
    @AfterEach
    void setdown(){

    }
    @Test
    void constructor(){
        assertDoesNotThrow(()-> new Arma(50));
        assertDoesNotThrow(()-> new Armablanca(30,false,0.13f));
        assertDoesNotThrow(()-> new Armafuego(40,true));
        assertDoesNotThrow(()-> new Cuchillo(35,true,0.30f));
        assertDoesNotThrow(()-> new Hacha(40,false,0.20f,1));
        assertDoesNotThrow(()-> new Rifle(50,true,100));
        assertDoesNotThrow(()->new Pistola(30,false,22));
    }
    @Test
    void getPotencia(){
        assertEquals(20,arma1.getPotencia());
        arma1.setPotencia(50);
        assertEquals(50,arma1.getPotencia());
    }
    @Test
    void filos(){
        assertEquals(2,tomahawk.getFilos());
        tomahawk.setFilos(4);
        assertEquals(4,tomahawk.getFilos());
    }
    @Test
    void afilar(){
        assertEquals(false, lanza.isAfilada());
        lanza.afilar();
        assertEquals(true, lanza.isAfilada());
        assertEquals(false, machete.afilar());
        assertEquals(true, karambit.afilar());
        assertEquals(0.10f,lanza.getReduccionsinafilar());
        lanza.setReduccionsinafilar(0.30f);
        assertEquals(0.30f,lanza.getReduccionsinafilar());
    }
    @Test
     void atacar(){
        assertEquals(20,arma1.atacar());
        assertEquals(27, lanza.atacar());
        lanza.afilar();
        assertEquals(30, lanza.atacar());
        assertEquals(150,ak48.atacar());
        assertEquals(0,g36.atacar());
    }
    @Test
    void  cargar(){
        assertEquals(false,g36.isCargada());
        assertEquals(true, g36.cargar());
        g36.cargar();
        assertEquals(true,g36.isCargada());
        assertEquals(true, ak48.isCargada());
        assertEquals(false,ak48.cargar());
    }
    @Test
    void disparar(){
        assertEquals(true,ak48.isCargada());
        assertEquals(true,ak48.disparar());
        ak48.disparar();
        assertEquals(false,ak48.disparar());
        assertEquals(false,g36.disparar());
    }
    @Test
    void recortada (){
        assertEquals(false,remingtom.isRecortada());
        assertEquals(false,remingtom.isCargada());
        remingtom.cargar();
        assertEquals(90,remingtom.atacar());
        remingtom.cargar();
        remingtom.setRecortada(true);
        assertEquals(112.5,remingtom.atacar());
        remingtom.cargar();
        assertEquals(0.25f,remingtom.getAumentorecortada());
        //Esto es lo que haria un hacker
        remingtom.setAumentorecortada(40);
        assertEquals(3690,remingtom.atacar());
    }
    @Test
    void calibre(){
        assertEquals(45,glock.getCalibre());
        glock.setCalibre(22);
        assertEquals(22,glock.getCalibre());
    }
    @Test
    void alcance(){
        assertEquals(99,g36.getAlcance());
        g36.setAlcance(120);
        assertEquals(120,g36.getAlcance());
    }
    @Test
    void tostring(){
        assertEquals("arma{potencia=20.0}",arma1.toString());
        assertEquals("armablanca{afilada=false, reduccionsinafilar=0.1}",lanza.toString());
        assertEquals("armafuego{cargada=true}",ak48.toString());
        assertEquals("escopeta{recortada=false, aumentorecortada=0.25}",remingtom.toString());
        assertEquals("hacha{filos=2}",tomahawk.toString());
        assertEquals("cuchillo{}",karambit.toString());
        assertEquals("rifle{alcance=99.0}",g36.toString());
        assertEquals("pistola{calibre=45}",glock.toString());
    }

}
