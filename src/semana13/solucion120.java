package semana13;
public class solucion120 {
    protected String marca;
    protected String modelo;

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

    public static void main(String[] args) {
        solucion120 vehiculo = new solucion120();
        vehiculo.setMarca("Toyota");
        vehiculo.setModelo("Corolla");
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Modelo: " + vehiculo.getModelo());
    }
}