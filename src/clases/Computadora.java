package clases;

/**
 * The Computer class is a type of library equipment, specifically a computer
 * This class inherits from the Equipment class, which means it shares some
 * common features with other types of equipment in the library
 */
public class Computadora extends Equipo {

    private int quantity;

    private String trademark;

    private Boolean available;

   /**
     * @param quantity Indicates the quantity of computers of this type
     * available in the library
     *
     * @param trademark It represents the brand of the computers
     *
     * @param available An indicator that signals whether computers of this
     * type are available for use.
     * @param quantiy
     */

    public Computadora(int quantity, String trademark, Boolean available, 
            int quantiy) {
        super(quantity);
        this.quantity = quantity;
        this.trademark = trademark;
        this.available = available;
    }

   
   

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
     /**
     * This method is designed to search for computer drives in the library.
     */
    public void unitSearch() {
    }
}
