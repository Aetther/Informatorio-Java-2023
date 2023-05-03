package EjerciciosGuiaN1.IniciadoJAVAJEDI;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args){
        Scanner nums = new Scanner(System.in);
        System.out.println("Por favor ingrese el primer numero entero:");
        int num1 = nums.nextInt();
        System.out.println("Por favor ingrese el segundo numero entero:");
        int num2 = nums.nextInt();
        nums.close();
        System.out.println("El resultado de la suma es: " + (num1+num2));
    }
}
