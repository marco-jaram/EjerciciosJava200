package semana04;

import java.util.Scanner;

public class solucion39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el precio del producto:");
        double precio = scanner.nextDouble();
        System.out.println("Ingresa la cantidad comprada:");
        int cantidad = scanner.nextInt();
        double total = precio * cantidad;
        System.out.println("El total a pagar es: " + total);
        scanner.close();
    }
}
