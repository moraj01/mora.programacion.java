package ej510;

public class ej510_main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Blanca Navidad","Pablo Emilio Escobar Gaviria", 250,7);
        Libro libro2 = new Libro("Runas Nordicas","Odin",500,8);
        ConjuntoLibros Conjunto1 = new ConjuntoLibros();
        Conjunto1.annadirlibro(libro1);
        Conjunto1.annadirlibro(libro2);
        Conjunto1.mostrarcontenido();

        Conjunto1.eliminalibrotitulo("Runas Nordicas");
        Conjunto1.eliminalibroautor("Pablo Emilio Escobar Gaviria");


        System.out.println("" +
                "" +
                "");
        Libro libro3 = new Libro("Hacker´s WhiteBook","Pablo Gutierrez Salazar",300,9);
        Conjunto1.annadirlibro(libro3);
        Conjunto1.mostrarcontenido();


    }
}
