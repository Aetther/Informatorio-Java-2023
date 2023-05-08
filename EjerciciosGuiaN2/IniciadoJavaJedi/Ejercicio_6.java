package EjerciciosGuiaN2.IniciadoJavaJedi;

public class Ejercicio_6 {
    public static void main(String[] args) {
        final int NUMEROS = 10;
        int contador = 0;
        int i = 1;
        while (contador < NUMEROS){
            if(i%2==0){
                System.out.println(i);
            }
            contador++;
            i++;
        }
    }
}
