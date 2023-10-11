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

    @FXML
    private void add(ActionEvent event) {
         conn = ConexionTabletDB.getConnection();

        String sql = "insert into tablet(trademark, ubication,"
                + " available)values(?,?,?)";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, txt_brand.getText());
            ps.setString(2, txt_ubication.getText());
            ps.setString(3, cmbBox.getValue().toString());

            ps.execute();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("INFORMACIÓN");
            alert.setContentText("Tablet guardada correctamente.");
            alert.showAndWait();

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("No se pudo guardar la tablet. " + e);
            alert.showAndWait();
        }
        loadData();
        cleanData();
    }

    @FXML
    private void update(ActionEvent event) {
         try {
            conn = ConexionTabletDB.getConnection();
            String value1 = txt_id.getText();
            String value2 = txt_brand.getText();
            String value3 = txt_ubication.getText();
            String value4 = (String) cmbBox.getValue();

             String sql = "update tablet set id_tab= '" + value1 + "'"+ 
                     ", trademark= '" + value2 + "', ubication= '" + value3 + 
                     "'"+ ", available= '" + value4 + "' where id_tab= '"
                     + value1 + "'";

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setTitle("CONFIRMACIÓN");
            alert.setContentText("¿Desea modificar los datos?");
            Optional<ButtonType> opcion = alert.showAndWait();

            if (opcion.get().equals(ButtonType.OK)) {
                ps = conn.prepareStatement(sql);
                ps.execute();
                alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("INFORMACIÓN");
                alert.setContentText("Datos modificados con éxito.");
                alert.showAndWait();

            }

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("No se pudo modificar el usuario. " + e);
            alert.showAndWait();

        }
        loadData();
        cleanData();
    }

    @FXML
    private void delete(ActionEvent event) {
         String sql = "delete from tablet where id_tab = ? ";
        try {

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setTitle("CONFIRMACIÓN");
            alert.setContentText("¿Desea eliminar los datos?");
            Optional<ButtonType> opcion = alert.showAndWait();

            if (opcion.get().equals(ButtonType.OK)) {
                ps = conn.prepareStatement(sql);
                ps.setString(1, txt_id.getText());
                ps.execute();
                alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("INFORMACIÓN");
                alert.setContentText("Datos eliminados con éxito.");
                alert.showAndWait();

            }

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Los datos no se pudieron eliminar. " + e);
            alert.showAndWait();
        }
        loadData();
        cleanData();
    }
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
    
    @FXML
    private void searchTablet(KeyEvent event) {
         FilteredList<Tablet> filterData = new FilteredList<>(tablet, p -> true);
        txt_search.textProperty().addListener((obsevable, oldvalue, newvalue)->{
        filterData.setPredicate(Tablet ->{
           if(newvalue == null || newvalue.isEmpty()){
               return true;
           }
           String tipoTexto = newvalue.toLowerCase();
           if(Tablet.getUbication().toLowerCase().contains(tipoTexto)){
               
               return true;
           }
            if(Tablet.getTrademark().toLowerCase().contains(tipoTexto)){
               
               return true; 
           }
           
            if(Tablet.getAvailable().toLowerCase().contains(tipoTexto)){
               
               return true;
           }
           return false;
        });
            SortedList<Tablet> sortedList = new SortedList<>(filterData);
            sortedList.comparatorProperty().bind(tbw_tablet.comparatorProperty());
            tbw_tablet.setItems(sortedList);
        });
    }
        
    private void loadData(){
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
    private void cleanData(){
        txt_brand.clear();
        txt_ubication.clear();
        cmbBox.setValue(null);
    }
 
}
