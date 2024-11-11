package semana11;

public class solucion101 {
    public static boolean esPar(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        int numero1 = 4;
        int numero2 = 7;
        System.out.println(numero1 + " ¿es par?: " + esPar(numero1));
        System.out.println(numero2 + " ¿es par?: " + esPar(numero2));
    }
}
