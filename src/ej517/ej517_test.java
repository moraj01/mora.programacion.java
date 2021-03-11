package ej517;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ej517_test {
    Empleado empleado1;
    Guaridaseguridad cancelo;
    Comercial gonzalo;

    @BeforeEach
    void setUp(){
        empleado1 = new Empleado("Jose Manuel",1200);
        cancelo = new Guaridaseguridad("Alejandro cancelo",1500,6,150);
        gonzalo = new Comercial("Gonzalo Pulido",1300,45,20);
    }
    @AfterEach
    void setDown(){

    }
    @Test
    void constructor(){
        assertDoesNotThrow(()-> new Empleado("Pepe",1500));
        assertDoesNotThrow(()-> new Guaridaseguridad("Juanito",1800,5,80));
        assertDoesNotThrow(()-> new Comercial("Javi",500,1,6));
    }
    @Test
    void setNombre(){
        assertEquals("Jose Manuel",empleado1.getNombre());
        empleado1.setNombre("Juanito Candela");
        assertEquals("Juanito Candela",empleado1.getNombre());
    }
    @Test
    void setsueldo(){
        assertEquals(1200,empleado1.getSueldo());
        //se ha vuelto dueño de la emppresa
        empleado1.setSueldo(50000000);
        assertEquals(50000000,empleado1.getSueldo());
    }
    @Test
    void setNoches(){
        assertEquals(6,cancelo.getNoches());
        cancelo.setNoches(8);
        assertEquals(8,cancelo.getNoches());
    }
    @Test
    void setextranoches(){
        assertEquals(150, cancelo.getExtranoches());
        cancelo.setExtranoches(200);
        assertEquals(200, cancelo.getExtranoches());
    }
    @Test
    void setcomision(){
        assertEquals(20, gonzalo.getComision());
        gonzalo.setComision(60);
        assertEquals(60,gonzalo.getComision());
    }
    @Test
    void setventas(){
        assertEquals(45,gonzalo.getVentas());
        gonzalo.setVentas(600);
        assertEquals(600,gonzalo.getVentas());
    }
    @Test
    void vende(){
        assertEquals(45,gonzalo.getVentas());
        gonzalo.vende(15);
        assertEquals(60,gonzalo.getVentas());
    }
    @Test
    void cobrar(){
        assertEquals(2200,gonzalo.cobrar());
        assertEquals(2400,cancelo.cobrar());
        assertEquals(1200,empleado1.cobrar());
    }
    @Test
    void tostring(){
        assertEquals("empleado{nombre='Jose Manuel', sueldo=1200.0}", empleado1.toString());
        assertEquals("comercial{ventas=45.0, comision=20.0}", gonzalo.toString());
        assertEquals("guaridaseguridad{noches=6, extranoches=150.0}", cancelo.toString());
    }

}
