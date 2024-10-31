package semana01;

import java.util.Scanner;

public class Solucion10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la distancia recorrida (en kilómetros):");
        double distancia = scanner.nextDouble();
        System.out.println("Ingrese el tiempo empleado (en horas):");
        double tiempo = scanner.nextDouble();
        double velocidadMedia = distancia / tiempo;
        System.out.println("La velocidad media del vehículo es: " + velocidadMedia + " km/h");
        scanner.close();
    }
}
