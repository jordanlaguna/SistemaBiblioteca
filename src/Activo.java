
import java.util.Date;
import java.util.List;

/**
 * The Asset class that represents the system, related to asset tracking,
 * management of resources present in the library.
 *
 */
public class Activo {

    private Date fecha;

    private List unidad;

    private List usuario;

    private List ejemplares;

    /**
     *
     * @param fecha= A Date type attribute that stores the date associated with
     * the asset. This date could represent the date the asset was acquired,
     * registered, or some other relevant time.
     *
     * @param unidad = An attribute of type List (list) that is related to
     * units.
     *
     * @param usuario = A List type attribute that appears to be related to
     * users. As with the units list, the type of elements in this list is not
     * specified in the code.
     * @param ejemplares Es una lista de libros
     */
    public Activo(Date fecha, List unidad, List usuario, List ejemplares) {
        this.fecha = fecha;
        this.unidad = unidad;
        this.usuario = usuario;
        this.ejemplares = ejemplares;
    }

    public Activo() {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List getUnidad() {
        return unidad;
    }

    public void setUnidad(List unidad) {
        this.unidad = unidad;
    }

    public List getUsuario() {
        return usuario;
    }

    public void setUsuario(List usuario) {
        this.usuario = usuario;
    }

    public List getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(List ejemplares) {
        this.ejemplares = ejemplares;
    }
     /**
     * This method is used to search for information in the system. 
     * Depending on the implementation, this method might accept search parameters that specify what is being searched and how it should be searched.
     */
    public void buscar() {
    }
     /**
     * This method is used to modify existing records or data in the system.
     */
    public void modificar() {
    }
}
