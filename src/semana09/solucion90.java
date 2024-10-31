package semana09;

public class solucion90 {
    public static void main(String[] args) {
        String texto = "Hola Mundo Java";
        char[] caracteres = texto.toCharArray();
        char[] resultado = new char[caracteres.length];

        // Primero copiamos los espacios
        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] == ' ') {
                resultado[i] = ' ';
            }
        }

        // Luego invertimos los caracteres no espacios
        int j = resultado.length - 1;
        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] != ' ') {
                while (resultado[j] == ' ') {
                    j--;
                }
                resultado[j] = caracteres[i];
                j--;
            }
        }

        System.out.println("Texto original: " + texto);
        System.out.println("Texto invertido con espacios: " + new String(resultado));
    }
}
