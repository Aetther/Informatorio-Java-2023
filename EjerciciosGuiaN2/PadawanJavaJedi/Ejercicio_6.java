package EjerciciosGuiaN2.PadawanJavaJedi;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        int suma = 1;
        for (int i = 1; i < num; i++){
            suma+=i;
        }
        System.out.println("El resultado es: "+suma);
        sc.close();
    }
}
