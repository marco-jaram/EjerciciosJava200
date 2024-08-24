package semana001;

import java.util.Scanner;

public class Solucion09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo:");
        double radio = scanner.nextDouble();
        double longitud = 2 * Math.PI * radio;
        System.out.println("La longitud de la circunferencia es: " + longitud);
        scanner.close();
    }

}
