package EjerciciosGuiaN2.PadawanJavaJedi;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Preguntamos por la cantidad de amigos.
        System.out.print("Ingrese la cantidad de amigos: ");
        int cantidadAmigos = sc.nextInt();

        //Creamos un array para guardar el nombre de los amigos.
        String[] nombresAmigos = new String[cantidadAmigos];
        String[] amigosMayores = new String[cantidadAmigos];
        //Pedimos los nombres de los amigos y guardamos en el array.
        for (int i = 0; i < cantidadAmigos; i++){
            System.out.print("Ingrese el nombre del amigo #" + (i+1) + ": ");
            nombresAmigos[i]=sc.next();
        }

        //Iteramos sobre los nombres de los amigos y mostramos por pantalla solo los mayores
        for (int i = 0; i < cantidadAmigos; i++){
            System.out.print("Amigo #" + (i+1) + ": ");
            int edad = 0;
            do {
                System.out.print("Ingrese la edad de " + nombresAmigos[i] + ": ");
                edad = sc.nextInt();
                if (edad < 18){
                    System.out.println("No se mostrara a " +nombresAmigos[i] + "porque es menor de edad.");
                }
            } while (edad < 0);
            if (edad >= 18){
                amigosMayores[i] = nombresAmigos[i];
            }
        }
        for (int i = 0; i < amigosMayores.length; i++){
            if (amigosMayores[i] == null){
                i++;
            }
            System.out.println(amigosMayores[i]);
        }
        sc.close();
    }
}
