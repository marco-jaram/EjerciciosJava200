package semana005;

import java.util.Scanner;

public class solucion46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número:");
        int num = scanner.nextInt();
        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println(num + " es divisible entre 5 y 3.");
        } else if (num % 5 == 0) {
            System.out.println(num + " es divisible entre 5 pero no entre 3.");
        } else if (num % 3 == 0) {
            System.out.println(num + " es divisible entre 3 pero no entre 5.");
        } else {
            System.out.println(num + " no es divisible entre 3 ni entre 5.");
        }
        scanner.close();
    }
}
