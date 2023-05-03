package EjerciciosGuiaN1.IniciadoJAVAJEDI;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del triangulo");
        int num = sn.nextInt();
        for (int i = 0; i < num; i++){
            for (int j = num; j > i; j--){
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sn.close();
    }
}
