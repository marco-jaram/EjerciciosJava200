package semana13;

public class solucion126 {
    public void comer() {
        System.out.println("El animal está comiendo.");
    }

    public void dormir() {
        System.out.println("El animal está durmiendo.");
    }

    public static void main(String[] args) {
        solucion126 animal = new solucion126();
        System.out.println("Comportamiento del animal:");
        animal.comer();
        animal.dormir();
    }
}