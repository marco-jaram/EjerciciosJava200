package semana12;

public class solucion119 {
    public String marca;
    public String modelo;
    public int anio;
    public String color;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setAño(int año) {
        this.anio = año;
    }

    public int getAño() {
        return anio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        solucion119 coche = new solucion119();
        coche.setMarca("Toyota");
        coche.setModelo("Corolla");
        coche.setAño(2023);
        coche.setColor("Rojo");

        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Año: " + coche.getAño());
        System.out.println("Color: " + coche.getColor());
    }
}
