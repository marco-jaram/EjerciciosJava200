package semana12;

public class solucion113 {
    private double largo;
    private double ancho;

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getLargo() {
        return largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAncho() {
        return ancho;
    }

    public double calcularArea() {
        return largo * ancho;
    }

    public double calcularPerimetro() {
        return 2 * (largo + ancho);
    }

    public static void main(String[] args) {
        solucion113 rectangulo = new solucion113();
        rectangulo.setLargo(10);
        rectangulo.setAncho(5);
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
    }
}
