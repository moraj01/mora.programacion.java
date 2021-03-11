import java.util.InputMismatchException;
import java.util.Scanner;

public class ej52 {Scanner entrada = new Scanner(System.in);
    static public void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el precio del producto con IVA: ");
        while (!entrada.hasNextFloat()) {
            entrada.nextLine();
            System.out.println("Debe ser un número");
        }
        float precio = entrada.nextFloat();
        double iva_pagado = (precio/1.10) * 0.1;
        double precio_final = precio - iva_pagado;
        System.out.println("El precio del producto sin IVA es de: "+precio_final);


    }
}
