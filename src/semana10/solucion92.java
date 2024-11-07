package semana10;

public class solucion92 {
    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo();
        rect.setLargo(5.0);
        rect.setAncho(3.0);
        System.out.println("Área: " + rect.calcularArea());
        System.out.println("Perímetro: " + rect.calcularPerimetro());
    }

    public static class Rectangulo {
        private double largo;
        private double ancho;

        public void setLargo(double largo) {
            this.largo = largo;
        }

        public void setAncho(double ancho) {
            this.ancho = ancho;
        }

        public double calcularArea() {
            return largo * ancho;
        }

        public double calcularPerimetro() {
            return 2 * (largo + ancho);
        }
    }
}