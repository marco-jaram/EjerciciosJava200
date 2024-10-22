package semana008;

public class solucion73 {
    public static void main(String[] args) {
        int[] arreglo = {5, 8, 2, 11, 3};
        int menor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < menor) {
                menor = arreglo[i];
            }
        }
        System.out.println("El número menor en el arreglo es: " + menor);
    }
}
