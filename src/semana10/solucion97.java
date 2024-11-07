package semana10;

public class solucion97 {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.setMarca("Toyota");
        coche.setModelo("Corolla");
        coche.setAño(2023);
        coche.setColor("Rojo");

        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Año: " + coche.getAño());
        System.out.println("Color: " + coche.getColor());
    }

    public static class Coche {
        private String marca;
        private String modelo;
        private int año;
        private String color;

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public void setAño(int año) {
            this.año = año;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }

        public int getAño() {
            return año;
        }

        public String getColor() {
            return color;
        }
    }
}
