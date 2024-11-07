package semana10;

public class solucion98 {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.depositar(1000.0);
        System.out.println("Saldo después del depósito: " + cuenta.getSaldo());

        cuenta.retirar(300.0);
        System.out.println("Saldo después del retiro: " + cuenta.getSaldo());
    }

    public static class CuentaBancaria {
        private String nombre;
        private double saldo;
        private String tipo;

        public void depositar(double cantidad) {
            saldo += cantidad;
        }

        public void retirar(double cantidad) {
            saldo -= cantidad;
        }

        public double getSaldo() {
            return saldo;
        }
    }
}

