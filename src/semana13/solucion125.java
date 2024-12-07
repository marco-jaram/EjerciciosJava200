package semana13;

public class solucion125 {
    static class Gerente extends solucion124 {
        private String departamento;

        public void setDepartamento(String departamento) {
            this.departamento = departamento;
        }

        public String getDepartamento() {
            return departamento;
        }
    }

    static class Vendedor extends solucion124 {
        private double comision;

        public void setComision(double comision) {
            this.comision = comision;
        }

        public double getComision() {
            return comision;
        }
    }

    static class Secretario extends solucion124 {
        private String despacho;

        public void setDespacho(String despacho) {
            this.despacho = despacho;
        }

        public String getDespacho() {
            return despacho;
        }
    }

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNombre("Ana López");
        gerente.setSalario(50000);
        gerente.setDepartamento("Ventas");

        Vendedor vendedor = new Vendedor();
        vendedor.setNombre("Carlos Ruiz");
        vendedor.setSalario(25000);
        vendedor.setComision(2000);

        Secretario secretario = new Secretario();
        secretario.setNombre("María García");
        secretario.setSalario(20000);
        secretario.setDespacho("Oficina 101");

        System.out.println("Datos de los empleados:");
        System.out.println("\nGerente:");
        System.out.println("Nombre: " + gerente.getNombre());
        System.out.println("Salario: $" + gerente.getSalario());
        System.out.println("Departamento: " + gerente.getDepartamento());

        System.out.println("\nVendedor:");
        System.out.println("Nombre: " + vendedor.getNombre());
        System.out.println("Salario: $" + vendedor.getSalario());
        System.out.println("Comisión: $" + vendedor.getComision());

        System.out.println("\nSecretario:");
        System.out.println("Nombre: " + secretario.getNombre());
        System.out.println("Salario: $" + secretario.getSalario());
        System.out.println("Despacho: " + secretario.getDespacho());
    }
}
