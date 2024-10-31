package semana04;

import java.util.Scanner;

public class solucion38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la longitud del rectángulo:");
        double longitud = scanner.nextDouble();
        System.out.println("Ingresa el ancho del rectángulo:");
        double ancho = scanner.nextDouble();
        double perimetro = 2 * (longitud + ancho);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
        scanner.close();
    }
}
