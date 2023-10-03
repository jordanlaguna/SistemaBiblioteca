
/**
 *The tablet class is for the purpose of identifying the quantities of tablets
 * available for the loan and their status.
 */
public class Tablet extends Equipo {

    private int cantidad;

    private String marca;

    private Boolean disponible;

    /**
     * @param cantidad= quantity: An integer (int) attribute that stores the
     * number of tablets available.
     * @param marca = brand: A String attribute that stores the brand of the
     * tablets
     * @param disponible = available: An attribute of type Boolean, indicating
     * whether the tablets are available or not.
     */
    public Tablet(int cantidad, String marca, Boolean disponible) {
        this.cantidad = cantidad;
        this.marca = marca;
        this.disponible = disponible;
    }

    public Tablet() {
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
     /**
     * The Unit search function is intended to search if there is any available
     * tablet.
     */
    public void buscarUnidad() {
    }
}
