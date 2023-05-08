package EjerciciosGuiaN2.IniciadoJavaJedi;

public class Ejercicio_7 {
    public static void main(String[] args) {
        System.out.println("Cálculo de Promedio de Notas");

        int nota1= 70, nota2= 60, nota3= 95, nota4= 100, nota5= 80;
        int promedio= (nota1+nota2+nota3+nota4+nota5)/5;

        System.out.print("Notas: "+nota1+", "+nota2+", "+nota3+", "+nota4+", "+nota5+".");
        System.out.println();
        if(promedio > 60){
            System.out.println("Aprobado con: "+promedio+".");
        } else {
            System.out.println("Desaprobado con: "+promedio+".");
        }
    }
}
