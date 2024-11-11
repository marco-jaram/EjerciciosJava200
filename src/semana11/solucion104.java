package semana11;

public class solucion104 {
    public static int sumarNaturales(int num) {
        int suma = 0;
        for (int i = 1; i <= num; i++) {
            suma += i;
        }
        return suma;
    }

    public static void main(String[] args) {
        int numero = 5;
        System.out.println("La suma de los números naturales hasta " + numero +
                " es: " + sumarNaturales(numero));
    }
}
