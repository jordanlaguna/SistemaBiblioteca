/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

 
import clases.Libro;
import conexionDB.ConexionLibros;
 
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author jorda
 */
public class FXMLLibrosController implements Initializable {

    @FXML
    private TextField txt_isbn;
    @FXML
    private TextField txt_title;
    @FXML
    private TextField txt_author;
    @FXML
    private TextField txt_editorial;
    @FXML
    private DatePicker datePicker;
    @FXML
    private Button btn_Add;
    @FXML
    private Button btn_update;
    @FXML
    private Button btn_delete;
    @FXML
    private TableView<Libro> tbw_libros;
    @FXML
    private TableColumn<Libro, Integer> column_isbn;
    @FXML
    private TableColumn<Libro, String> column_title;
    @FXML
    private TableColumn<Libro, String> column_author;
    @FXML
    private TableColumn<Libro, String> column_editorial;
    @FXML
    private TableColumn<Libro, DatePicker> column_year;
    @FXML
    private TextField txt_search;
    @FXML
    private TextField txt_cantidad;
    @FXML
    private TableColumn<Libro, Integer> column_cantidad;
    
     private ObservableList<Libro> Libro = FXCollections.observableArrayList();

    private ObservableList<Libro> Libros;
    
    
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cargarDatos();
    }    

    @FXML
    private void add(ActionEvent event) {
        conn = ConexionLibros.conn();
        

        String sql = "insert into avanceConfig(isbn, title, authorBook,"
                + " editorial, releaseDate)values(?,?,?,?,?)";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, txt_isbn.getText());
            ps.setString(2, txt_title.getText());
            ps.setString(3, txt_author.getText());
            ps.setString(4, txt_editorial.getText());
            ps.setString(5, datePicker.getValue().toString());
            ps.execute();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("INFORMACIÓN");
            alert.setContentText("Libros guardados correctamente.");
            alert.showAndWait();
            
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("No se pudo guardar los libros. " + e);
            alert.showAndWait();
        }
    }

    @FXML
    private void update(ActionEvent event) {
    }

    @FXML
    private void delete(ActionEvent event) {
    }
    
    private void cargarDatos() {
        this.column_isbn.setCellValueFactory(new PropertyValueFactory<Libro, Integer>("isbn"));
        this.column_title.setCellValueFactory(new PropertyValueFactory<Libro, String>("title"));
        this.column_author.setCellValueFactory(new PropertyValueFactory<Libro, String>("authorBook"));
        this.column_editorial.setCellValueFactory(new PropertyValueFactory<Libro, String>("editorial"));
        this.column_year.setCellValueFactory(new PropertyValueFactory<Libro, DatePicker>("releaseDate"));
        
        Libros = ConexionLibros.getDataBook();
        tbw_libros.setItems(Libro);
    }
    
}
