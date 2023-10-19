/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import clases.Computadora;
import clases.Libro;
import conexionDB.ConexionLibros;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author jorda
 */
public class FXMLComputerController implements Initializable {

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
    private TableView<Computadora> tbw_computer;
    @FXML
    private TableColumn<Computadora, Integer> column_id;
    @FXML
    private TableColumn<Computadora, String> column_brand;
    @FXML
    private TableColumn<Computadora, String> column_quantity;
    @FXML
    private TableColumn<Computadora, String> column_available;

    private ObservableList<Computadora> Computer = FXCollections.observableArrayList();


    String aux;

    Integer index;
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    @FXML
    private TextField id;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        LoadDate();
        cmbBox.getItems().addAll("Disponible", "No disponible");
    }

    private void LoadDate() {
        this.column_id.setCellValueFactory(new PropertyValueFactory<Computadora, Integer>("id"));
        this.column_brand.setCellValueFactory(new PropertyValueFactory<Computadora, String>("trademark"));
        this.column_quantity.setCellValueFactory(new PropertyValueFactory<Computadora, String>("ubication"));
        this.column_available.setCellValueFactory(new PropertyValueFactory<Computadora, String>("available"));

        Computer = ConexionLibros.getDataComputer();
        tbw_computer.setItems(Computer);
    }

    @FXML
    private void add(ActionEvent event) {
        Computadora computer = new Computadora();
        computer.setTrademark(txt_brand.getText());
        computer.setUbication(txt_quantity.getText());
        computer.setAvailable((String) cmbBox.getValue());
        computer.add();
        LoadDate();
        CleanData();
    }

    private void CleanData() {
        txt_brand.clear();
        txt_quantity.clear();
        cmbBox.setValue(null);
    }

    @FXML
    private void update(ActionEvent event) {
        Computadora computer = new Computadora();
        computer.setId(Integer.parseInt(id.getText()));
        computer.setTrademark(txt_brand.getText());
        computer.setUbication(txt_quantity.getText());
        computer.setAvailable((String) cmbBox.getValue());
        computer.update();
        LoadDate();
        CleanData();
    }

    @FXML
    private void delete(ActionEvent event) {
        Computadora computer = new Computadora();
        computer.setId(Integer.parseInt(id.getText()));
        computer.delete();
        LoadDate();
        CleanData();
    }

    @FXML
    private void Items(MouseEvent event) {
        index = tbw_computer.getSelectionModel().getSelectedIndex();

        if (index <= -1) {
            return;
        } 

        Integer idValue = column_id.getCellData(index);
        id.setText(String.valueOf(idValue));
        txt_brand.setText(column_brand.getCellData(index));
        txt_quantity.setText(column_quantity.getCellData(index));
        cmbBox.setValue(column_available.getCellData(index));
    }

    @FXML
    private void buscarComputer(KeyEvent ke) {
        Computadora computer = new Computadora();
        computer.unitSearch(txt_search, tbw_computer);
    }

}