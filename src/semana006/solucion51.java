package semana006;

import java.util.Scanner;

public class solucion51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu edad:");
        int edad = scanner.nextInt();
        for (int i = 0; i < edad; i++) {
            System.out.println("¡Bienvenido!");
        }
        scanner.close();
    }
}
