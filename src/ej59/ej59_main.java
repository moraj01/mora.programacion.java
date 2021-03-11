package ej59;

public class ej59_main {
    public static void main (String[] args){
        cuenta cuenta_1 = new cuenta(0, "2356390l");
        cuenta cuenta_2 = new cuenta(700, "745747k");
        cuenta[] cuentasJM = {cuenta_1, cuenta_2};
        Persona Jose_Manuel = new Persona("12314134L");
        Jose_Manuel.setCuentas(cuentasJM);

        cuenta_1.Ingreso((double) 1100);
        cuenta_2.Retirada((double) 750);
        boolean moroso = Jose_Manuel.moroso(cuentasJM);
        if(moroso){
            System.out.println("La persona es morosa");
        }
        double saldo1= cuenta_1.VerSaldo();
        double saldo2 = cuenta_2.VerSaldo();
        double ingreso = saldo1/2;
        cuenta_1.Retirada((double) ingreso);
        cuenta_2.Ingreso((double) ingreso);
        moroso = Jose_Manuel.moroso(cuentasJM);
        if(!moroso){
            System.out.println("LA persona no es morosa");
        }



    }

}
