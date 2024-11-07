package semana10;

public class solucion91 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Marco");
        persona.setEdad(38);
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }

    public static class Persona {
        private String nombre;
        private int edad;

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }
    }
}