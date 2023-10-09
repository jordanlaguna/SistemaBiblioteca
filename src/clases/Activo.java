package clases;
import java.util.Date;
import java.util.List;
/**
 * The Asset class that represents the system, related to asset tracking,
 * management of resources present in the library.
 *
 */
public class Activo  {

    private Date date;

    private List unit;

    private List user;

    private List copy;
     /**
     *
     * @param date= A Date type attribute that stores the date associated with
     * the asset. This date could represent the date the asset was acquired,
     * registered, or some other relevant time.
     *
     * @param unit = An attribute of type List (list) that is related to
     * units.
     *
     * @param user = A List type attribute that appears to be related to
     * users. As with the units list, the type of elements in this list is not
     * specified in the code.
     * @param copy Es una lista de libros
     */

    public Activo(Date date, List unit, List user, List copy) {
        this.date = date;
        this.unit = unit;
        this.user = user;
        this.copy = copy;
    }
    
    public Activo() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List getUnit() {
        return unit;
    }

    public void setUnit(List unit) {
        this.unit = unit;
    }

    public List getUser() {
        return user;
    }

    public void setUser(List user) {
        this.user = user;
    }

    public List getCopy() {
        return copy;
    }

    public void setCopy(List copy) {
        this.copy = copy;
    }
     /**
     * This method is used to search for information in the system. 
     * Depending on the implementation, this method might accept search parameters that specify what is being searched and how it should be searched.
     */ 
    public void search() {
    }
    /**
     * This method is used to modify existing records or data in the system.
     */
    public void update() {
    }
}
