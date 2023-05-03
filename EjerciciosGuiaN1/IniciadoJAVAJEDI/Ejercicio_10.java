package EjerciciosGuiaN1.IniciadoJAVAJEDI;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese el primer numero entero");
        double num1 = sn.nextDouble();
        System.out.println("Ingrese el segundo numero entero");
        double num2 = sn.nextDouble();
        double acumulador = 0.0;
        for (int i = 1; i < 16; i++){
            acumulador += (num1*num2)/(i);
        }
        System.out.println("El resultado es: "+ acumulador);
        sn.close();
    }    
}
