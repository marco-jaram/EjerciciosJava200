package semana13;

public class solucion127 {
    static class Perro extends solucion126 {
        public void ladrar() {
            System.out.println("El perro está ladrando.");
        }
    }

    static class Gato extends solucion126 {
        public void maullar() {
            System.out.println("El gato está maullando.");
        }
    }

    static class Pajaro extends solucion126 {
        public void cantar() {
            System.out.println("El pájaro está cantando.");
        }
    }

    public static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato();
        Pajaro pajaro = new Pajaro();

        System.out.println("Comportamiento del Perro:");
        perro.comer();
        perro.dormir();
        perro.ladrar();

        System.out.println("\nComportamiento del Gato:");
        gato.comer();
        gato.dormir();
        gato.maullar();

        System.out.println("\nComportamiento del Pájaro:");
        pajaro.comer();
        pajaro.dormir();
        pajaro.cantar();
    }
}