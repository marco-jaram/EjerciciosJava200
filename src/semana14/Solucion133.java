package semana14;

public class Solucion133 {
    public static void main(String[] args) {
        Guitarra guitarra = new Guitarra();
        System.out.println(guitarra.tocar());
    }
}

class InstrumentoMusical {
    public String tocar() {
        return "Tocando instrumento...";
    }
}

class Guitarra extends InstrumentoMusical {
    @Override
    public String tocar() {
        return "Se toca la guitarra rasgando las cuerdas.";
    }
}
