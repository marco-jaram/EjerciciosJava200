package semana10;

public class solucion95 {
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.setTitulo("Don Quijote");
        libro.setAutor("Miguel de Cervantes");
        libro.setAño(1605);
        libro.setISBN("978-84-376-0494-7");

        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Año: " + libro.getAño());
        System.out.println("ISBN: " + libro.getISBN());
    }

    public static class Libro {
        private String titulo;
        private String autor;
        private int año;
        private String ISBN;

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public void setAño(int año) {
            this.año = año;
        }

        public void setISBN(String ISBN) {
            this.ISBN = ISBN;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public int getAño() {
            return año;
        }

        public String getISBN() {
            return ISBN;
        }
    }
}
