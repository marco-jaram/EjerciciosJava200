package semana12;

public class solucion116 {
    protected String nombre;
    private double saldo;
    protected String tipo;

    protected void depositar(double cantidad) {
        saldo += cantidad;
    }

    protected void retirar(double cantidad) {
        saldo -= cantidad;
    }

    protected double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        solucion116 cuenta = new solucion116();
        cuenta.depositar(1000);
        cuenta.retirar(200);
        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }
}

