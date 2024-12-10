package semana14;

public class Solucion129 {
    public static void main(String[] args) {
        Piano piano = new Piano();
        piano.tocar();
    }
}

class Instrumento {
    public void tocar() {
        System.out.println("Tocando el instrumento...");
    }
}

class Piano extends Instrumento {
    @Override
    public void tocar() {
        System.out.println("Se toca el piano pulsando las teclas.");
    }
}
