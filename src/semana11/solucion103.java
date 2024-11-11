package semana11;

public class solucion103 {
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int numero1 = 7;
        int numero2 = 10;
        System.out.println(numero1 + " ¿es primo?: " + esPrimo(numero1));
        System.out.println(numero2 + " ¿es primo?: " + esPrimo(numero2));
    }
}

