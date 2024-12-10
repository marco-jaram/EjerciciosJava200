package semana14;

public class Solucion137 {
    public static void main(String[] args) {
        InstrumentoMusical137[] instrumentos = new InstrumentoMusical137[3];
        instrumentos[0] = new Piano137();
        instrumentos[1] = new Guitarra137();
        instrumentos[2] = new Violin137();

        for (InstrumentoMusical137 instrumento : instrumentos) {
            instrumento.tocar();
        }
    }
}

class InstrumentoMusical137 {
    public void tocar() {
        System.out.println("Tocando instrumento musical...");
    }
}

class Piano137 extends InstrumentoMusical137 {
    @Override
    public void tocar() {
        System.out.println("Se toca el piano pulsando las teclas.");
    }
}

class Guitarra137 extends InstrumentoMusical137 {
    @Override
    public void tocar() {
        System.out.println("Se toca la guitarra rasgando las cuerdas.");
    }
}

class Violin137 extends InstrumentoMusical137 {
    @Override
    public void tocar() {
        System.out.println("Se toca el violín con el arco.");
    }
}