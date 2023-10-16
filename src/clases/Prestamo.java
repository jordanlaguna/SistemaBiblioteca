package clases;

import conexionDB.ConextionLoans;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javafx.scene.control.Alert;

/**
 * The Loan class represents the loans in the system, related to the library. In
 * order to manage the loans
 */
public class Prestamo extends Nota{

    private Date dateLoan;

   private String exemplars;

    private Date dateReturn;

   // private List unit;

    private int numLoan;
    private String email; 
    private String fullName; 

    /**
     *
     * @param date
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
    
    

    public Prestamo( Date dateLoan, String exemplars, Date dateReturn, 
            int numLoan,  String email, String fullName,  Date date, 
            String identification, String note ) {
        super(date, identification, note);
        
        this.dateLoan = dateLoan;
        this.exemplars = exemplars;
        this.dateReturn = dateReturn;
        //this.unit = unit;
        this.numLoan = numLoan;
        this.email = email; 
           this.fullName = fullName; 
    }

    public Prestamo() {
    }

    /*public Prestamo(int aInt, java.sql.Date date, int aInt0, String string, String string0, java.sql.Date date0, int aInt1, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    public Date getDateLoan() {
        return dateLoan;
    }

    public void setDateLoan(Date dateLoan) {
        this.dateLoan = dateLoan;
    }

    public String getExemplars() {
        return exemplars;
    }

    public void setExemplars(String exemplars) {
        this.exemplars = exemplars;
    }

    public Date getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(Date dateReturn) {
        this.dateReturn = dateReturn;
    }

    /*public List getUnit() {
        return unit;
    }

    public void setUnit(List unit) {
        this.unit = unit;
    }*/

    public int getNumLoan() {
        return numLoan;
    }

    public void setNumLoan(int numLoan) {
        this.numLoan = numLoan;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
        Connection conn = null;
      PreparedStatement ps , ps2= null;
      ResultSet rs = null;
       String selectedEditorial = getExemplars();
        conn= ConextionLoans.getConnection(); 
        
        String sql= "insert into loan(loan_date, devolution_date, loan_number,"
                + " exemplars, email, fullName)"
                + "values(?, ?, ?, ?, ?, ?)"; 
        String sqlNote= "insert into note(date,identification,noteDescription)"
                + "values(?,?,?)";
        try {
            ps= conn.prepareStatement(sql); 
            ps.setString(1, getDateLoan().toString());
            ps.setString(2, getDateReturn().toString());
            ps.setString(3,  String.valueOf(getNumLoan()));
            ps.setString(4, getExemplars());
            ps.setString(5, getEmail()); 
            ps.setString(6, getFullName()); 
            ps.execute();  
            ps2=conn.prepareStatement(sqlNote);
                ps2.setString(1,  getDateLoan().toString());
                ps2.setString(2,  String.valueOf(getNumLoan()));
                ps2.setString(3, getNote()); 
                
            ps2.execute(); 
            
             Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("INFORMACIÓN");
            alert.setContentText("Datos de prestamo guardados correctamente.");
            alert.showAndWait();
            
        } catch (Exception e) {
             Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("No se logro guardar los datos del prestamo. "
                    + e);
            alert.showAndWait();
            System.out.println("error"+e);
        }    
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
