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
 */
public class Prestamo extends Nota {

    private Date dateLoan;
    private String exemplars;
    private int id_loan;
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

    /*public Prestamo(int aInt, java.sql.Date date, int aInt0, String string, String string0, java.sql.Date date0, int aInt1, String string1) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
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
            String sqlUpdate = "UPDATE book SET isbn = '" + value2 + "', available "
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
            String sqlUpdate = "UPDATE computer SET id = '" + value2 + "', available "
                    + "= '" + value3 + "' WHERE id = '" + value2 + "';";

            ps1 = conn.prepareStatement(sqlUpdate);
            ps1.execute();
            System.out.println("Actualiza disponible");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("No encontro codigo update");
        }
    }

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
            String sqlUpdate = "UPDATE tablet SET id_tab = '" + value2 + "', available "
                    + "= '" + value3 + "' WHERE id_tab = '" + value2 + "';";

            ps1 = conn.prepareStatement(sqlUpdate);
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

    public String executeQueryAndGetID(String sqlQuery2) {
        String id = null;
        Connection conn = null;
        PreparedStatement statament = null;
        ResultSet rs = null;
        String selectedEditorialTwo = getExemplars();
        conn = ConexionLibros.conn();

        try {
            // Crear una declaración (statement) para ejecutar la consulta
            Statement statement = conn.createStatement();

            // Ejecutar la consulta
            ResultSet resultSet = statement.executeQuery(sqlQuery2);

            // Verificar si se encontró algún resultado
            if (resultSet.next()) {
                // Obtener el ISBN de la primera fila (puedes ajustar esto según tus necesidades)
                id = resultSet.getString("id");
            }

            // Cerrar la declaración y el resultado
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de errores SQL
        }

        return id;
    }

    public String executeQueryAndGetId_tab(String sqlQueryThree) {
        String id_tab = null;
        Connection conn = null;
        PreparedStatement statament = null;
        ResultSet rs = null;
        String selectedEditorialThree = getExemplars();
        conn = ConexionTabletDB.getConnection();

        try {
            // Crear una declaración (statement) para ejecutar la consulta
            Statement statement = conn.createStatement();

            // Ejecutar la consulta
            ResultSet resultSet = statement.executeQuery(sqlQueryThree);

            // Verificar si se encontró algún resultado
            if (resultSet.next()) {
                // Obtener el ISBN de la primera fila (puedes ajustar esto según tus necesidades)
                id_tab = resultSet.getString("id_tab");
            }

            // Cerrar la declaración y el resultado
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de errores SQL
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
    public void search(TextField txt_search, TableView<Prestamo> tableView) {
         FilteredList<Prestamo> filterData = new FilteredList<>(tableView.
                getItems(), p -> true);

        txt_search.textProperty().addListener((observable, oldValue, newValue) 
                -> {
            filterData.setPredicate(prestamo -> {
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }
                String tipoTexto = newValue.toLowerCase();
                 if (prestamo.getExemplars().toLowerCase().contains(tipoTexto)
                        || prestamo.getEmail().toLowerCase().
                                contains(tipoTexto)
                        || prestamo.getFullName().toLowerCase().
                                contains(tipoTexto)
                        || String.valueOf(prestamo.getId_loan()).toLowerCase().
                                contains(tipoTexto)) {
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

    //disponibilidad de las devoluciones
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
