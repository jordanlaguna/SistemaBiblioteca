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

    private ObservableList<Computadora> Compu = FXCollections.observableArrayList();

    private ObservableList<Computadora> Compus;

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
        cargarDatos();
        cmbBox.getItems().addAll("Disponible", "No disponible");
        
    }

    private void cargarDatos() {
        this.column_id.setCellValueFactory(new PropertyValueFactory<Computadora, Integer>("id"));
        this.column_brand.setCellValueFactory(new PropertyValueFactory<Computadora, String>("trademark"));
        this.column_quantity.setCellValueFactory(new PropertyValueFactory<Computadora, String>("ubication"));

        this.column_available.setCellValueFactory(new PropertyValueFactory<Computadora, String>("available"));

        Compus = ConexionLibros.getDataComputer();
        tbw_computer.setItems(Compus);
    }

    @FXML
    private void add(ActionEvent event) {
        conn = ConexionLibros.conn();

        String sql = "insert into computer(trademark, ubication,"
                + " available)values(?,?,?)";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, txt_brand.getText());
            ps.setString(2, txt_quantity.getText());
            ps.setString(3, cmbBox.getValue().toString());

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
        cargarDatos();
        limpiarDatos();
    }

    private void limpiarDatos() {
        txt_brand.clear();
        txt_quantity.clear();
        cmbBox.setValue(null);
    }

    @FXML
    private void update(ActionEvent event) {
         
        try {
            conn = ConexionLibros.conn();
            String value1 = id.getText();
            String value2 = txt_brand.getText();
            String value3 = txt_quantity.getText();
            String value4 = (String) cmbBox.getValue();

            String sql = "update computer set trademark= '"
                    + value2 + "',ubication= '" + value3 + "',available= '"
                    + value4 + "' where id= '"
                    + value1 + "' ";

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
        cargarDatos();
        limpiarDatos();
    }

    @FXML
    private void delete(ActionEvent event) {
         String sql = "delete from computer where id = ? ";

        try {

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setTitle("CONFIRMACIÓN");
            alert.setContentText("¿Desea eliminar los datos?");
            Optional<ButtonType> opcion = alert.showAndWait();

            if (opcion.get().equals(ButtonType.OK)) {
                ps = conn.prepareStatement(sql);
                ps.setString(1, id.getText());
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
        cargarDatos();
        limpiarDatos();
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
        FilteredList<Computadora> filterData = new FilteredList<>(Compus, p -> true);
        txt_search.textProperty().addListener((obsevable, oldvalue, newvalue)->{
        filterData.setPredicate(Book ->{
           if(newvalue == null || newvalue.isEmpty()){
               return true;
           }
           String tipoTexto = newvalue.toLowerCase();
           if(Book.getUbication().toLowerCase().contains(tipoTexto)){
               
               return true;
           }
            if(Book.getTrademark().toLowerCase().contains(tipoTexto)){
               
               return true; 
           }
           
            if(Book.getAvailable().toLowerCase().contains(tipoTexto)){
               
               return true;
           }
           return false;
        });
            SortedList<Computadora> sortedList = new SortedList<>(filterData);
            sortedList.comparatorProperty().bind(tbw_computer.comparatorProperty());
            tbw_computer.setItems(sortedList);
        });
    }

}