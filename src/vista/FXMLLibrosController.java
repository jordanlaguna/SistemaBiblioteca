/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

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
    private TableView<?> tbw_libros;
    @FXML
    private TableColumn<?, ?> column_isbn;
    @FXML
    private TableColumn<?, ?> column_title;
    @FXML
    private TableColumn<?, ?> column_author;
    @FXML
    private TableColumn<?, ?> column_editorial;
    @FXML
    private TableColumn<?, ?> column_year;
    @FXML
    private TextField txt_search;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void add(ActionEvent event) {
    }

    @FXML
    private void update(ActionEvent event) {
    }

    @FXML
    private void delete(ActionEvent event) {
    }
    
}
