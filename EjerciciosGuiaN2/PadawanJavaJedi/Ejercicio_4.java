package EjerciciosGuiaN2.PadawanJavaJedi;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero del rango");
        int num = sc.nextInt();
        System.out.println("Ingrese el numero final del rango");
        int num2 = sc.nextInt();
        int suma = 0;
        for (int i = num; i <= num2; i++){
            if (i % 2 != 0){
                suma += i;
            }
        }
        System.out.println("El resultado es: "+suma);
        sc.close();
    }
}
