package semana005;

import java.util.Scanner;

public class solucion48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu calificación:");
        int calificacion = scanner.nextInt();
        if (calificacion >= 60) {
            System.out.println("¡Felicidades! Has aprobado.");
        } else {
            System.out.println("Necesitas mejorar tu calificación.");
        }
        scanner.close();
    }
}
