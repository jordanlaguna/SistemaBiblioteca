/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import clases.Prestamo;
import clases.Nota;
import conexionDB.ConexionLibros;
import conexionDB.ConextionLoans; 
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

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
    private TextField txt_lastName;
    @FXML
    private TextField txt_email;
    @FXML
    private TextField txt_search;
    @FXML
    private TableView<Prestamo> tbw_libros;
    @FXML
    private TableColumn<Prestamo, Integer> column_numLoan;
    @FXML
    private TableColumn<Prestamo, DatePicker> colum_dateLoan;
    @FXML
    private TableColumn<Prestamo, DatePicker> column_dateReturn;
    @FXML
    private TableColumn<Prestamo, String>  column_editorial;
    @FXML
    private TableColumn<Nota, String>  column_observations;
    @FXML
    private Button btn_add;
    @FXML
    private ComboBox<String> txt_editorial;

    
    
    private ObservableList<Prestamo> Prestamos; 
    private ObservableList<Nota>Notas; 
      Connection conn = null;
      PreparedStatement ps = null;
      ResultSet rs = null;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try { 
            loadData();
        } catch (SQLException ex) {
            Logger.getLogger(FXMLLoansController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         // Llena el ComboBox de editorial
        ObservableList<String> editorialList = FXCollections.observableArrayList();
        editorialList.addAll(getEditorialDataFromDatabase());
        txt_editorial.setItems(editorialList);
    } 
    
    
      @FXML
    void btn_add(ActionEvent event) throws SQLException {
        addLoans();
    }
    
    /**
     * @return
     * Extracted data from Books db to display the data and display it in a 
     * comboBox.
     * 
     */
    private List<String> getEditorialDataFromDatabase() {
        List<String> editorialData = new ArrayList<>();
        Connection conn = ConexionLibros.conn();
        if (conn != null) {
            try {
                PreparedStatement ps = conn.prepareStatement("SELECT"
                        + " DISTINCT editorial FROM book");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    editorialData.add(rs.getString("editorial"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return editorialData;
    }
    
    
    
    /**
     * Load the data into the interface table...
     */
    private void loadData() throws SQLException{
        this.column_numLoan.setCellValueFactory(new PropertyValueFactory<
                Prestamo,Integer>("numLoan"));
        this.colum_dateLoan.setCellValueFactory(new PropertyValueFactory<
                Prestamo, DatePicker>("dateLoan"));
        this.column_dateReturn.setCellValueFactory(new PropertyValueFactory<
                Prestamo, DatePicker>("dateReturn"));
        this.column_editorial.setCellValueFactory(new PropertyValueFactory<
                Prestamo, String>("exemplars"));
        this.column_observations.setCellValueFactory(new PropertyValueFactory<
                Nota, String>("note"));
      
        Prestamos = ConextionLoans.getDataBook(); 
        Notas =ConextionLoans.getNotas();
        tbw_libros.setItems(Prestamos); 
  
 
    }
    
    private void cleanData(){
        txt_numLoan.clear();
        Datepiker_loanDate.setValue(null);
        Datepiker_devolutionDate.setValue(null);
        txt_name.clear();
        txt_lastName.clear();
        txt_email.clear();
        txt_Observations.clear();
    }
    
    
    private void addLoans() throws SQLException{
       
        String selectedEditorial = txt_editorial.getValue();
        conn= ConextionLoans.conn(); 
        
        String sql= "insert into loan(loan_date,devolution_date, loan_number,exemplars)"
                + "values(?,?,?,?)";
        String sqlNote= "insert into note(date,identification,noteDescription)values(?,?,?)";
        try {
            ps= conn.prepareStatement(sql); 
            ps.setString(1, Datepiker_loanDate.getValue().toString());
            ps.setString(2, Datepiker_devolutionDate.getValue().toString());
            ps.setString(3, txt_numLoan.getText());
            ps.setString(4, selectedEditorial);
            ps.execute(); 
            
            ps=conn.prepareStatement(sqlNote);
                ps.setString(1, Datepiker_loanDate.getValue().toString());
                ps.setString(2, txt_numLoan.getText());
                ps.setString(3, txt_Observations.getText()); 
            ps.execute(); 
            
             Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("INFORMACIÓN");
            alert.setContentText("Datos de prestamo guardados correctamente.");
            alert.showAndWait();
            
        } catch (Exception e) {
             Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("No se logro guardar los datos del prestamo. " + e);
            alert.showAndWait();
        }
        loadData(); 
        cleanData(); 
    }
    
}
