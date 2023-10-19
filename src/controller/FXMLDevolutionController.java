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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
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
    private TableColumn<Devolucion, java.sql.Date> column_date;
    @FXML
    private TableColumn<Devolucion, java.sql.Date> column_deliverDate;
    @FXML
    private TableView<Devolucion> tbw_devolutions;

    private ObservableList<Devolucion> devolutions = FXCollections.observableArrayList();
    @FXML
    private TableColumn<Devolucion, String> column_action;
    @FXML
    private TableColumn<Devolucion, String> column_userEmail;
    @FXML
    private TableColumn<Devolucion, Integer> column_id;
    @FXML
    private TextField txt_id;
    Integer index;

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
        column_action.setCellValueFactory(new PropertyValueFactory<>
        ("deleteButton"));

        Callback<TableColumn<Devolucion, String>, TableCell<Devolucion, String>>
                cellFactory
                = new Callback<TableColumn<Devolucion, String>, TableCell
                        <Devolucion, String>>() {
            @Override
            public TableCell<Devolucion, String> call(final TableColumn
                    <Devolucion, String> param) {
                final TableCell<Devolucion, String> cell = new TableCell
                        <Devolucion, String>() {

                    final Button btn = new Button();

                    @Override
                    public void updateItem(String item, boolean empty) {
                        super.updateItem(item, empty);
                        if (empty) {
                            setGraphic(null);
                            setText(null);
                        } else {
                            // Configura la imagen del botón
                            ImageView imageView = new ImageView(new Image
                            (getClass().getResourceAsStream(
                                    "/img/eliminar.png")));
                            btn.setGraphic(imageView);
                            btn.getStyleClass().add("delete-button");
                            imageView.getStyleClass().add("image-view");

                            btn.setOnAction(event -> {
                                Devolucion devolucion = getTableView().
                                        getItems().get(getIndex());
                                eliminarDevolucion(devolucion.getId_loan());
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

    private void eliminarDevolucion(int id_loan) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "delete from loan where id_loan = ? ";

        try {
            conn = ConexionLoans.getConnection();
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setTitle("CONFIRMACIÓN");
            alert.setContentText("¿Desea eliminar los datos?");
            Optional<ButtonType> opcion = alert.showAndWait();

            if (opcion.get().equals(ButtonType.OK)) {
                ps = conn.prepareStatement(sql);
                ps.setInt(1, id_loan);
                ps.execute();
                alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("INFORMACIÓN");
                alert.setContentText("Datos eliminados con éxito.");
                alert.showAndWait();

                // 
                Devolucion devolucionToRemove = devolutions.stream()
                        .filter(devolucion -> devolucion.getId_loan() == id_loan)
                        .findFirst()
                        .orElse(null);

                if (devolucionToRemove != null) {
                    devolutions.remove(devolucionToRemove);
                    tbw_devolutions.refresh(); // 
                }

                
                Prestamo prestamo = new Prestamo();
                prestamo.setExemplars(devolucionToRemove.getExemplars());
                prestamo.availableBook();
                prestamo.availableComputer();
                prestamo.availableTablet();
            }
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Los datos no se pudieron eliminar. " + e);
            alert.showAndWait();
            System.out.println(e);
        }
    }

    @FXML
    private void searchDevolution(KeyEvent event) {
        Devolucion devolution = new Devolucion();
        Devolucion.search(searchDevolution, tbw_devolutions);
    }

    @FXML
    private void selectItems(MouseEvent event) {
        index = tbw_devolutions.getSelectionModel().getSelectedIndex();
        if (index <= -1) {
            return;
        }
        Integer idValue = column_id.getCellData(index);
        txt_id.setText(String.valueOf(idValue));
    }

    private void loadData(List<Prestamo> prestamos, int index) {
        if (index < prestamos.size()) {
            Prestamo prestamo = prestamos.get(index);
            Devolucion devolution = new Devolucion();
            devolution.setDate(prestamo.getDateLoan());
            devolution.setId_loan(prestamo.getId_loan());
            devolution.setDeliverDate(prestamo.getDateReturn());
            devolution.setExemplars(prestamo.getExemplars());
            devolution.setUser(prestamo.getFullName());
            devolution.setUserEmail(prestamo.getEmail());

            devolutions.add(devolution);
            loadData(prestamos, index + 1); 
        } else {
            column_id.setCellValueFactory(new PropertyValueFactory<Devolucion,
                    Integer>("id_loan"));
            column_user.setCellValueFactory(new PropertyValueFactory<Devolucion,
                    String>("user"));
            column_userEmail.setCellValueFactory(new PropertyValueFactory<
                    Devolucion, String>("userEmail"));
            column_exemplars.setCellValueFactory(new PropertyValueFactory<
                    Devolucion, String>("exemplars"));
            column_date.setCellValueFactory(new PropertyValueFactory<
                    Devolucion, java.sql.Date>("date"));
            column_deliverDate.setCellValueFactory(new PropertyValueFactory<
                    Devolucion, java.sql.Date>("deliverDate"));

            tbw_devolutions.setItems(devolutions);
        }
    }

}
