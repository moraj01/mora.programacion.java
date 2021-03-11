package ej58;
import java.util.Scanner;
public class ej58_main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dime la hora: ");
        while (!entrada.hasNextInt()) {
            entrada.nextLine();
            System.out.println("Debe ser un número");
        }
        int hora = entrada.nextInt();
        entrada.nextLine();
        int minuto = 0;
        System.out.print("Dime el minuto: ");
        while (true) {
            String input = entrada.nextLine();
            if (input.equals("")) {
                break;
            }
            try {
                minuto = Integer.parseInt(input);
                entrada.nextLine();
                if (minuto > 59) {
                    System.out.println("No puede haber mas de 60 minutos");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Tiene que ser un numero");
            }
        }
        int segundo = 0;
        System.out.print("Dime los segundos: ");
        while (true) {
            String input = entrada.nextLine();
            if (input.equals("")){
                break;
            }
            try{
                segundo = Integer.parseInt(input);
                entrada.nextLine();
                if (segundo >59){
                    System.out.println("No puede haber mas de 60 minutos");
                }
                else{
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Tiene que ser un numero o un punto");
            }
        }
        ej58.Tiempo Hora_1 = new ej58.Tiempo(hora,minuto,segundo);
        System.out.println(Hora_1);
    }
}

