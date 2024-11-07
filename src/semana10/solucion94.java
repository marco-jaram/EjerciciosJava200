package semana10;

public class solucion94 {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("María");
        estudiante.setEdad(20);
        estudiante.setCurso("Informática");
        System.out.println("Estudiante: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Curso: " + estudiante.getCurso());
    }

    public static class Estudiante {
        private String nombre;
        private int edad;
        private String curso;

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public void setCurso(String curso) {
            this.curso = curso;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        public String getCurso() {
            return curso;
        }
    }
}
