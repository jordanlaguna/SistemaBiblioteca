package clases;

public class Tablet extends Equipo  {

    private int cantidad;

    private String marca;

    private Boolean disponible;


    public Tablet(int cantidad, String marca, Boolean disponible) {
        this.cantidad = cantidad;
        this.marca = marca;
        this.disponible = disponible;
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

    public void buscarUnidad() {
    }
}
