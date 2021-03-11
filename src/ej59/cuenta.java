package ej59;

import java.util.Objects;

    public class cuenta {
        private double Saldo;
        private String N_cuenta;


        public cuenta(int saldo, String n_cuenta) {
            Saldo = saldo;
            N_cuenta = n_cuenta;
        }
        public void Ingreso(Double cantidad){
            Saldo = Saldo + cantidad;
        }
        public void Retirada(Double cantidad){
            Saldo = Saldo - cantidad;
        }
        public double VerSaldo(){
            return Saldo;
        }
        public int getSaldo() {
            return (int) Saldo;
        }

        public void setSaldo(int saldo) {
            Saldo = saldo;
        }

        public String getN_cuenta() {
            return N_cuenta;
        }

        public void setN_cuenta(String n_cuenta) {
            N_cuenta = n_cuenta;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            cuenta cuenta = (cuenta) o;
            return N_cuenta.equals(cuenta.N_cuenta);
        }

        @Override
        public int hashCode() {
            return Objects.hash(N_cuenta);
        }

    }
