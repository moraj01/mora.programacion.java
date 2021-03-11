package ej517;

public class guaridaseguridad extends empleado {
    private int noches;
    private  float extranoches;

    public guaridaseguridad(String nombre, float sueldo, int noches, float extranoches) {
        super(nombre, sueldo);
        this.noches = noches;
        this.extranoches = extranoches;
    }
    public float cobrar(){
        float extra;
        extra = noches * extranoches+getSueldo();
        setSueldo(extra);
        return extra;
    }

    public int getNoches() {
        return noches;
    }

    public void setNoches(int noches) {
        this.noches = noches;
    }

    public float getExtranoches() {
        return extranoches;
    }

    public void setExtranoches(float extranoches) {
        this.extranoches = extranoches;
    }

    @Override
    public String toString() {
        return "guaridaseguridad{" +
                "noches=" + noches +
                ", extranoches=" + extranoches +
                '}';
    }
}
