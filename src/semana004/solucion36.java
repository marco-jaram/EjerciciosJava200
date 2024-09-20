package semana004;

import java.util.Scanner;

public class solucion36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el radio del círculo:");
        double radio = scanner.nextDouble();
        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
        scanner.close();
    }
}
