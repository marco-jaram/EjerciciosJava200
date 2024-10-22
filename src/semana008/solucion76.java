package semana008;

public class solucion76 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5};
        int[] arregloInvertido = new int[arreglo.length];
        for (int i = 0, j = arreglo.length - 1; i < arreglo.length; i++, j--) {
            arregloInvertido[i] = arreglo[j];
        }
        System.out.println("Arreglo original: ");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println("\nArreglo invertido: ");
        for (int num : arregloInvertido) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
