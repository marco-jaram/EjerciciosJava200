package semana12;

public class solucion112 extends solucion111 {
    protected String curso;

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public static void main(String[] args) {
        solucion112 estudiante = new solucion112();
        estudiante.setNombre("Pedro");
        estudiante.setEdad(20);
        estudiante.setCurso("Informática");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Curso: " + estudiante.getCurso());
    }
}