package semana14;

public class Solucion132 {
    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo(5, 3);
        Circulo circ = new Circulo(2);
        Triangulo tri = new Triangulo(4, 6);

        System.out.println("Área del rectángulo: " + rect.calcularArea());
        System.out.println("Área del círculo: " + circ.calcularArea());
        System.out.println("Área del triángulo: " + tri.calcularArea());
    }
}

class Rectangulo implements Figura {
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

class Circulo implements Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

class Triangulo implements Figura {
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
