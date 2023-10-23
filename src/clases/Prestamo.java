package clases;

import conexionDB.ConexionLibros;
import conexionDB.ConexionLoans;
import conexionDB.ConexionTabletDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.scene.control.Alert;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;


/** 
 * The Loan class represents the loans in the system, related to the library. In
 * order to manage the loans
 * 
 * @author julio
 */
public class Prestamo extends Nota {

    private Date dateLoan;
    private String exemplars;
    private int id_loan;
    private Date dateReturn;
    private int numLoan;
    private String email;
    private String fullName;
    /**
     * 
     * @param id_loan The ID of the loan.
     * @param dateLoan The loan date.
     * @param exemplars The borrowed item.
     * @param dateReturn The return date.
     * @param numLoan The loan number.
     * @param email The user's email.
     * @param fullName The name of the user.
     * @param date The loan date.
     * @param identification The identification.
     * @param note The observations.
     */
    public Prestamo(int id_loan, Date dateLoan, String exemplars, Date dateReturn,
            int numLoan, String email, String fullName, Date date,
            String identification, String note) {
        super(date, identification, note);

        this.dateLoan = dateLoan;
        this.exemplars = exemplars;
        this.dateReturn = dateReturn;
        this.id_loan = id_loan;
        this.numLoan = numLoan;
        this.email = email;
        this.fullName = fullName;
    }

    public Prestamo() {
    }

    public int getId_loan() {
        return id_loan;
    }

    public void setId_loan(int id_loan) {
        this.id_loan = id_loan;
    }

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

    public void updateBook() {
        Connection con = null;
        PreparedStatement ps1 = null;

        String selectedEditorial = getExemplars();

        try {
            con = ConexionLibros.conn();
            String value1 = selectedEditorial;
            String value3 = "No disponible";

            String sqlAvailable = "SELECT DISTINCT isbn FROM book WHERE "
                    + "available = 'Disponible' AND title = '" + value1 + "'";

            String isbn = executeQueryAndGetISBN(sqlAvailable);
            String value2 = isbn;
            // Verificar si se obtuvo un ISBN y mostrarlo
            if (isbn != null) {

                System.out.println("El ISBN encontrado es: " + isbn);

            } else {
                System.out.println("No se encontró un ISBN para el título "
                        + "proporcionado.");
            }
            String sqlUpdate = "UPDATE book SET isbn = '" + value2 + "', "
                    + "available "
                    + "= '" + value3 + "' WHERE isbn = '" + value2 + "';";

            ps1 = con.prepareStatement(sqlUpdate);
            ps1.execute();
            System.out.println("Actualiza disponible");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("No encontro codigo update");
        }
    }

    public void updateComputer() {
        Connection conn = null;
        PreparedStatement ps1 = null;
        String selectedEditorialTwo = getExemplars();

        try {
            conn = ConexionLibros.conn();
            String value1 = selectedEditorialTwo;
            String value3 = "No disponible";

            String sqlAvailable = "SELECT DISTINCT id FROM computer WHERE "
                    + "available = 'Disponible' AND trademark = '" + value1 + "'";

            String id = executeQueryAndGetID(sqlAvailable);
            String value2 = id;
            // Verificar si se obtuvo un ISBN y mostrarlo
            if (id != null) {

                System.out.println("El ID encontrado es: " + id);

            } else {
                System.out.println("No se encontró un ID para el título "
                        + "proporcionado.");
            }
            String sqlUpdate = "UPDATE computer SET id = '" + value2 + "',"
                    + " available "
                    + "= '" + value3 + "' WHERE id = '" + value2 + "';";

            ps1 = conn.prepareStatement(sqlUpdate);
            ps1.execute();
            System.out.println("Actualiza disponible");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("No encontro codigo update");
        }
    }
    
    /**
     * 
     */
    public void updateTablet() {
        Connection conn = null;
        PreparedStatement ps1 = null;
        String selectedEditorialThree = getExemplars();

        try {
            conn = ConexionTabletDB.getConnection();
            String value1 = selectedEditorialThree;
            String value3 = "No disponible";

            String sqlAvailable = "SELECT DISTINCT id_tab FROM tablet WHERE "
                    + "available = 'Disponible' AND trademark = '" + value1 + "'";

            String id = executeQueryAndGetId_tab(sqlAvailable);
            String value2 = id;
            // Verificar si se obtuvo un ISBN y mostrarlo
            if (id != null) {

                System.out.println("El ID encontrado es: " + id);

            } else {
                System.out.println("No se encontró un ID para el título "
                        + "proporcionado.");
            }
            String sqlUpdate = "UPDATE tablet SET id_tab = '" + value2 + "',"
                    + " available "
                    + "= '" + value3 + "' WHERE id_tab = '" + value2 + "';";

            ps1 = conn.prepareStatement(sqlUpdate);
            ps1.execute();
            System.out.println("Actualiza disponible");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("No encontro codigo update");
        }
    }
/**
 * 
 * @param sqlQuery The SQL query to execute.
 * @return The ISBN obtained from the query results or null if no results were
 * found or an error occurred.
 */
 public String executeQueryAndGetISBN(String sqlQuery) {
    if (sqlQuery == null || sqlQuery.isEmpty()) {
        // Manejo de consulta SQL vacía o nula
        return null;
    }
    
    String isbn = null;
    Connection conn = null;
    PreparedStatement statement = null;
    ResultSet rs = null;
    String selectedEditorial = getExemplars();
    conn = ConexionLibros.conn();

    try {
        Statement st = conn.createStatement();
        ResultSet resultSet = st.executeQuery(sqlQuery);
        if (resultSet.next()) {
            isbn = resultSet.getString("isbn");
        }

        // Cerrar la declaración y el resultado
        resultSet.close();
        st.close();
    } catch (SQLException e) {
        e.printStackTrace();
        // Manejo de errores SQL
    }

    return isbn;
}

    public String executeQueryAndGetID(String sqlQuery2) {
           if (sqlQuery2 == null || sqlQuery2.isEmpty()) {
        // Manejo de consulta SQL vacía o nula
        return null;
    }
        String id = null;
        Connection conn = null;
        PreparedStatement statament = null;
        ResultSet rs = null;
        String selectedEditorialTwo = getExemplars();
        conn = ConexionLibros.conn();

        try {
   
            Statement statement = conn.createStatement();

            
            ResultSet resultSet = statement.executeQuery(sqlQuery2);

            if (resultSet.next()) {
                id = resultSet.getString("id");
            }

            
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();

        }

        return id;
    }
/**
 * 
 * @param sqlQueryThree The SQL query to execute.
 * @return The tablet ID obtained from the query results or null if no results
 * were foundor if an error occurred.
 */
    public String executeQueryAndGetId_tab(String sqlQueryThree) {
           if (sqlQueryThree == null || sqlQueryThree.isEmpty()) {
        // Manejo de consulta SQL vacía o nula
        return null;
    }
        String id_tab = null;
        Connection conn = null;
        PreparedStatement statament = null;
        ResultSet rs = null;
        String selectedEditorialThree = getExemplars();
        conn = ConexionTabletDB.getConnection();

        try {
            Statement statement = conn.createStatement();

          
            ResultSet resultSet = statement.executeQuery(sqlQueryThree);

           
            if (resultSet.next()) {
                
                id_tab = resultSet.getString("id_tab");
            }


            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();

        }

        return id_tab;
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
        updateComputer();
        updateTablet();

        try {

            String sql = "insert into loan(loan_date, devolution_date, "
                    + "loan_number," + " exemplars, email, fullName)"
                    + "values(?, ?, ?, ?, ?, ?)";
            String sqlNote = "insert into note(date,identification"
                    + ",noteDescription)"
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
            e.printStackTrace();
            Alert alerti = new Alert(Alert.AlertType.ERROR);
            alerti.setHeaderText(null);
            alerti.setTitle("ERROR");
            alerti.setContentText("No se logro guardar los datos del prestamo.");
            alerti.showAndWait();
 
        }
    }

  
    /**
     * 
     * @param txt_search The text field where the search term is entered.
     * @param  tableView The TableView to filter and update.
     */
    public void search(TextField txt_search, TableView<Prestamo> tableView) {
         FilteredList<Prestamo> filterData = new FilteredList<>(tableView.
                getItems(), p -> true);

        txt_search.textProperty().addListener((observable, oldValue, newValue) 
                -> {
            filterData.setPredicate(prestamo -> {
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }
                String typeText = newValue.toLowerCase();
                 if (prestamo.getExemplars().toLowerCase().contains(typeText)
                        || prestamo.getEmail().toLowerCase().
                                contains(typeText)
                        || prestamo.getFullName().toLowerCase().
                                contains(typeText)
                        || String.valueOf(prestamo.getId_loan()).toLowerCase().
                                contains(typeText)) {
                    return true;
                }
                return false;
            });
        });

        SortedList<Prestamo> sortedList = new SortedList<>(filterData);
        sortedList.comparatorProperty().bind(tableView.comparatorProperty());
        tableView.setItems(sortedList);

    }

    /**
     * availability of returns
     */
    public void availableBook() {
        Connection conn = null;
        PreparedStatement ps1 = null;

        try {
            conn = ConexionLibros.conn();
            String selectedEditorial = getExemplars();
            String value1 = selectedEditorial;
            String value3 = "Disponible"; // Cambiar el estado a "Disponible"

            // Buscar el objeto en la base de datos que coincide con el 'exemplar'
            String sqlAvailable = "SELECT DISTINCT isbn FROM book WHERE "
                    + "available = 'No disponible' AND title = '" + value1 + "'";

            String isbn = executeQueryAndGetISBN(sqlAvailable);
            String value2 = isbn;

            // Actualizar el estado del objeto a "Disponible" en la base de datos
            String sqlUpdate = "UPDATE book SET isbn = '" + value2 + "', "
                    + "available = '" + value3 + "' WHERE isbn = '" + value2 + "';";

            ps1 = conn.prepareStatement(sqlUpdate);
            ps1.execute();
            System.out.println("Esta disponible");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("No encontro codigo update");
        }
    }

    public void availableComputer() {
        Connection conn = null;
        PreparedStatement ps1 = null;

        try {
            conn = ConexionLibros.conn();
            String selectedEditorialTwo = getExemplars();
            String value1 = selectedEditorialTwo;
            String value3 = "Disponible"; // Cambiar el estado a "Disponible"

            // Buscar el objeto en la base de datos que coincide con el 'exemplar'
            String sqlAvailable = "SELECT DISTINCT id FROM computer WHERE "
                    + "available = 'No disponible' AND trademark = '" + value1 + "'";

            String id = executeQueryAndGetID(sqlAvailable);
            String value2 = id;

            // Actualizar el estado del objeto a "Disponible" en la base de datos
            String sqlUpdate = "UPDATE computer SET id = '" + value2 + "', "
                    + "available = '" + value3 + "' WHERE id = '" + value2 + "';";

            ps1 = conn.prepareStatement(sqlUpdate);
            ps1.execute();
            System.out.println("Esta disponible");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("No encontró código de actualización");
        }
    }

    public void availableTablet() {
        Connection conn = null;
        PreparedStatement ps1 = null;

        try {
            conn = ConexionTabletDB.getConnection();
            String selectedEditorialThree = getExemplars();
            String value1 = selectedEditorialThree;
            String value3 = "Disponible"; // Cambiar el estado a "Disponible"

            // Buscar el objeto en la base de datos que coincide con el 'exemplar'
            String sqlAvailable = "SELECT DISTINCT id_tab FROM tablet WHERE "
                    + "available = 'No disponible' AND trademark = '" + value1 + "'";

            String id_tab = executeQueryAndGetId_tab(sqlAvailable);
            String value2 = id_tab;

            // Actualizar el estado del objeto a "Disponible" en la base de datos
            String sqlUpdate = "UPDATE tablet SET id_tab = '" + value2 + "', "
                    + "available = '" + value3 + "' WHERE id_tab = '" + value2 + "';";

            ps1 = conn.prepareStatement(sqlUpdate);
            ps1.execute();
            System.out.println("Esta disponible");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("No encontró código de actualización");
        }
    }
}
