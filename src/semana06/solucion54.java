package semana06;

import java.util.Scanner;

public class solucion54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu edad:");
        int edad = scanner.nextInt();
        for (int i = 0; i < edad; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " es par.");
            } else {
                System.out.println(i + " es impar.");
            }
        }
        scanner.close();
    }
}
