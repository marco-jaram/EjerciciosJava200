package semana14;

public class Solucion130 {
    public static void main(String[] args) {
        Animal[] animales = new Animal[3];
        animales[0] = new Perro();
        animales[1] = new Gato();
        animales[2] = new Pajaro();

        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}

class Animal {
    public void hacerSonido() {
        System.out.println("Sonido genérico de animal");
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }
}

class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla.");
    }
}

class Pajaro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El pájaro canta.");
    }
}
