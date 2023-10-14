package clases;

import java.util.Date;
import java.util.List;

/**
 * The return class is used to record returns of items (books or equipment)
 * loaned to users.
 */
public class Devolucion {

    private Date date;

    private Date deliverDate;

    private List unit;

    private List copy;

    private List user;

    /**
     * @param date //The date on which the return was registered
     * @param deliverDate //The date on which the items must be returned
     * @param unit //The list of returned units (books or equipment)
     * @param copy //The list of individual items returned
     * @param user //The list of users who have completed the return.
     */
    public Devolucion(Date date, Date deliverDate, List unit, List copy, 
            List user) {
        this.date = date;
        this.deliverDate = deliverDate;
        this.unit = unit;
        this.copy = copy;
        this.user = user;
    }

    public Devolucion() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDeliverDate() {
        return deliverDate;
    }

    public void setDeliverDate(Date deliverDate) {
        this.deliverDate = deliverDate;
    }

    public List getUnit() {
        return unit;
    }

    public void setUnit(List unit) {
        this.unit = unit;
    }

    public List getCopy() {
        return copy;
    }

    public void setCopy(List copy) {
        this.copy = copy;
    }

    public List getUser() {
        return user;
    }

    public void setUser(List user) {
        this.user = user;
    }

    //The search method performs a search for specific evaluations
    public void search() {
    }
}
