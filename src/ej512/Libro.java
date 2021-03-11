
package ej512;

public class Libro{
    private String titulo;
    private int n_pag;
    private Autor[] autores = new Autor[2];


    public Libro(String titulo, int n_pag, Autor autorprincipal) {
        this.titulo = titulo;
        this.n_pag = n_pag;
        autores[0] = autorprincipal;
    }

    public  boolean elimnaautor(Autor autorelimar){
        int i;
        for(i=1;i<autores.length;i++){
            if(autores[i]==autorelimar){
                autores[i]=null;
                return true;
            }
        }
        return false;
    }
    public boolean annadirautor(Autor nuevoautor){
        int i;
        for(i=1;i<autores.length;i++){
            if(autores[i]==null){
                autores[i]=nuevoautor;
                return true;
            }
        }
        return false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getN_pag() {
        return n_pag;
    }

    public void setN_pag(int n_pag) {
        this.n_pag = n_pag;
    }

    public String getAutores() {
        return autores[0].toString();
    }

    public void setAutores(Autor autor) {
        this.autores[0] = autor;
    }

    @Override
    public String toString() {
        return titulo + " , " + n_pag + " , " + autores[0];
    }
}