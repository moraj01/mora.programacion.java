package ej517;

public class Comercial extends Empleado {
    private float ventas;
    private float comision;

    public Comercial(String nombre, float sueldo, float ventas, float comision) {
        super(nombre, sueldo);
        this.ventas = ventas;
        this.comision = comision;
    }
    public void vende(float cantidad){
        setVentas(ventas+cantidad);
        return;
    }
    public float cobrar(){
        float comisiones = ventas * comision;
        setSueldo(getSueldo()+comisiones);
        return  getSueldo();
    }


    public float getVentas() {
        return ventas;
    }

    public void setVentas(float ventas) {
        this.ventas = ventas;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return "comercial{" +
                "ventas=" + ventas +
                ", comision=" + comision +
                '}';
    }
}
