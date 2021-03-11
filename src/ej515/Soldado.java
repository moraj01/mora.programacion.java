package ej515;

public class Soldado {
    private String Nombre;
    private  String Apellido;
    private int PotenciadeFuego;


    public Soldado(String nombre, String apellido, int potenciadeFuego) {
        Nombre = nombre;
        Apellido = apellido;
        PotenciadeFuego = potenciadeFuego;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getPotenciadeFuego() {
        return PotenciadeFuego;
    }

    public void setPotenciadeFuego(int potenciadeFuego) {
        PotenciadeFuego = potenciadeFuego;
    }

    @Override
    public String toString() {
        return "Soldado{" +
                "Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", PotenciadeFuego=" + PotenciadeFuego +
                '}';
    }
}
