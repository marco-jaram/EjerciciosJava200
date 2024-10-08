package semana006;

import java.util.Scanner;

public class solucion56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu edad:");
        int edad = scanner.nextInt();
        for (int i = 0; i < edad; i++) {
            int edadFutura = edad + 10;
            System.out.println("Tu edad dentro de 10 años será: " + edadFutura);
        }
        scanner.close();
    }
}
