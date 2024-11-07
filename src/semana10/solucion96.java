package semana10;

public class solucion96 {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.setNombre("Carlos");
        empleado.setSalario(2500.0);
        empleado.setPuesto("Desarrollador");

        System.out.println("Puesto: " + empleado.getPuesto());
        System.out.println("Salario anual: " + empleado.calcularSalarioAnual());
    }

    public static class Empleado {
        private String nombre;
        private double salario;
        private String puesto;

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public void setPuesto(String puesto) {
            this.puesto = puesto;
        }

        public double calcularSalarioAnual() {
            return salario * 12;
        }

        public String getPuesto() {
            return puesto;
        }
    }
}
