package areasfiguras;

import java.util.Scanner;

public class AreasFiguras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n--- CALCULO DE AREAS ---");
            System.out.println("1. Circulo");
            System.out.println("2. Triangulo");
            System.out.println("3. Rectangulo");
            System.out.println("4. Cuadrado");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opcion (1-5): ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Introduce el radio del circulo: ");
                    double radio = scanner.nextDouble();
                    double areaCirculo = Math.PI * Math.pow(radio, 2);
                    System.out.println("-> El área del circulo es: " + areaCirculo);
                    break;
                    
                case 2:
                    System.out.print("Introduce la base del triangulo: ");
                    double baseT = scanner.nextDouble();
                    System.out.print("Introduce la altura del triangulo: ");
                    double alturaT = scanner.nextDouble();
                    double areaTriangulo = (baseT * alturaT) / 2;
                    System.out.println("-> El area del triangulo es: " + areaTriangulo);
                    break;
                    
                case 3:
                    System.out.print("Introduce la base del rectangulo: ");
                    double baseR = scanner.nextDouble();
                    System.out.print("Introduce la altura del rectangulo: ");
                    double alturaR = scanner.nextDouble();
                    double areaRectangulo = baseR * alturaR;
                    System.out.println("-> El area del rectangulo es: " + areaRectangulo);
                    break;
                    
                case 4:
                    System.out.print("Introduce el lado del cuadrado: ");
                    double lado = scanner.nextDouble();
                    double areaCuadrado = lado * lado;
                    System.out.println("-> El area del cuadrado es: " + areaCuadrado);
                    break;
                    
                case 5:
                    System.out.println("Saliendo del programa... ¡Adios!");
                    break;
                    
                default:
                    System.out.println("Opción no valida. Intenta de nuevo.");
            }
        } while (opcion != 5);
        
        scanner.close();
    }
}