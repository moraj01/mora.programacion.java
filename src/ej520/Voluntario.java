package ej520;

public class Voluntario {
    private String nombre;
    private int edad;

    public Voluntario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Voluntario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
