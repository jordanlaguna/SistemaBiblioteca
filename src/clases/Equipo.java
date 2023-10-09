package clases;
/**
 * The class 'Equipo' represents a type of resource found in the library, such
 * as computer equipment or electronic devices
 */
public class Equipo  {

    private int quantity;
     /**
     * @param quantity //The number of equipment available in the library
     */
    public Equipo(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
      
    /**
     * This method is used to display detailed information about the tablets
     * (equipment) available in the library
     */

    public void seeTable() {
    }

    /**
     * This method is used to display detailed information about the computers
     * (equipment) available in the library
     */
    public void seeComputer() {
    }
}
