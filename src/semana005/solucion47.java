package semana005;

import java.util.Scanner;

public class solucion47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un carácter:");
        char caracter = scanner.next().charAt(0);
        if (caracter == 'a' || caracter == 'e' || caracter == 'i' ||
                caracter == 'o' || caracter == 'u' ||
                caracter == 'A' || caracter == 'E' || caracter == 'I' ||
                caracter == 'O' || caracter == 'U') {
            System.out.println(caracter + " es una vocal.");
        } else {
            System.out.println(caracter + " es una consonante.");
        }
        scanner.close();
    }
}
