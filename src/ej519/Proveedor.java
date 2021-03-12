package ej519;

import java.util.Objects;

public class Proveedor extends Persona {
    private String codigo;
    private float n_productos;

    public Proveedor(String nombre, String apellidos, int edad, String codigo, float n_productos) {
        super(nombre, apellidos, edad);
        this.codigo = codigo;
        this.n_productos = n_productos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getN_productos() {
        return n_productos;
    }

    public void setN_productos(float n_productos) {
        this.n_productos = n_productos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Proveedor proveedor = (Proveedor) o;
        return Objects.equals(codigo, proveedor.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "codigo='" + codigo + '\'' +
                ", n_productos=" + n_productos +
                '}';
    }
}
