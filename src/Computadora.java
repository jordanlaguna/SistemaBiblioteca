
public class Computadora extends Equipo {

    /**
     * The Computer class is a type of library equipment, specifically a
     * computer This class inherits from the Equipment class, which means it
     * shares some common features with other types of equipment in the library
     */
    private int cantidad;

    private String marca;

    private Boolean disponible;

    /**
     * @param cantidad Indicates the quantity of computers of this type
     * available in the library
     *
     * @param marca  It represents the brand of the computers
     *
     * @param disponible An indicator that signals whether computers of this
     * type are available for use.
     */
    public Computadora(int cantidad, String marca, Boolean disponible) {
        this.cantidad = cantidad;
        this.marca = marca;
        this.disponible = disponible;
    }

    public Computadora() {
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
     * This method is designed to search for computer drives in the library.
     */
    public void buscarUnidad() {
    }
}
