package semana14;

public class Solucion138 {
    public static void main(String[] args) {
        Instrumento138 [] instrumentos = new Instrumento138 [3];
        instrumentos[0] = new Guitarra138 ();
        instrumentos[1] = new Piano138 ();
        instrumentos[2] = new Violin138 ();

        for (Instrumento138  instrumento : instrumentos) {
            instrumento.tocar();
        }
    }
}

abstract class Instrumento138 {
    public abstract void tocar();
}

class Guitarra138 extends Instrumento138 {
    @Override
    public void tocar() {
        System.out.println("Tocando la guitarra rasgando las cuerdas.");
    }
}

class Piano138 extends Instrumento138  {
    @Override
    public void tocar() {
        System.out.println("Tocando el piano presionando las teclas.");
    }
}

class Violin138  extends Instrumento138  {
    @Override
    public void tocar() {
        System.out.println("Tocando el violín con el arco.");
    }
}
