package semana06;

import java.util.Scanner;

public class solucion57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu edad:");
        int edad = scanner.nextInt();
        for (int i = 2; i <= edad; i++) {
            int suma = 1;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    suma += j;
                }
            }
            if (suma == i) {
                System.out.println(i + " es un número perfecto.");
            } else {
                System.out.println(i + " no es un número perfecto.");
            }
        }
        scanner.close();
    }
}
