package semana008;

public class solucion71 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5};
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        System.out.println("La suma de los elementos del arreglo es: " + suma);
    }
}