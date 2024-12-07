package semana13;

public class solucion124 {
    protected String nombre;
    protected double salario;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public static void main(String[] args) {
        solucion124 empleado = new solucion124();
        empleado.setNombre("Juan Pérez");
        empleado.setSalario(30000);

        System.out.println("Datos del empleado:");
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Salario: $" + empleado.getSalario());
    }
}
