package semana11;

public class solucion109 {
    public static boolean esPalindromo(String cadena) {
        cadena = cadena.toLowerCase().replaceAll("\\s+", "");
        int longitud = cadena.length();

        for (int i = 0; i < longitud / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String texto1 = "Anita lava la tina";
        String texto2 = "Hola Mundo";
        System.out.println("¿Es palíndromo? (texto1): " + esPalindromo(texto1));
        System.out.println("¿Es palíndromo? (texto2): " + esPalindromo(texto2));
    }
}
