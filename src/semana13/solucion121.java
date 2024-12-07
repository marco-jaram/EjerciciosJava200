package semana13;

public class solucion121 extends solucion120 {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        solucion121 coche = new solucion121();
        coche.setMarca("Ford");
        coche.setModelo("Mustang");
        coche.setColor("Rojo");

        System.out.println("Coche:");
        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Color: " + coche.getColor());
    }
}
