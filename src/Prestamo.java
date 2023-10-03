
import java.util.Date;
import java.util.List;

/**
 * The Loan class represents the loans in the system, related to the library. In
 * order to manage the loans
 */
public class Prestamo {

    private Date fechaPrestamo;

    private List ejemplares;

    private Date fechaDevolucion;

    private List unidad;

    private int numPrestamo;

    /**
     *
     * @param fechaPrestamo = A Date type attribute that stores the date the
     * loan was made.
     * @param ejemplares= An attribute of type List (list) that stores items
     * related to the loan.
     * @param fechaDevolucion = An attribute of type Date that stores the date
     * on which the loaned items are expected to be returned.
     * @param unidad = unit: An attribute of type List (list) that is related to
     * units.
     * @param numPrestamo = An integer (int) type attribute that stores a loan
     * number, to uniquely identify this loan in the system.
     */
    public Prestamo(Date fechaPrestamo, List ejemplares, Date fechaDevolucion, List unidad, int numPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
        this.ejemplares = ejemplares;
        this.fechaDevolucion = fechaDevolucion;
        this.unidad = unidad;
        this.numPrestamo = numPrestamo;
    }

    public Prestamo() {
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public List getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(List ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public List getUnidad() {
        return unidad;
    }

    public void setUnidad(List unidad) {
        this.unidad = unidad;
    }

    public int getNumPrestamo() {
        return numPrestamo;
    }

    public void setNumPrestamo(int numPrestamo) {
        this.numPrestamo = numPrestamo;
    }

    /**
     * This function is used to display a list of active loans in the system.
     * Active loans are those that have not yet been repaid or are pending.
     */
    public void verPrestamoActivos() {
    }

    /**
     * This function is used to add new elements or records to the system.
     */
    public void agregar() {
    }

    /**
     * This function is used to search for information in the system. The search
     * could be based on some specific criteria and return relevant results.
     */
    public void buscar() {
    }

    /**
     * This function is used to search for information in the system. The search
     * could be based on some specific criteria and return relevant results.
     */
    public void verDevoluciones() {
    }

    /**
     * This function is to display the notes made at the time of the loan
     */
    public void notas() {
    }

    /**
     * This function is related to the management of users in the system, such
     * as creating, editing or deleting users.
     */
    public void usuarios() {
    }
}
