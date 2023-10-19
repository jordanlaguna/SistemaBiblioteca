package clases;

/**
 * The class Book represents a book within the library
 */
import java.util.Date;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Libro {

    private Integer isbn;

    private String title;

    private String authorBook;

    private String editorial;
    
    private String available;

    private Date releaseDate;

    /**
     * @param isbn // The ISBN number of the book.
     * @param title //The title of the book.
     * @param authorBook //The author of the book.
     * @param editorial //The publisher of the book.
     * @param available //The publisher of the book.
     * @param releaseDate //The release date of the book.
     */
   
 
    public Libro(Integer isbn, String title, String authorBook, 
            String editorial, String available, Date releaseDate) {
        this.isbn = isbn;
        this.title = title;
        this.authorBook = authorBook;
        this.editorial = editorial;
        this.available = available;
        this.releaseDate = releaseDate;
        this.available = available;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
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
    
    public void searchBook(TextField txt_search, TableView<Libro> tableView){
         FilteredList<Libro> filterData = new FilteredList<>(tableView.
                getItems(), p -> true);

        txt_search.textProperty().addListener((observable, oldValue, newValue) 
                -> {
            filterData.setPredicate(libro -> {
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }
                String typeText = newValue.toLowerCase();
                 if (libro.getAuthorBook().toLowerCase().contains(typeText)
                        || libro.getAvailable().toLowerCase().
                                contains(typeText)
                        || libro.getEditorial().toLowerCase().contains(typeText)
                        || libro.getTitle().toLowerCase().contains(typeText)
                        || String.valueOf(libro.getIsbn()).toLowerCase().
                                contains(typeText)) {
                    return true;
                }
                return false;
            });
        });

        SortedList<Libro> sortedList = new SortedList<>(filterData);
        sortedList.comparatorProperty().bind(tableView.comparatorProperty());
        tableView.setItems(sortedList);
    }    

}
