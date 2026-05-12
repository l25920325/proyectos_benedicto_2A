package tareaproyectosjava;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- EJERCICIO 3: MENÚ DE OPERACIONES ---");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Seleccione una opción (1-4): ");
        int opcion = sc.nextInt();
        
        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();

        // Sentencia switch 
        switch (opcion) {
            case 1:
                System.out.println("Resultado Suma: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado Resta: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado Multiplicación: " + (num1 * num2));
                break;
            case 4:
                // Validación de división entre cero
                if (num2 != 0) {
                    System.out.println("Resultado División: " + (num1 / num2));
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Error: Opción de menú no válida.");
        }
    }
}