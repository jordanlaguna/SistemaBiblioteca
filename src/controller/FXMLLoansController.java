/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import clases.Prestamo;
import conexionDB.ConexionLibros;
import conexionDB.ConexionLoans;
import conexionDB.ConexionTabletDB;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author melan
 */
public class FXMLLoansController implements Initializable {

    @FXML
    private TextArea txt_Observations;
    @FXML
    private TextField txt_numLoan;
    @FXML
    private DatePicker Datepiker_loanDate;
    @FXML
    private DatePicker Datepiker_devolutionDate;
    @FXML
    private TextField txt_name;
    @FXML
    private TextField txt_email;
    @FXML
    private TextField txt_search;
    @FXML
    private TableView<Prestamo> tbw_libros;
    @FXML
    private TableColumn<Prestamo, Integer> column_numLoan;
    @FXML
    private TableColumn<Prestamo, java.sql.Date> colum_dateLoan;
    @FXML
    private TableColumn<Prestamo, java.sql.Date> column_dateReturn;
    @FXML
    private TableColumn<Prestamo, String> column_editorial;
    @FXML
    private TableColumn<Prestamo, String> column_observations;
    @FXML
    private ComboBox<String> txt_editorial;
    @FXML
    private TableColumn<Prestamo, String> column_email;
    @FXML
    private TableColumn<Prestamo, String> column_fullName;

    private ObservableList<Prestamo> Prestamos = FXCollections.observableArrayList();
    //private ObservableList<Nota>Notas; 
    Connection conn, con, connn = null;
    PreparedStatement ps, ps2 = null;
    ResultSet rs = null;

    int randomCodigo;
    @FXML
    private ComboBox<String> cmbComputer;
    @FXML
    private ComboBox<String> cmbTablet;
    @FXML
    private TableColumn<Prestamo, Integer> column_id;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Random rand = new Random();
        randomCodigo = rand.nextInt(999999);
        txt_numLoan.setText(String.valueOf(randomCodigo));
        try {

            loadData();
        } catch (SQLException ex) {
            Logger.getLogger(FXMLLoansController.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Llena el ComboBox de editorial
        ObservableList<String> editorialList = FXCollections.observableArrayList();
        editorialList.addAll(getEditorialDataFromDatabase());
        txt_editorial.setItems(editorialList);

        // Llena el ComboBox de editorial
        ObservableList<String> computerList = FXCollections.observableArrayList();
        computerList.addAll(getComputerDataFromDatabase());
        cmbComputer.setItems(computerList);

        // Llena el ComboBox de editorial
        ObservableList<String> tabletList = FXCollections.observableArrayList();
        tabletList.addAll(getTabletDataFromDatabase());
        cmbTablet.setItems(tabletList);
    }

    @FXML
    void btn_add(ActionEvent event) throws SQLException {
        addLoans();
    }

    /**
     * @return Extracted data from Books db to display the data and display it
     * in a comboBox.
     *
     */
    private List<String> getEditorialDataFromDatabase() {
        List<String> editorialData = new ArrayList<>();
        Connection conn = ConexionLibros.conn();
        if (conn != null) {
            try {
                PreparedStatement ps = conn.prepareStatement("SELECT"
                        + " DISTINCT isbn, title FROM book WHERE "
                        + "available = 'Disponible'");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    editorialData.add(rs.getString("title"));

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        cmbComputer.setValue(null);
        cmbTablet.setValue(null);
        return editorialData;
    }

    private List<String> getComputerDataFromDatabase() {
        List<String> computerData = new ArrayList<>();
        Connection con = ConexionLibros.conn();
        if (con != null) {
            try {
                PreparedStatement ps = con.prepareStatement("SELECT"
                        + " DISTINCT id, trademark FROM computer WHERE "
                        + "available = 'Disponible'");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    computerData.add(rs.getString("trademark"));

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        cmbTablet.setValue(null);
        txt_editorial.setValue(null);
        return computerData;
    }

    private List<String> getTabletDataFromDatabase() {
        List<String> tabletData = new ArrayList<>();
        Connection connn = ConexionTabletDB.getConnection();
        if (connn != null) {
            try {
                PreparedStatement ps = connn.prepareStatement("SELECT"
                        + " DISTINCT id_tab, trademark FROM tablet WHERE "
                        + "available = 'Disponible'");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    tabletData.add(rs.getString("trademark"));

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        cmbComputer.setValue(null);
        txt_editorial.setValue(null);
        return tabletData;
    }

    /**
     * Load the data into the interface table...
     */
    private void loadData() throws SQLException {

        conn = ConexionLoans.getConnection();
        this.column_id.setCellValueFactory(new PropertyValueFactory<
                Prestamo, Integer>("id_loan"));
        this.colum_dateLoan.setCellValueFactory(new PropertyValueFactory<
                Prestamo, java.sql.Date>("dateLoan"));

        this.column_dateReturn.setCellValueFactory(new PropertyValueFactory<
                Prestamo, java.sql.Date>("dateReturn"));

        this.column_editorial.setCellValueFactory(new PropertyValueFactory<
                Prestamo, String>("exemplars"));

        this.column_numLoan.setCellValueFactory(new PropertyValueFactory<
                Prestamo, Integer>("numLoan"));

        this.column_observations.setCellValueFactory(new PropertyValueFactory<
                Prestamo, String>("note"));

        this.column_email.setCellValueFactory(new PropertyValueFactory<
                Prestamo, String>("email"));
        this.column_fullName.setCellValueFactory(new PropertyValueFactory<
                Prestamo, String>("fullName"));

        Prestamos = ConexionLoans.getDataLoanAndNote();
        tbw_libros.setItems(Prestamos);
    }

    private void cleanData() {
        txt_numLoan.clear();
        Datepiker_loanDate.setValue(null);
        Datepiker_devolutionDate.setValue(null);
        txt_name.clear();
        txt_email.clear();
        txt_Observations.clear();
    }

    private void addLoans() throws SQLException {
        Prestamo prestamo = new Prestamo();
        LocalDate localDate = Datepiker_loanDate.getValue();
        Date loanDate = Date.valueOf(localDate);
        LocalDate Datelocal = Datepiker_devolutionDate.getValue();
        Date loandevolutionDate = Date.valueOf(Datelocal);
        prestamo.setDateLoan(loanDate);
        prestamo.setDateReturn(loandevolutionDate);
        prestamo.setNumLoan(Integer.parseInt(txt_numLoan.getText()));

        String opcion = txt_editorial.getValue();
        String opcionTwo = cmbComputer.getValue();
        String opcionThree = cmbTablet.getValue();

        if (opcion != null && !opcion.isEmpty()) {

            prestamo.setExemplars((String) txt_editorial.getValue());
        } else if (opcionTwo != null && !opcionTwo.isEmpty()) {

            prestamo.setExemplars((String) cmbComputer.getValue());
        } else if (opcionThree != null && !opcionThree.isEmpty()) {

            prestamo.setExemplars((String) cmbTablet.getValue());
        }

        prestamo.setEmail(txt_email.getText());
        prestamo.setFullName(txt_name.getText());
        prestamo.setNote(txt_Observations.getText());

        prestamo.add();

        loadData();
        cleanData();

    }

}
