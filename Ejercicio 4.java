package tareaproyectosjava;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- EJERCICIO 4: SISTEMA DE CALIFICACIONES ---");
        System.out.print("Ingrese la calificación del estudiante (0-100): ");
        int nota = sc.nextInt();

        // Condición: Validar que la calificación esté en el rango correcto
        if (nota >= 0 && nota <= 100) {
            String mencion = "";
            
            // Escala calif
            if (nota >= 90) {
                mencion = "Excelente";
            } else if (nota >= 80) {
                mencion = "Muy bien";
            } else if (nota >= 70) {
                mencion = "Bien";
            } else if (nota >= 60) {
                mencion = "Suficiente";
            } else {
                mencion = "Reprobado";
            }

            // Mostrar resultados
            System.out.println("-");
            System.out.println("Mención obtenida: " + mencion);
            System.out.println("Estado: " + (nota >= 60 ? "APROBADO" : "REPROBADO"));
            System.out.println("-");
        } else {
            System.out.println("Error: La calificación debe estar entre 0 y 100.");
        }
    }
}