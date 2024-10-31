package semana01;

import java.util.Scanner;

public class Solucion06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa tu nombre:");
        String nombre = scanner.nextLine();
        System.out.println("¡Hola, " + nombre + ", bienvenido!");
        scanner.close();
    }
}
