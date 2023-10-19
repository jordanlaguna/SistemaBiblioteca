/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import clases.Tablet;
import conexionDB.ConexionTabletDB;
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
import javafx.scene.control.Button;
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
public class FXMLTabletController implements Initializable {

    @FXML
    private TextField txt_brand;
    @FXML
    private ComboBox cmbBox;
    @FXML
    private Button btn_Add;
    @FXML
    private Button btn_update;
    @FXML
    private Button btn_delete;
    @FXML
    private TextField txt_search;
    @FXML
    private TableView<Tablet> tbw_tablet;
    @FXML
    private TableColumn<Tablet, Integer> column_id;
    @FXML
    private TableColumn<Tablet, String> column_brand;
    @FXML
    private TableColumn<Tablet, String> column_ubication;
    @FXML
    private TableColumn<Tablet, String> column_available;
    @FXML
    private TextField txt_ubication;
    @FXML
    private TextField txt_id;
    private ObservableList<Tablet> tablet = FXCollections.observableArrayList();

    Integer index;
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbBox.getItems().addAll("Disponible", "No disponible");
        loadData();
    }
    /**
     * 
     * @param event for the button 
     */
    @FXML
    private void add(ActionEvent event) {
        Tablet tablet = new Tablet();
        tablet.setTrademark(txt_brand.getText());
        tablet.setUbication(txt_ubication.getText());
        tablet.setAvailable((String) cmbBox.getValue());
        tablet.add();
        loadData();
        cleanData();
    }
    /**
     * 
     * @param event for the button
     */
    @FXML
    private void update(ActionEvent event) {
        Tablet tablet = new Tablet();
        tablet.setId_tab(Integer.parseInt(txt_id.getText()));
        tablet.setTrademark(txt_brand.getText());
        tablet.setUbication(txt_ubication.getText());
        tablet.setAvailable((String) cmbBox.getValue());
        tablet.update();
        loadData();
        cleanData();
    }
    /**
     * 
     * @param event for the button
     */
    @FXML
    private void delete(ActionEvent event) {
        Tablet tablet = new Tablet();
        tablet.setId_tab(Integer.parseInt(txt_id.getText()));
        tablet.delete();
        loadData();
        cleanData();
    }
    /**{
     * 
     * @param event fot the button
     */
    @FXML
    private void selectItems(MouseEvent event) {
        index = tbw_tablet.getSelectionModel().getSelectedIndex();

        if (index <= -1) {
            return;
        }

        Integer idValue = column_id.getCellData(index);
        txt_id.setText(String.valueOf(idValue));
        txt_brand.setText(column_brand.getCellData(index));
        txt_ubication.setText(column_ubication.getCellData(index));
        cmbBox.setValue(column_available.getCellData(index));
    }
    /**
     * 
     * @param event for the button
     */
    @FXML
    private void searchTablet(KeyEvent event) {
        Tablet tablet = new Tablet();
        tablet.unitSearch(txt_search, tbw_tablet);
    }

    private void loadData() {
        this.column_id.setCellValueFactory(new PropertyValueFactory<Tablet,
                Integer>("id_tab"));
        this.column_brand.setCellValueFactory(new PropertyValueFactory<Tablet,
                String>("trademark"));
        this.column_ubication.setCellValueFactory(new PropertyValueFactory<
                Tablet, String>("ubication"));
        this.column_available.setCellValueFactory(new PropertyValueFactory<
                Tablet, String>("available"));

        tablet = ConexionTabletDB.getDataTablet();
        tbw_tablet.setItems(tablet);
    }

    private void cleanData() {
        txt_brand.clear();
        txt_ubication.clear();
        cmbBox.setValue(null);
    }

}
