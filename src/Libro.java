
import java.util.Date;
/**
 * The class Book represents a book within the library
 */
public class Libro {

    private String ISBN;

    private String titulo;

    private String autorLibro;

    private String editorial;

    private Date fechaLanzamiento;
    /**
     * @param ISBN // The ISBN number of the book.
     * @param titulo //The title of the book.
     * @param autorLibro //The author of the book.
     * @param editorial //The publisher of the book.
     * @param fechaLanzamiento //The release date of the book.
     */
    public Libro(String ISBN, String titulo, String autorLibro, String editorial, Date fechaLanzamiento) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autorLibro = autorLibro;
        this.editorial = editorial;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Libro() {
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
     /**
     * Conduct a search related to the book (search by title, author,
     * availability, etc.).
     */
    public void buscar() {
    }
}
