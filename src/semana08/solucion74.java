package semana08;

public class solucion74 {
    public static void main(String[] args) {
        int[] arreglo = {10, 20, 30, 40, 50};
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        double promedio = (double) suma / arreglo.length;
        System.out.println("El promedio de los elementos del arreglo es: " + promedio);
    }
}
