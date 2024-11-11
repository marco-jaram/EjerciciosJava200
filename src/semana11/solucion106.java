package semana11;

public class solucion106 {
    public static boolean todosPares(int[] numeros) {
        for (int num : numeros) {
            if (num % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numeros1 = {2, 4, 6, 8, 10};
        int[] numeros2 = {2, 4, 5, 8, 10};
        System.out.println("¿Todos son pares? (numeros1): " + todosPares(numeros1));
        System.out.println("¿Todos son pares? (numeros2): " + todosPares(numeros2));
    }
}
