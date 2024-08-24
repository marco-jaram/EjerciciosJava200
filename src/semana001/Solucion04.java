package semana001;

import java.util.Scanner;

public class Solucion04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese el tercer número:");
        int num3 = scanner.nextInt();
        int resultado = num1 * num2 * num3;
        System.out.println("El resultado de multiplicar los tres números es: " + resultado);
        scanner.close();
    }
}
