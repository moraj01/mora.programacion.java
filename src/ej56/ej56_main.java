package ej56;

public class ej56_main{
    public static void main(String[] args){
        ej56.Rectangulo r_1 = new ej56.Rectangulo(15, 7);
        System.out.println("El perimetro es: "+ ej56.Rectangulo.calculaperimetro());
        System.out.println("El area es: "+ ej56.Rectangulo.calculaArea());
        ej56.Rectangulo r_2 = new ej56.Rectangulo(30, 16);
        System.out.println("El perimetro es: "+ ej56.Rectangulo.calculaperimetro());
        System.out.println("El area es: "+ ej56.Rectangulo.calculaArea());
        ej56.Rectangulo r_3 = new ej56.Rectangulo(5, 2);
        System.out.println("El perimetro es: "+ ej56.Rectangulo.calculaperimetro());
        System.out.println("El area es: "+ ej56.Rectangulo.calculaArea());
        ej56.Rectangulo r_4 = new ej56.Rectangulo(55, 25);
        System.out.println("El perimetro es: "+ ej56.Rectangulo.calculaperimetro());
        System.out.println("El area es: "+ ej56.Rectangulo.calculaArea());

    }
}


