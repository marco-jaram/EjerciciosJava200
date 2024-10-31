package semana05;

import java.util.Scanner;

public class solucion42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número:");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("El número es positivo.");
        } else if (num < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
        scanner.close();
    }
}
