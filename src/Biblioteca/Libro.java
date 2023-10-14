package Biblioteca;
/**
 * La clase Libro representa a un libro en el sistema de préstamo de libros.
 */
public class Libro {
    // Atributos de la clase
    private String isbn;
    private String titulo;
    private String autor;
    private boolean disponible;
    private String ubicacion;

    /**
     * Constructor de la clase Libro.
     * @param isbn El código o ISBN del libro.
     * @param titulo El título del libro.
     * @param autor El autor del libro.
     * @param disponible Si el libro está o no disponible para préstamo.
     * @param ubicacion Donde se encuentra el libro en la biblioteca.
     */
    public Libro(String isbn, String titulo, String autor, boolean disponible, String ubicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
        this.ubicacion = ubicacion;
    }

    // Getters y Setters
    /**
     * @return El código o ISBN del libro.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn El nuevo código o ISBN del libro.
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return El título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo El nuevo título del libro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return El autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor El nuevo autor del libro.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return Si el libro está o no disponible para préstamo.
     */
    public boolean isDisponible() {
        return disponible;
    }

    /**
     * @param disponible El nuevo estado de disponibilidad del libro.
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    /**
     * @return Donde se encuentra el libro en la biblioteca.
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion La nueva ubicación del libro en la biblioteca.
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
