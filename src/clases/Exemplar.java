package clases;
/**
 * The "Exemplar" class represents a type of book in the library
 */
public class Exemplar  {

    private int page;

    private String code;

    private Boolean available;
      /**
     * @param page //Number of pages in the exemplar
     * @param code //Unique identification code the exemplar
     * @param available //Indicates if the exemplar is available for loan
     */
    public Exemplar(int page, String code, Boolean available) {
        this.page = page;
        this.code = code;
        this.available = available;
    }

    public Exemplar() {
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
       /**
     * This method provides additional details (specific information) about the
     * exemplar
     */
    public void details() {
    }
}
