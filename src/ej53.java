import java.util.InputMismatchException;
import java.util.Scanner;
public class ej53 {
    public static void main(String[] args) {
        System.out.println("Puntuacion\tCalificacion");
        System.out.println(">=0.9\t\tSobresaliente");
        System.out.println(">=0.8\t\tNotable");
        System.out.println(">=0.7\t\tBien");
        System.out.println(">=0.6\t\tSuficiente");
        System.out.println("<0.6\t\tInsuficiente");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu nota: ");
        double nota;
        while (true) {
            try {
                nota = entrada.nextDouble();
                entrada.nextLine();
                break;
            } catch (InputMismatchException e) {
                entrada.nextLine();
                System.out.println("Debe ser un número decimal");
            }
        }
        if (nota >= 0.9) {
            System.out.println("Sobresaliente");
        }
        else if (nota >= 0.8 && nota<0.9 ) {
            System.out.println("Notable");
        }
        else if (nota >= 0.7 && nota<0.8) {
            System.out.println("Bien");
        }
        else if (nota >= 0.6 && nota<0.7) {
            System.out.println("Suficiente");
        }
        else if (nota < 0.6) {
            System.out.println("Insuficiente");


        }
    }
}
