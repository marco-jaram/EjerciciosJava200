package semana08;

public class solucion72 {
    public static void main(String[] args) {
        int[] arreglo = {5, 8, 2, 11, 3};
        int mayor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }
        System.out.println("El número mayor en el arreglo es: " + mayor);
    }
}
