package semana09;

public class solucion88 {
    public static void main(String[] args) {
        String texto = "uno,dos,tres,dos,cuatro,dos";
        String[] partes = texto.split(",");
        int contador = 0;
        for (String parte : partes) {
            if (parte.equals("dos")) {
                contador++;
            }
        }
        System.out.println("La palabra 'dos' aparece " + contador + " veces");
    }
}
