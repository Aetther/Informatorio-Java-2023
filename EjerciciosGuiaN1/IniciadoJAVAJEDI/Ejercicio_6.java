package EjerciciosGuiaN1.IniciadoJAVAJEDI;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese el nombre de su ultima mascota");
        String mascota = sn.next();
        System.out.println("Ingrese el nombre de de la ultima pelicula vista");
        String pelicula = sn.next();
        sn.close();
        System.out.println("Nombre de la proxima bebida: "+ mascota + " " + pelicula);
    }
}
