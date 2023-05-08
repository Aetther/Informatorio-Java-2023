package EjerciciosGuiaN1.PadawanJavaJedi;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        for (int i = 0; i < 20; i++){
            num++;
        }
        System.out.println("El numero es: " + num);
        sc.close();
    }
}