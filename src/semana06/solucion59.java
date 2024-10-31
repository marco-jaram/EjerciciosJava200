package semana06;

import java.util.Scanner;

public class solucion59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu edad:");
        int edad = scanner.nextInt();
        for (int i = 0; i < edad; i++) {
            System.out.println("Tabla de multiplicar del " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
        scanner.close();
    }
}
