import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = scanner.nextLine();
        int suma = 0;
        int[] calificaciones = new int[5];
        for (int i = 0; i < 5; i++){
            System.out.print("Ingresa la calificación " + (i+1) + ": ");
            calificaciones[i] = scanner.nextInt();
            suma += calificaciones[i];
        }
        String calificacion = "";
        double promedio = suma/5;
        if (promedio > 90){
            calificacion = "A";
        } else if (promedio > 80 & promedio <= 90){
            calificacion = "B";
        } else if (promedio > 70 & promedio <= 80){
            calificacion = "C";
        } else if (promedio > 60 & promedio <= 70){
            calificacion = "D";
        } else if (promedio > 50 & promedio <= 60){
            calificacion = "E";
        } else {
            calificacion = "F";
        }
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < 5;i++){
            System.out.println("Calificación " + (i+1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
        System.out.println("-----------------------------------------------------------------------------------------------");
        }
    }