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
import java.time.LocalDate;
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
 * @author jorda
 */
public class FXMLBooksController implements Initializable {

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
    private TableColumn<Libro, java.sql.Date> column_year;
    @FXML
    private TableColumn<Libro, String> column_available;
    @FXML
    private TextField txt_search;
    private TextField txt_cantidad;

    private ObservableList<Libro> Libro = FXCollections.observableArrayList();

    private ObservableList<Libro> Libros;

    Integer index;
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

        String sql = "insert into book(isbn, title, authorBook,"
                + " editorial, available, releaseDate)values(?,?,?,?,?,?)";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, txt_isbn.getText());
            ps.setString(2, txt_title.getText());
            ps.setString(3, txt_author.getText());
            ps.setString(4, txt_editorial.getText());
            ps.setString(5, "Disponible");
            ps.setString(6, datePicker.getValue().toString());
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

    @FXML
    private void update(ActionEvent event) {
        try {
            conn = ConexionLibros.conn();
            String value1 = txt_isbn.getText();
            String value2 = txt_title.getText();
            String value3 = txt_author.getText();
            String value4 = txt_editorial.getText();

            String sql = "update book set isbn= '" + value1 + "',title= '"
                    + value2 + "',authorBook= '" + value3 + "',editorial= '"
                    + value4 + "' where isbn= '"
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

    private void limpiarDatos() {
        txt_isbn.clear();
        txt_title.clear();
        txt_author.clear();
        txt_editorial.clear();
        datePicker.setValue(null);
    }

    @FXML
    private void delete(ActionEvent event) {
        String sql = "delete from book where isbn = ? ";

        try {

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setTitle("CONFIRMACIÓN");
            alert.setContentText("¿Desea eliminar los datos?");
            Optional<ButtonType> opcion = alert.showAndWait();

            if (opcion.get().equals(ButtonType.OK)) {
                ps = conn.prepareStatement(sql);
                ps.setString(1, txt_isbn.getText());
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

    private void cargarDatos() {
        this.column_isbn.setCellValueFactory(new PropertyValueFactory<Libro,
                Integer>("isbn"));
        this.column_title.setCellValueFactory(new PropertyValueFactory<Libro,
                String>("title"));
        this.column_author.setCellValueFactory(new PropertyValueFactory<Libro,
                String>("authorBook"));
        this.column_editorial.setCellValueFactory(new PropertyValueFactory<Libro,
                String>("editorial"));
        this.column_year.setCellValueFactory(new PropertyValueFactory<Libro,
                java.sql.Date>("releaseDate"));
        this.column_available.setCellValueFactory(new PropertyValueFactory<Libro,
                String>("available"));

        Libros = ConexionLibros.getDataBook();
        tbw_libros.setItems(Libros);
    }

    @FXML
    private void buscar(KeyEvent ke) {
        FilteredList<Libro> filterData = new FilteredList<>(Libros, p -> true);
        txt_search.textProperty().addListener((obsevable, oldvalue, newvalue) -> {
            filterData.setPredicate(Book -> {
                if (newvalue == null || newvalue.isEmpty()) {
                    return true;
                }
                String tipoTexto = newvalue.toLowerCase();
                if (String.valueOf(Book.getIsbn()).toLowerCase().
                        indexOf(tipoTexto) != -1) {

                    return true;
                }
                if (Book.getTitle().toLowerCase().contains(tipoTexto)) {

                    return true;
                }
                if (Book.getAuthorBook().toLowerCase().contains(tipoTexto)) {

                    return true;
                }
                if (Book.getEditorial().toLowerCase().contains(tipoTexto)) {

                    return true;
                }
                if (Book.getReleaseDate().toString().contains(tipoTexto)) {
                    return true;
                }
                if (Book.getAvailable().toLowerCase().contains(tipoTexto)) {

                    return true;
                }
                return false;
            });
            SortedList<Libro> sortedList = new SortedList<>(filterData);
            sortedList.comparatorProperty().bind(tbw_libros.comparatorProperty());
            tbw_libros.setItems(sortedList);
        });
    }

    @FXML
    private void Items(MouseEvent event) {
        index = tbw_libros.getSelectionModel().getSelectedIndex();

        if (index <= -1) {
            return;
        }
        java.sql.Date sqlDate = (java.sql.Date) column_year.
                getCellData(index);
        // Convierte java.sql.Date a LocalDate
        LocalDate dateValue = sqlDate.toLocalDate();
        // Establece la fecha en el DatePicker
        datePicker.setValue(dateValue);
        txt_isbn.setText(column_isbn.getCellData(index).toString());
        txt_title.setText(column_title.getCellData(index));
        txt_author.setText(column_author.getCellData(index));
        txt_editorial.setText(column_editorial.getCellData(index));

    }
}
