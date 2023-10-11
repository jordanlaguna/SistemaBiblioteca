package clases;

/**
 *The tablet class is for the purpose of identifying the quantities of tablets
 * available for the loan and their status.
 */
public class Tablet {

    private int quantity;

    private String trademark;

    private String ubication;

   /**
     * @param quantity Indicates the quantity of computers of this type
     * available in the library
     *
     * @param trademark It represents the brand of the computers
     *
     * @param ubication An indicator that signals whether computers of this
     * type are available for use.
     */

    public Tablet(int quantity, String trademark, String ubication) {
        this.quantity = quantity;
        this.trademark = trademark;
        this.ubication = ubication;
    }


    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUbication() {
        return ubication;
    }

    public void setUbication(String ubication) {
        this.ubication = ubication;
    }

     /**
     * This method is designed to search for computer drives in the library.
     */
    public void unitSearch() {
    }
}
