import java.util.InputMismatchException;
import java.util.Scanner;

public class ej51 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce las horas trabajadas: ");
        while (!entrada.hasNextInt()) {
            entrada.nextLine();
            System.out.println("Debe ser un número");
        }
        int horas = entrada.nextInt();
        // Cada vez que se lee un número hay que limpiar la entrada
        entrada.nextLine();

        System.out.print("Introduce el coste por hora: ");
        float coste;
        while (true) {
            try {
                coste = entrada.nextFloat();
                entrada.nextLine();
                break;
            } catch (InputMismatchException e) {
                entrada.nextLine();
                System.out.println("Debe ser un número");
            }
        }

        System.out.println("El coste total es: " + coste * horas);
    }
}