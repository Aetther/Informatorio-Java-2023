package EjerciciosGuiaN2.IniciadoJavaJedi;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        if(num == 0){
            System.out.println("El numero es cero.");
        } else if (num < 0){
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es positivo");
        }
        sc.close();
    }
}
