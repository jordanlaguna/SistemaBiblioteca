   package clases;

/**
 * The Computer class is a type of library equipment, specifically a computer
 * This class inherits from the Equipment class, which means it shares some
 * common features with other types of equipment in the library
 */
public class Computadora  {
    private int id;
    
    private String trademark;
    
    private String ubication;

    private String available;

   /**
     * @param id Indicates the identifier of computers of this type.
     *available in the library
     * 
     * @param ubication Indicates the location of computers of this type.
     *available in the library
     *
     * @param trademark It represents the brand of the computers
     *
     * @param available An indicator that signals whether computers of this
     * type are available for use.
     * 
     */
    public Computadora(Integer id, String trademark, String ubication, String available) {     
        this.id = id;
        this.trademark = trademark;
        this.ubication = ubication;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUbication() {
        return ubication;
    }

    public void setUbication(String ubication) {
        this.ubication = ubication;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    /**
     * This method is designed to search for computer drives in the library.
     */
    public void unitSearch() {
    }
}
     