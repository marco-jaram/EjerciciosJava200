package semana08;

import java.util.Arrays;

public class solucion77 {
    public static void main(String[] args) {
        int[] arreglo = {5, 2, 8, 1, 9};
        Arrays.sort(arreglo);
        System.out.print("Arreglo ordenado: ");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
