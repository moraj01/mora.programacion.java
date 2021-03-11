package ej512;

public class Autor {
    private String Nombre;
    private String Apellidos;
    private int Edad;

    public Autor(String nombre, String apellidos, int edad) {
        Nombre = nombre;
        Apellidos = apellidos;
        Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    @Override
    public String toString() {
        return Nombre + " , " + Apellidos+ " , " + Edad ;
    }
}

