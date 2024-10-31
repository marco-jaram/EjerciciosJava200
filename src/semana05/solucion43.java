package semana05;

import java.util.Scanner;

public class solucion43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Ingresa el segundo número:");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("El mayor número es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El mayor número es: " + num2);
        } else {
            System.out.println("Ambos números son iguales.");
        }
        scanner.close();
    }
}
