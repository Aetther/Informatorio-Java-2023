package EjerciciosGuiaN2.IniciadoJavaJedi;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int num = sc.nextInt();
        int suma = 0;

        for (int i = 1; i <= num; i++){
            suma += i;
        }
        System.out.println("La suma de los primeros numeros " + num+ "naturales es: " +suma);
        sc.close();
    }
}
