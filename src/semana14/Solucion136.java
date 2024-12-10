package semana14;

public class Solucion136 {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Gerente(5000, 1000);  // Salario base + bono
        empleados[1] = new Vendedor(2000, 500);  // Salario base + comisión
        empleados[2] = new Secretario(2500);     // Salario fijo

        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Salario del empleado " + (i+1) + ": " + empleados[i].calcularSalario());
        }
    }
}

class Gerente extends Empleado {
    private double salarioBase;
    private double bono;

    public Gerente(double salarioBase, double bono) {
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
}

class Vendedor extends Empleado {
    private double salarioBase;
    private double comision;

    public Vendedor(double salarioBase, double comision) {
        this.salarioBase = salarioBase;
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comision;
    }
}

class Secretario extends Empleado {
    private double salarioFijo;

    public Secretario(double salarioFijo) {
        this.salarioFijo = salarioFijo;
    }

    @Override
    public double calcularSalario() {
        return salarioFijo;
    }
}
