package semana04;

import java.util.Scanner;

public class solucion33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer número decimal:");
        double num1 = scanner.nextDouble();
        System.out.println("Ingresa el segundo número decimal:");
        double num2 = scanner.nextDouble();
        double producto = num1 * num2;
        System.out.println("El producto es: " + producto);
        scanner.close();
    }
}
