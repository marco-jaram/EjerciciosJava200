package semana12;

public class solucion114 {
    private double largo;
    private double ancho;

    public double calcularArea() {
        return largo * ancho;
    }

    public double calcularPerimetro() {
        return 2 * (largo + ancho);
    }

    public static void main(String[] args) {
        solucion114 rectangulo = new solucion114();
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
    }
}
