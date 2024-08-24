package semana001;

import java.util.Scanner;

public class Solucion05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = scanner.nextInt();
        int resta = num1 - num2;
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);
        scanner.close();
    }
}
