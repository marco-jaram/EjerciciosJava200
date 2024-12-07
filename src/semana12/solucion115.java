package semana12;

public class solucion115 extends solucion113 {
    @Override
    public double calcularArea() {
        return getLargo() * getLargo();
    }

    public static void main(String[] args) {
        solucion115 cuadrado = new solucion115();
        cuadrado.setLargo(5);
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
    }
}
