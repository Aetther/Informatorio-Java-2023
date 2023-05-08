package EjerciciosGuiaN2.IniciadoJavaJedi;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de amigos");
        int cantAmigos = sc.nextInt();
        String[] nombres = new String[cantAmigos];

        for (int i = 0; i < cantAmigos; i++){
            System.out.println("Ingrese el nombre del amigo "+(i+1)+": ");
            nombres[i] = sc.next();
        }
        System.out.println("Los nombres de los amigos son: ");
        for(int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }
        sc.close();
    }
}
