package semana008;

public class solucion80 {

    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int suma = 0;
        for (int i = 0; i < arreglo.length; i += 2) {
            suma += arreglo[i];
        }
        System.out.println("La suma de los elementos en posiciones pares es: " + suma);
    }
}
