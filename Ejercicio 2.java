package tareaproyectosjava;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- EJERCICIO 2: CÁLCULO DE IMPUESTO ---");
        System.out.print("Ingrese el salario mensual: ");
        double salario = sc.nextDouble();
        
        double impuesto = 0;

        // Validación: El salario debe ser mayor a 0
        if (salario > 0) {
            // Estructura selectiva if-else if 
            if (salario < 10000) {
                impuesto = 0; // Exento
            } else if (salario <= 20000) {
                impuesto = salario * 0.10; // 10%
            } else if (salario <= 35000) {
                impuesto = salario * 0.20; // 20%
            } else {
                impuesto = salario * 0.30; // Más de 35,000 -> 30%
            }

            // Mostrar resultados
            System.out.println("-");
            System.out.println("Salario mensual: $" + salario);
            System.out.println("Impuesto calculado: $" + impuesto);
            System.out.println("-");
        } else {
            System.out.println("Error: El salario debe ser mayor a 0.");
        }
    }
}