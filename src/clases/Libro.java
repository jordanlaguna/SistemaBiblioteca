package clases;

/**
 * The class Book represents a book within the library
 */
import java.util.Date;

public class Libro {

    private Integer isbn;

    private String title;

    private String authorBook;

    private String editorial;

    private Date releaseDate;

    /**
     * @param isbn // The ISBN number of the book.
     * @param title //The title of the book.
     * @param authorBook //The author of the book.
     * @param editorial //The publisher of the book.
     * @param releaseDate //The release date of the book.
     */
    public Libro(Integer isbn, String title, String authorBook, String editorial
            , String available, Date releaseDate) {
    public Libro(Integer isbn, String title, String authorBook, String editorial, Date releaseDate) {

        this.isbn = isbn;
        this.title = title;
        this.authorBook = authorBook;
        this.editorial = editorial;
        this.releaseDate = releaseDate;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
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

    }

    public Object getReleaseData() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }
    /**
     * @param ISBN        // The ISBN number of the book.
     * @param title       //The title of the book.
     * @param author      //The author of the book.
     * @param editorial   //The publisher of the book.
     * @param releaseDate //The release date of the book.
     */

}
