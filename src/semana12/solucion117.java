package semana12;

public class solucion117 {
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
        solucion117 cuenta = new solucion117();
        cuenta.depositar(1500);
        cuenta.retirar(300);
        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }
}
