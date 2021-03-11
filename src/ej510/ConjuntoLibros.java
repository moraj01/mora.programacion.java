package ej510;

public class ConjuntoLibros {
    private Libro[] libros;

    public ConjuntoLibros() {
        libros = new Libro[10];
    }

    public void annadirlibro(Libro nuevolibro) {
        int i;
        for (i = 0; i < 10; i++) {
            if (libros[i] == nuevolibro) {
                System.out.println("Ese libro ya existe");
                return;
            } else if (libros[i] == null) {
                libros[i] = nuevolibro;
                return;
            }
        }
        System.out.println("No se ha añadido ningun libro");
    }

    public void eliminalibrotitulo(String Titulo) {
        int i;
        for (i = 0; i < 10; i++) {
            if (Titulo == libros[i].getTitulo()) {
                libros[i] = null;
                return;
            }
        }
    }

    public void eliminalibroautor(String Autor) {
        int i;
        for (i = 0; i < 10; i++) {
            if (Autor == libros[i].getAutor()) {
                libros[i] = null;
                return;
            }
        }
    }

    public String mayorpuntuacion() {
        int i;
        float mayor = 0;
        int Posicion;
        for (i = 0; i < libros.length; i++) {
            if (libros[i].getCalificacion() > mayor) {
                mayor = libros[i].getCalificacion();
                Posicion = i;
            }
        }
        return libros[i].getTitulo();
    }

    public String menorpuntuacion() {
        int i;
        float menor = 10;
        int Posicion;
        for (i = 0; i < libros.length; i++) {
            if (libros[i].getCalificacion() <= menor) {
                menor = libros[i].getCalificacion();
                Posicion = i;
            }
        }
        return libros[i].getTitulo();
    }

    public void mostrarcontenido() {
        int i;
        for (i = 0; i < libros.length; i++) {
            if (libros[i] == null) {
                System.out.println("El espacio " + i + " esta vacio");
            } else {
                System.out.println(libros[i].getAutor() + " , " + libros[i].getTitulo());
            }
        }

    }
}

