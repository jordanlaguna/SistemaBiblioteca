package clases;

import conexionDB.ConexionLibros;
import conexionDB.ConexionLoans;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javafx.scene.control.Alert;

/**
 * The Loan class represents the loans in the system, related to the library. In
 * order to manage the loans
 */
public class Prestamo extends Nota {

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
     * @param dateLoan = A Date type attribute that stores the date the loan was
     * made.
     * @param dateReturn = An attribute of type Date that stores the date on
     * which the loaned items are expected to be returned.
     * @param numLoan = An integer (int) type attribute that stores a loan
     * number, to uniquely identify this loan in the system.
     */
    public Prestamo(Date dateLoan, String exemplars, Date dateReturn,
            int numLoan, String email, String fullName, Date date,
            String identification, String note) {
        super(date, identification, note);

        this.dateLoan = dateLoan;
        this.exemplars = exemplars;
        this.dateReturn = dateReturn;
         
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
    public void updateBook(){
        Connection con = null;
        PreparedStatement ps1 = null;
        
        String selectedEditorial = getExemplars();
         
        
        try {
            con = ConexionLibros.conn();
            String value1 = selectedEditorial;
            String value3 = "No disponible";

            String sqlAvailable = "SELECT DISTINCT isbn FROM book WHERE available = 'Disponible' AND title = '" + value1 + "'";

            String isbn = executeQueryAndGetISBN(sqlAvailable);
            String value2 = isbn;
            // Verificar si se obtuvo un ISBN y mostrarlo
            if (isbn != null) {

                System.out.println("El ISBN encontrado es: " + isbn);

            } else {
                System.out.println("No se encontró un ISBN para el título proporcionado.");
            }
            String sqlUpdate = "UPDATE book SET isbn = '"+value2+"', available = '"+value3+"' WHERE isbn = '"+value2+"';";
            
              
            ps1 = con.prepareStatement(sqlUpdate);
            ps1.execute();
            System.out.println("Actualiza disponible");
        } catch (Exception e) {
            System.out.println(e);
             System.out.println("No encontro codigo update");
        }
        
    }
    public String executeQueryAndGetISBN(String sqlQuery) {
        String isbn = null;
        Connection conn = null;
        PreparedStatement statament = null;
        ResultSet rs = null;
        String selectedEditorial = getExemplars();
        conn = ConexionLibros.conn();

        try {
            // Crear una declaración (statement) para ejecutar la consulta
            Statement statement = conn.createStatement();

            // Ejecutar la consulta
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            // Verificar si se encontró algún resultado
            if (resultSet.next()) {
                // Obtener el ISBN de la primera fila (puedes ajustar esto según tus necesidades)
                isbn = resultSet.getString("isbn");
            }

            // Cerrar la declaración y el resultado
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de errores SQL
        }

        return isbn;
    }

    /**
     * This function is used to add new elements or records to the system.
     */
    public void add() {
        Connection conn, con = null;
        PreparedStatement ps, ps2, ps1 = null;
        ResultSet rs = null;
        String selectedEditorial = getExemplars();
        conn = ConexionLoans.getConnection();
        
        updateBook();
        
        try {

            String sql = "insert into loan(loan_date, devolution_date, loan_number,"
                    + " exemplars, email, fullName)"
                    + "values(?, ?, ?, ?, ?, ?)";
            String sqlNote = "insert into note(date,identification,noteDescription)"
                    + "values(?,?,?)";

            con = ConexionLibros.conn();

            ps = conn.prepareStatement(sql);
            ps.setString(1, getDateLoan().toString());
            ps.setString(2, getDateReturn().toString());
            ps.setString(3, String.valueOf(getNumLoan()));
            ps.setString(4, getExemplars());
            ps.setString(5, getEmail());
            ps.setString(6, getFullName());
            ps.execute();
            ps2 = conn.prepareStatement(sqlNote);
            ps2.setString(1, getDateLoan().toString());
            ps2.setString(2, String.valueOf(getNumLoan()));
            ps2.setString(3, getNote());

            ps2.execute();

            Alert alerte = new Alert(Alert.AlertType.INFORMATION);
            alerte.setHeaderText(null);
            alerte.setTitle("INFORMACIÓN");
            alerte.setContentText("Datos de prestamo guardados correctamente.");
            alerte.showAndWait();

        } catch (Exception e) {
            Alert alerti = new Alert(Alert.AlertType.ERROR);
            alerti.setHeaderText(null);
            alerti.setTitle("ERROR");
            alerti.setContentText("No se logro guardar los datos del prestamo. "
                    + e);
            alerti.showAndWait();
            System.out.println("error" + e);
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
