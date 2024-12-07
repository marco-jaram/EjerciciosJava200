package semana13;

public class solucion128 {
    static abstract class Figura3D {
        public abstract double calcularVolumen();
    }

    static class Esfera extends Figura3D {
        private double radio;

        public Esfera(double radio) {
            this.radio = radio;
        }

        @Override
        public double calcularVolumen() {
            return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
        }
    }

    static class Cilindro extends Figura3D {
        private double radio;
        private double altura;

        public Cilindro(double radio, double altura) {
            this.radio = radio;
            this.altura = altura;
        }

        @Override
        public double calcularVolumen() {
            return Math.PI * Math.pow(radio, 2) * altura;
        }
    }

    static class Cubo extends Figura3D {
        private double lado;

        public Cubo(double lado) {
            this.lado = lado;
        }

        @Override
        public double calcularVolumen() {
            return Math.pow(lado, 3);
        }
    }

    public static void main(String[] args) {
        Esfera esfera = new Esfera(3);
        Cilindro cilindro = new Cilindro(2, 5);
        Cubo cubo = new Cubo(4);

        System.out.println("Cálculo de volúmenes:");
        System.out.println("Volumen de la esfera: " + esfera.calcularVolumen());
        System.out.println("Volumen del cilindro: " + cilindro.calcularVolumen());
        System.out.println("Volumen del cubo: " + cubo.calcularVolumen());
    }
}
