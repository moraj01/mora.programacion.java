package ej511;

import java.util.Objects;

public class Cuenta {
    private String N_Cuenta;
    private double Saldo;
    private Cliente Dueño;

    public Cuenta(String n_Cuenta, double saldo, Cliente dueño) {
        N_Cuenta = n_Cuenta;
        Saldo = saldo;
        Dueño = dueño;
    }

    public String getN_Cuenta() {



        return N_Cuenta;
    }
    public void Ingreso(int dinero){
        Saldo = Saldo + dinero;
    }
    public void Retirada(int dinero){
        Saldo = Saldo - dinero;
    }
    public void setN_Cuenta(String n_Cuenta) {
        N_Cuenta = n_Cuenta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public Cliente getDueño() {
        return Dueño;
    }

    public void setDueño(Cliente dueño) {
        Dueño = dueño;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cuenta cuenta = (Cuenta) o;
        return Objects.equals(N_Cuenta, cuenta.N_Cuenta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(N_Cuenta);
    }
}
