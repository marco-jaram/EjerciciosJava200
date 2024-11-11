package semana11;

public class solucion107 {
    public static int contarVocales(String cadena) {
        int contador = 0;
        cadena = cadena.toLowerCase();
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' ||
                    caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        String texto = "Hola Mundo";
        System.out.println("Número de vocales: " + contarVocales(texto));
    }
}

