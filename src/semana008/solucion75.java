package semana008;

public class solucion75 {
    public static void main(String[] args) {
        int[] arreglo = {10, 20, 30, 40, 50};
        int elementoBuscado = 30;
        int posicion = -1;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elementoBuscado) {
                posicion = i;
                break;
            }
        }
        if (posicion != -1) {
            System.out.println("El elemento " + elementoBuscado + " se encuentra en la posición " + posicion);
        } else {
            System.out.println("El elemento " + elementoBuscado + " no se encuentra en el arreglo.");
        }
    }
}
