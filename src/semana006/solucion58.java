package semana006;

import java.util.Scanner;

public class solucion58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu edad:");
        int edad = scanner.nextInt();
        for (int i = 0; i < edad; i++) {
            int suma = 0;
            for (int j = 1; j <= i; j++) {
                suma += j;
            }
            System.out.println("La suma de los números hasta " + i + " es: " + suma);
        }
        scanner.close();
    }
}
