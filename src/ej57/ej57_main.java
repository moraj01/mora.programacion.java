package ej57;

import java.util.ArrayList;
import java.util.List;

public  class ej57_main {
    public static void main(String[] args) {
        ej57.Coche Coche_1 = new ej57.Coche("523652gbg", "verde", 3, 200, "subaru",
                "BRZ");
        ej57.Coche Coche_2 = new ej57.Coche("85622tht", "rojo", 3, 343, "nissan",
                "370z");
        ej57.Coche Coche_3 = new ej57.Coche("86318zdf", "blanco", 5, 310, "honda",
                "CIvic type R");


        List<ej57.Coche> coches = new ArrayList<ej57.Coche>();
        coches.add(Coche_1);
        coches.add(Coche_2);
        coches.add(Coche_3);

        System.out.println("Todos los coches:");
        for (ej57.Coche Coches_disponibles : coches) {
            System.out.println(Coches_disponibles.getMatricula() + ", " +
                    Coches_disponibles.getColor() + ", " +
                    Coches_disponibles.getN_puertas() + ", " +
                    Coches_disponibles.getCaballos() + ", " +
                    Coches_disponibles.getMarca() + ", " +
                    Coches_disponibles.getModelo());
        }


            coches.get(0).setColor("Azul");
            coches.get(1).setColor("Gris");
            coches.get(2).setColor("Rojo");

            System.out.println("Los nuevos colores de los coches son: "+
                coches.get(0).getMarca() + ", " + coches.get(0).getModelo() + ", " + coches.get(0).getColor() + ", "+
                coches.get(1).getMarca() + ", " + coches.get(1).getModelo() + ", " + coches.get(1).getColor() + ", "+
                coches.get(2).getMarca() + ", " + coches.get(2).getModelo() + ", " + coches.get(2).getColor());

        }
    }
