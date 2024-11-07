package semana10;

public class solucion93 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRadio(5.0);
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Circunferencia: " + circulo.calcularCircunferencia());
    }

    public static class Circulo {
        private double radio;

        public void setRadio(double radio) {
            this.radio = radio;
        }

        public double calcularArea() {
            return Math.PI * radio * radio;
        }

        public double calcularCircunferencia() {
            return 2 * Math.PI * radio;
        }
    }
}

