package EjerciciosGuiaN1.IniciadoJAVAJEDI;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args){
        Scanner nums = new Scanner(System.in);
        System.out.println("Por favor ingrese el primer numero entero:");
        int num1 = nums.nextInt();
        System.out.println("Por favor ingrese el segundo numero entero:");
        int num2 = nums.nextInt();
        nums.close();
        int resultado = num1%num2;
        if(resultado == 0){
            System.out.println("El resultado de la división es: " + resultado);
        } else {
            System.out.println("El numero no es divisible");
        }
    }
}
