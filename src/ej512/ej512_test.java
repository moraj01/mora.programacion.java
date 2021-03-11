package ej512;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ej512_test {
    Autor Autor_1;
    Autor Autor_2;
    Autor Autor_3;
    Libro Libro_1;
    Libro Libro_2;
    @BeforeEach
    void setUP(){
        Autor_1 = new Autor("Carlos","Ruiz Zafon", 46);
        Autor_2 = new Autor("JK","Rowling",50);
        Libro_1 = new Libro("La sombra del viento", 400,Autor_1);
        Libro_2 = new Libro("Milenium",500,Autor_2);
    }
    @AfterEach
    void tearDown(){

    }
    @Test
    void contructor(){
        assertDoesNotThrow(()-> new Autor("PEPE","PIPI",80));
        assertDoesNotThrow(()-> new Libro("Ejemplo",800,Autor_1));
    }
    @Test
    void setAutor(){
        assertEquals(Autor_1.toString(), Libro_1.getAutores());
        Libro_1.setAutores(Autor_2);
        assertEquals(Autor_2.toString(), Libro_1.getAutores());
    }
    @Test
    void setTitulo(){
        assertEquals("La sombra del viento", Libro_1.getTitulo());
        Libro_1.setTitulo("Prueba");
        assertEquals("Prueba",Libro_1.getTitulo());
    }
    @Test
    void setN_pag(){
        assertEquals(400, Libro_1.getN_pag());
        Libro_1.setN_pag(200);
        assertEquals(200, Libro_1.getN_pag());
    }
    @Test
    void SetNombre(){
        assertEquals("Carlos", Autor_1.getNombre());
        Autor_1.setNombre("Prueba");
        assertEquals("Prueba",Autor_1.getNombre());
    }
    @Test
    void annadirautor(){
        assertEquals(true,Libro_1.annadirautor(Autor_2));
        assertEquals(false,Libro_1.annadirautor(Autor_3));
        assertEquals(true,Libro_1.elimnaautor(Autor_2));
        assertEquals(false,Libro_1.elimnaautor(Autor_2));
    }
    @Test
    void SetApellido(){
        assertEquals("Ruiz Zafon", Autor_1.getApellidos());
        Autor_1.setApellidos("Prueba");
        assertEquals("Prueba", Autor_1.getApellidos());
    }
    @Test
    void SetEdad(){
        assertEquals(46, Autor_1.getEdad());
        Autor_1.setEdad(50);
        assertEquals(50, Autor_1.getEdad());
    }
    @Test
    void ToString(){
        assertEquals("Carlos , Ruiz Zafon , 46", Autor_1.toString());
        assertEquals("La sombra del viento , 400 , Carlos , Ruiz Zafon , 46", Libro_1.toString());
    }


}
