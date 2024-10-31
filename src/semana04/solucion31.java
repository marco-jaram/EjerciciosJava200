package semana04;

import java.util.Scanner;

public class solucion31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa tu nombre:");
        String nombre = scanner.nextLine();
        System.out.println("¡Hola, " + nombre + ", bienvenido!");
        scanner.close();
    }
}

