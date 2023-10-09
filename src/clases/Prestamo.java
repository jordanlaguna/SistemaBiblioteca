package clases;

import java.util.Date;
import java.util.List;

/**
 * The Loan class represents the loans in the system, related to the library. In
 * order to manage the loans
 */
public class Prestamo {

    private Date dateLoan;

    private List copy;

    private Date dateReturn;

    private List unit;

    private int numLoan;

    /**
     *
     * @param dateLoan = A Date type attribute that stores the date the
     * loan was made.
     * @param copy= An attribute of type List (list) that stores items
     * related to the loan.
     * @param dateReturn = An attribute of type Date that stores the date
     * on which the loaned items are expected to be returned.
     * @param unit = unit: An attribute of type List (list) that is related to
     * units.
     * @param numLoan = An integer (int) type attribute that stores a loan
     * number, to uniquely identify this loan in the system.
     */
    
    

    public Prestamo(Date dateLoan, List copy, Date dateReturn, List unit, int numLoan) {
        this.dateLoan = dateLoan;
        this.copy = copy;
        this.dateReturn = dateReturn;
        this.unit = unit;
        this.numLoan = numLoan;
    }

    public Prestamo() {
    }

    public Date getDateLoan() {
        return dateLoan;
    }

    public void setDateLoan(Date dateLoan) {
        this.dateLoan = dateLoan;
    }

    public List getCopy() {
        return copy;
    }

    public void setCopy(List copy) {
        this.copy = copy;
    }

    public Date getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(Date dateReturn) {
        this.dateReturn = dateReturn;
    }

    public List getUnit() {
        return unit;
    }

    public void setUnit(List unit) {
        this.unit = unit;
    }

    public int getNumLoan() {
        return numLoan;
    }

    public void setNumLoan(int numLoan) {
        this.numLoan = numLoan;
    }

   
    /**
     * This function is used to display a list of active loans in the system.
     * Active loans are those that have not yet been repaid or are pending.
     */
    public void seeActiveLoan() {
    }

    /**
     * This function is used to add new elements or records to the system.
     */
    public void add() {
    }

    /**
     * This function is used to search for information in the system. The search
     * could be based on some specific criteria and return relevant results.
     */
    public void search() {
    }

    /**
     * This function is used to search for information in the system. The search
     * could be based on some specific criteria and return relevant results.
     */
    public void seeReturns() {
    }

    /**
     * This function is to display the notes made at the time of the loan
     */
    public void notes() {
    }

    /**
     * This function is related to the management of users in the system, such
     * as creating, editing or deleting users.
     */
    public void users() {
    }
}
