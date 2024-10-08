package semana006;

import java.util.Scanner;

public class solucion52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu edad:");
        int edad = scanner.nextInt();
        for (int i = 0; i < edad; i++) {
            if (i >= 18) {
                System.out.println("Eres mayor de edad.");
            } else {
                System.out.println("Eres menor de edad.");
            }
        }
        scanner.close();
    }
}
