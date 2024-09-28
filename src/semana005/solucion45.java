package semana005;

import java.util.Scanner;

public class solucion45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número:");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " es par.");
        } else {
            System.out.println(num + " es impar.");
        }
        scanner.close();
    }
}
