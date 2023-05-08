package EjerciciosGuiaN1.PadawanJavaJedi;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su peso en libras");
        double pesoLibras = sc.nextDouble();
        double pesoKilogramos = pesoLibras*0.45;
        System.out.println("Peso en kilogramos: "+pesoKilogramos);
        sc.close();
    }
}
