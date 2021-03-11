package ej510;

public class Libro {
    private String Titulo;
    private String Autor;
    private int N_paginas;
    private float calificacion;

    public Libro(String titulo, String autor, int n_paginas, float calificacion) {
        Titulo = titulo;
        Autor = autor;
        N_paginas = n_paginas;
        if (calificacion <= 10 && calificacion >= 0) {
            this.calificacion = calificacion;
        } else {
            System.out.println("La calificacion tiene que estar entre 0 y 10");
            return;
        }
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getN_paginas() {
        return N_paginas;
    }

    public void setN_paginas(int n_paginas) {
        N_paginas = n_paginas;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }
}
