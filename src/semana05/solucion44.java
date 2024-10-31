package semana05;

import java.util.Scanner;

public class solucion44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Ingresa el segundo número:");
        int num2 = scanner.nextInt();
        System.out.println("Ingresa el tercer número:");
        int num3 = scanner.nextInt();
        int menor = num1;
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }
        System.out.println("El menor número es: " + menor);
        scanner.close();
    }
}
