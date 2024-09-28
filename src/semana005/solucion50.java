package semana005;

import java.util.Scanner;

public class solucion50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Ingresa el segundo número:");
        int num2 = scanner.nextInt();
        System.out.println("Ingresa el tercer número:");
        int num3 = scanner.nextInt();
        if (num1 < num2 && num2 < num3) {
            System.out.println("Los números están en orden ascendente.");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("Los números están en orden descendente.");
        } else {
            System.out.println("Los números están desordenados.");
        }
        scanner.close();
    }
}
