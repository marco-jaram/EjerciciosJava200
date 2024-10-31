package semana04;

import java.util.Scanner;

public class solucion40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Ingresa el segundo número:");
        int num2 = scanner.nextInt();
        System.out.println("Ingresa el tercer número:");
        int num3 = scanner.nextInt();
        int mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        System.out.println("El mayor de los tres números es: " + mayor);
        scanner.close();
    }
}
