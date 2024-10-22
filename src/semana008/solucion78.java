package semana008;

import java.util.Arrays;

public class solucion78 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 2, 4, 5, 3};
        int n = arreglo.length;
        Arrays.sort(arreglo);
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arreglo[i] != arreglo[i + 1]) {
                temp[j++] = arreglo[i];
            }
        }
        temp[j++] = arreglo[n - 1];
        int[] resultado = Arrays.copyOf(temp, j);
        System.out.print("Arreglo sin duplicados: ");
        for (int num : resultado) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
