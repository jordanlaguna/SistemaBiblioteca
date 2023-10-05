package clases;

/**
 * The Library class represents the library that contains books and equipment.
 */
public class Biblioteca {

    private int cantidadLibros;

    private int cantidadEquipos;

    private String nombre;

    public Biblioteca(int cantidadLibros, int cantidadEquipos, String nombre) {
        this.cantidadLibros = cantidadLibros;
        this.cantidadEquipos = cantidadEquipos;
        this.nombre = nombre;
    }

    public Biblioteca() {
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }

    public int getCantidadEquipos() {
        return cantidadEquipos;
    }

    public void setCantidadEquipos(int cantidadEquipos) {
        this.cantidadEquipos = cantidadEquipos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Method to handle equipment registration in the library.
     */
    public void equipo() {
    }

    /**
     * Method to manage the loan of the library resources.
     */
    public void prestamo() {
    }

    /**
     * Method to manage the registration of books in the library.
     */
    public void libro() {
    }
}
