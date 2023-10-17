/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import clases.Devolucion;
import clases.Prestamo;
import clases.Tablet;
import conexionDB.ConexionLoans;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author melan
 */
public class FXMLDevolutionController implements Initializable {

    @FXML
    private TextField searchDevolution;
    @FXML
    private TableColumn<Devolucion, String> column_user;
    @FXML
    private TableColumn<Devolucion, String> column_exemplars;
    @FXML
    private TableColumn<Devolucion, DatePicker> column_date;
    @FXML
    private TableColumn<Devolucion, DatePicker> column_deliverDate;
    @FXML
    private TableView<Devolucion> tbw_devolutions;

    private ObservableList<Devolucion> devolutions = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        loadData();
    }

    @FXML
    private void searchDevolution(KeyEvent event) {
        Devolucion devolucion = new Devolucion();
        Devolucion.search(searchDevolution, tbw_devolutions);
    }

    @FXML
    private void selectItems(MouseEvent event) {
    }

    private void loadData() {
        List<Prestamo> prestamos = ConexionLoans.getDataLoanAndNote();

        // Ahora, convierte los Prestamos en Devoluciones
        for (Prestamo prestamo : prestamos) {
            Devolucion devolucion = new Devolucion();
            devolucion.setDate(prestamo.getDateLoan()); // date=loan_date
            devolucion.setDeliverDate(prestamo.getDateReturn()); // deliverDate=devolution_date
            devolucion.setExemplars(prestamo.getExemplars()); // exemplars=exemplars
            //devolucion.setUser(prestamo.getUser()); // user=id_user
            devolutions.add(devolucion);
        }

        // Configura las celdas de la tabla para mostrar los datos
        column_user.setCellValueFactory(new PropertyValueFactory<>("user"));
        column_exemplars.setCellValueFactory(new PropertyValueFactory<>("exemplars"));
        column_date.setCellValueFactory(new PropertyValueFactory<>("date"));
        column_deliverDate.setCellValueFactory(new PropertyValueFactory<>("deliverDate"));

        // Agrega los datos a la tabla
        tbw_devolutions.setItems(devolutions);
    }
}
