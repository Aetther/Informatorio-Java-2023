package EjerciciosGuiaN1.IniciadoJAVAJEDI;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner reales = new Scanner(System.in);
        System.out.println("Ingrese el primer numero real");
        double num1 = reales.nextDouble();
        System.out.println("Ingrese el segundo numero real");
        double num2 = reales.nextDouble();
        double resultado1 = num1 * num2;
        System.out.println("Ingrese el primer numero entero");
        int num3 = reales.nextInt();
        System.out.println("Ingrese el segundo numero entero");
        int num4 = reales.nextInt();
        int resultado2 = num3 * num4;
        double resultado3 = resultado1 + resultado2;
        if(resultado3%1 == 0){
            System.out.println("El resultado es un entero.");
        } else {
            System.out.println("El resultado es un real.");
        }
        reales.close();
    }
}
