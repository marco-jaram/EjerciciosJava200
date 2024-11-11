package semana11;

public class solucion108 {
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 36;
        System.out.println("El MCD de " + num1 + " y " + num2 + " es: " +
                calcularMCD(num1, num2));
    }
}
