import java.util.InputMismatchException;
import java.util.Scanner;
public class ej54 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        while (!entrada.hasNextInt()) {
            entrada.nextLine();
            System.out.println("Debe ser un número");
        }
        int n1 = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Introduce el segundo numero: ");
        while (!entrada.hasNextInt()) {
            entrada.nextLine();
            System.out.println("Debe ser un número");
        }
        int n2 = entrada.nextInt();
        entrada.nextLine();
        System.out.println("¿Que desea hacer con esos numeros?");
        System.out.println("Sumar, Restar, Dividir o Multiplicar");
        System.out.print("Respuesta: ");
        String respuesta = entrada.next();
        switch (respuesta){
            case "sumar":
                float suma = n1+n2;
                System.out.println("La suma de los dos numero es "+suma);
                break;
            case "restar":
                float resta = n1-n2;
                System.out.println("La resta de los dos numero es "+resta);
                break;
            case "dividir":
                float divi = n1/n2;
                System.out.println("La division de los dos numero es "+divi);
                break;
            case "multiplicar":
                float multi = n1*n2;
                System.out.println("La multiplicacion de los dos numero es "+multi);
                break;
        }

    }
}
