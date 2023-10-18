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
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.util.Callback;

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
    @FXML
    private TableColumn<Devolucion, String> column_action;
    @FXML
    private TableColumn<Devolucion, String> column_userEmail;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        loadData(ConexionLoans.getDataLoanAndNote(), 0);

        columnAction();
    }

    private void columnAction() {
        column_action.setCellValueFactory(new PropertyValueFactory<>("deleteButton"));

        Callback<TableColumn<Devolucion, String>, TableCell<Devolucion, String>> cellFactory
                = new Callback<TableColumn<Devolucion, String>, TableCell<Devolucion, String>>() {
            @Override
            public TableCell<Devolucion, String> call(final TableColumn<Devolucion, String> param) {
                final TableCell<Devolucion, String> cell = new TableCell<Devolucion, String>() {

                    final Button btn = new Button();

                    @Override
                    public void updateItem(String item, boolean empty) {
                        super.updateItem(item, empty);
                        if (empty) {
                            setGraphic(null);
                            setText(null);
                        } else {
                            // Configura la imagen del botón
                            ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("/img/eliminar.png")));
                            btn.setGraphic(imageView);
                            btn.getStyleClass().add("delete-button");
                            imageView.getStyleClass().add("image-view");

                            btn.setOnAction(event -> {
                                Devolucion devolucion = getTableView().getItems().get(getIndex());
                                eliminarDevolucion(devolucion);
                            });

                            setGraphic(btn);
                            setText(null);
                        }
                    }
                };
                return cell;
            }
        };

        column_action.setCellFactory(cellFactory);
    }

    private void eliminarDevolucion(Devolucion devolucion) {
        // Agrega aquí la lógica para eliminar la devolución
        // Puedes utilizar devolucion para identificar la devolución que se eliminará
        // y luego eliminarla de tu lista devolutions
        
        devolutions.remove(devolucion);
    }

    @FXML
    private void searchDevolution(KeyEvent event) {
        Devolucion devolucion = new Devolucion();
        Devolucion.search(searchDevolution, tbw_devolutions);
    }

    @FXML
    private void selectItems(MouseEvent event) {
    }

    private void loadData(List<Prestamo> prestamos, int index) {
        if (index < prestamos.size()) {
            Prestamo prestamo = prestamos.get(index);
            Devolucion devolucion = new Devolucion();
            devolucion.setDate(prestamo.getDateLoan());
            devolucion.setDeliverDate(prestamo.getDateReturn());
            devolucion.setExemplars(prestamo.getExemplars());
            devolucion.setUser(prestamo.getFullName());
            devolucion.setUserEmail(prestamo.getEmail());

            devolutions.add(devolucion);
            loadData(prestamos, index + 1); // Llamada recursiva para procesar el siguiente prestamo
        } else {
            // Cuando se procesan todos los préstamos, configura las celdas de la tabla y agrega los datos
            column_user.setCellValueFactory(new PropertyValueFactory<>("user"));
            column_userEmail.setCellValueFactory(new PropertyValueFactory<>("userEmail"));
            column_exemplars.setCellValueFactory(new PropertyValueFactory<>("exemplars"));
            column_date.setCellValueFactory(new PropertyValueFactory<>("date"));
            column_deliverDate.setCellValueFactory(new PropertyValueFactory<>("deliverDate"));

            tbw_devolutions.setItems(devolutions);
        }
    }

}
