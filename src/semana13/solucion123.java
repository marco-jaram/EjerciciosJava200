package semana13;

public class solucion123 {
    // Clase interna para Rectángulo
    static class Rectangulo extends solucion122 {
        private double base;
        private double altura;

        public Rectangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        @Override
        public double calcularArea() {
            return base * altura;
        }
    }

    // Clase interna para Círculo
    static class Circulo extends solucion122 {
        private double radio;

        public Circulo(double radio) {
            this.radio = radio;
        }

        @Override
        public double calcularArea() {
            return Math.PI * radio * radio;
        }
    }

    // Clase interna para Triángulo
    static class Triangulo extends solucion122 {
        private double base;
        private double altura;

        public Triangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        @Override
        public double calcularArea() {
            return (base * altura) / 2;
        }
    }

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5, 3);
        Circulo circulo = new Circulo(2);
        Triangulo triangulo = new Triangulo(4, 6);

        System.out.println("Áreas de figuras geométricas:");
        System.out.println("Rectángulo: " + rectangulo.calcularArea());
        System.out.println("Círculo: " + circulo.calcularArea());
        System.out.println("Triángulo: " + triangulo.calcularArea());
    }
}
