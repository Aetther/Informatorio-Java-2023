package EjerciciosGuiaN1.IniciadoJAVAJEDI;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = sn.next();
       System.out.println("Ingrese su apellido:");
        String apellido = sn.next();
        System.out.println("Ingrese su edad:");
        int edad = sn.nextInt();
        System.out.println("Mi nombre es " + nombre +" " + apellido + ".\nMi edad es "+edad +".");
        sn.close();
    }
}
