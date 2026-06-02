package contadorcaracteres1;

import java.util.Scanner;

public class ContadorCaracteres1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();
        
        int vocales = 0, consonantes = 0, digitos = 0, especiales = 0;
        
        // Convertimos a minúsculas para facilitar la comparación de las vocales
        String fraseMinuscula = frase.toLowerCase();
        
        for (int i = 0; i < fraseMinuscula.length(); i++) {
            char ch = fraseMinuscula.charAt(i);
            
            if (Character.isDigit(ch)) {
                digitos++;
            } else if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vocales++;
                } else {
                    consonantes++;
                }
            } else {
                // Cuenta espacios en blanco, puntos, comas, signos (@, !, #, etc.)
                especiales++;
            }
        }
        
        System.out.println("\n--- Resultados ---");
        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
        System.out.println("Digitos: " + digitos);
        System.out.println("Caracteres especiales: " + especiales);
        
        scanner.close();
    }
}