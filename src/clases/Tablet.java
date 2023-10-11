package clases;

/**
 *The tablet class is for the purpose of identifying the quantities of tablets
 * available for the loan and their status.
 */
public class Tablet {

    private int id_tab;
    
    private String trademark;
    
    private String ubication;

    private String available;

   /**
     * @param id_tab Indicates the id of computers
     *
     * @param trademark It represents the brand of the computers
     *
     * @param ubication An indicator that signals whether computers of this
     * type are available for use.
     * @param available An indicator that signals whether computers of this
     * type are available for use.
     */
    public Tablet(int id_tab, String trademark, String ubication, String available) {
        this.id_tab = id_tab;
        this.trademark = trademark;
        this.ubication = ubication;
        this.available = available;
    }

    public Tablet() {
    }

    public int getId_tab() {
        return id_tab;
    }

    public void setId_tab(int id_tab) {
        this.id_tab = id_tab;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getUbication() {
        return ubication;
    }

    public void setUbication(String ubication) {
        this.ubication = ubication;
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
