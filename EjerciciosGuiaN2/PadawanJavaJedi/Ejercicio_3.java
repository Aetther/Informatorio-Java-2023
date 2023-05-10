package EjerciciosGuiaN2.PadawanJavaJedi;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero a factorizar");
        int numFactorizar = sc.nextInt();
        int resultado = 1;
        for (int i = 1; i <= numFactorizar; i++){
            resultado *= i;
        }
        System.out.println("El factorial es: " + resultado);
        sc.close();
    }
}
