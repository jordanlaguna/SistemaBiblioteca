/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jorda
 */
public class FXMLComputadoraController implements Initializable {

    @FXML
    private Button btn_Add;
    @FXML
    private Button btn_update;
    @FXML
    private Button btn_delete;
    @FXML
    private TextField txt_search;
    @FXML
    private TextField txt_brand;
    @FXML
    private TextField txt_quantity;
    @FXML
    private ComboBox cmbBox;
    @FXML
    private TableView<?> tbw_computer;
    @FXML
    private TableColumn<?, ?> column_id;
    @FXML
    private TableColumn<?, ?> column_brand;
    @FXML
    private TableColumn<?, ?> column_quantity;
    @FXML
    private TableColumn<?, ?> column_available;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbBox.getItems().addAll("Disponible", "No disponible");
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
