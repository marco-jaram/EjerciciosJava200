package semana10;

public class solucion99 {
    public static void main(String[] args) {
        // Probando la clase Producto
        Producto producto = new Producto();
        producto.setNombre("Laptop");
        producto.setPrecio(999.99);
        producto.setCantidad(2);
        producto.setCategoria("Electrónica");

        System.out.println("Detalles del producto:");
        System.out.println(producto.obtenerDetalles());
        System.out.println("Precio total: " + producto.calcularPrecioTotal());

        // Probando la clase Triangulo
        Triangulo triangulo = new Triangulo();
        triangulo.setLado1(3.0);
        triangulo.setLado2(4.0);
        triangulo.setLado3(5.0);

        System.out.println("\nTriángulo:");
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());
        System.out.println("Área: " + triangulo.calcularArea());
    }

    public static class Producto {
        private String nombre;
        private double precio;
        private int cantidad;
        private String categoria;

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }

        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }

        public double calcularPrecioTotal() {
            return precio * cantidad;
        }

        public String obtenerDetalles() {
            return "Nombre: " + nombre + ", Precio: " + precio + ", " +
                    "Cantidad: " + cantidad + ", Categoría: " + categoria;
        }
    }

    public static class Triangulo {
        private double lado1;
        private double lado2;
        private double lado3;

        public void setLado1(double lado1) {
            this.lado1 = lado1;
        }

        public void setLado2(double lado2) {
            this.lado2 = lado2;
        }

        public void setLado3(double lado3) {
            this.lado3 = lado3;
        }

        public double calcularPerimetro() {
            return lado1 + lado2 + lado3;
        }

        public double calcularArea() {
            double s = (lado1 + lado2 + lado3) / 2;
            return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        }
    }
}
