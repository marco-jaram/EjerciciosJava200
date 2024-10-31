package semana01;

import java.util.Scanner;

public class Solucion02 {
    public static void main(String[] args) {
        System.out.println("Por favor, ingresa tu nombre:");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre + "!");
        scanner.close();
    }
}
