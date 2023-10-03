
/**
 * The class 'Equipo' represents a type of resource found in the library, such
 * as computer equipment or electronic devices
 */
public class Equipo {

    /**
     * @param cantidad //The number of equipment available in the library
     */
    private int cantidad;

    public Equipo() {
    }

    public Equipo(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * This method is used to display detailed information about the tablets
     * (equipment) available in the library
     */

    public void verTable() {
    }

    /**
     * This method is used to display detailed information about the computers
     * (equipment) available in the library
     */
    public void verComputadora() {
    }
}
