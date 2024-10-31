package semana06;

import java.util.Scanner;

public class solucion55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu edad:");
        int edad = scanner.nextInt();
        for (int i = 2; i <= edad; i++) {
            boolean esPrimo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println(i + " es primo.");
            } else {
                System.out.println(i + " no es primo.");
            }
        }
        scanner.close();
    }
}
