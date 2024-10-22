package semana008;

public class solucion79 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int contadorPares = 0;
        for (int num : arreglo) {
            if (num % 2 == 0) {
                contadorPares++;
            }
        }
        System.out.println("La cantidad de números pares en el arreglo es: " + contadorPares);
    }
}