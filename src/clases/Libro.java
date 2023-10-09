package clases;
/**
 * The class Book represents a book within the library
 */
import java.util.Date;
public class Libro {

    private String ISBN;

    private String title;

    private String author;

    private String editorial;

    private Date releaseDate;
    /**
     * @param ISBN // The ISBN number of the book.
     * @param title //The title of the book.
     * @param author //The author of the book.
     * @param editorial //The publisher of the book.
     * @param releaseDate //The release date of the book.
     */
    

    public Libro(String ISBN, String title, String author, String editorial, Date releaseDate) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.editorial = editorial;
        this.releaseDate = releaseDate;
    }

    public Libro() {
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
    /**
     * Conduct a search related to the book (search by title, author,
     * availability, etc.).
     */
    public void search() {
    }
}
