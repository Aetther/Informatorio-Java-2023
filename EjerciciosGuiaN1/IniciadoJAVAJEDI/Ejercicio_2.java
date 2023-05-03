package EjerciciosGuiaN1.IniciadoJAVAJEDI;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args){
        int resultadoSuma = 0;
        Scanner nums = new Scanner(System.in);
        System.out.println("Por favor ingrese el primer numero entero:");
        int num1 = nums.nextInt();
        System.out.println("Por favor ingrese el segundo numero entero:");
        int num2 = nums.nextInt();
        nums.close();
        resultadoSuma = num1+num2;
        if(resultadoSuma%2 == 0){
            System.out.println("El resultado de la suma es: "+ (num1+num2)+ " y es un numero par");
        } else {
            System.out.println("El resultado de la suma es: "+ (num1+num2)+ " y es un numero impar");
        }
    }
}
