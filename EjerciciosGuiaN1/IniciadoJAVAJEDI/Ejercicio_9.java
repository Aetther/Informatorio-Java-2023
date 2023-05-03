package EjerciciosGuiaN1.IniciadoJAVAJEDI;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = sn.nextInt();
        double cuadrado = Math.pow(num, 2);
        double cubo = Math.pow(num, 3);
        /*Otra solucion
        int cuadrado = num*num;
        int cubo = num*num*num;*/
        System.out.println("El cuadrado del numero es : "+cuadrado+"\nEl cubo del numero es: "+ cubo);
        sn.close();
    }
}
