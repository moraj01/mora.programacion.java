package ej59;

import java.util.Arrays;

public class Persona{
        private String DNI;
        private cuenta[] cuentas;

    public Persona(String DNI) {
        this.DNI = DNI;
        cuentas = new cuenta[3];
    }
    public void annadirCuentas(cuenta[] cuentasaañadir){
        setCuentas(cuentasaañadir);
    }
    public boolean moroso(cuenta[] cuentas) {
        int i;
        boolean moroso = false;
        for (i = 0; i < cuentas.length; i++) {
            if (cuentas[i].getSaldo() < 0) {
                moroso = true;
            }
        }
        return moroso;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "DNI='" + DNI + '\'' +
                ", cuentas=" + Arrays.toString(cuentas) +
                '}';
    }
}

