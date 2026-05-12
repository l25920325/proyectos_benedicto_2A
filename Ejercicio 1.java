package tareaproyectosjava;

import java.util.Scanner;

public class TareaProyectosJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- CLASIFICACIÓN DE TRIÁNGULOS ---");
        System.out.print("Ingrese lado 1: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese lado 2: ");
        double b = sc.nextDouble();
        System.out.print("Ingrese lado 3: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Resultado: El triángulo es EQUILÁTERO.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Resultado: El triángulo es ISÓSCELES.");
            } else {
                System.out.println("Resultado: El triángulo es ESCALENO.");
            }
        } else {
            System.out.println("Error: Los valores no forman un triángulo.");
        }
    }
} 