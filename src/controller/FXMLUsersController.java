/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import clases.Libro;
import clases.Usuario;
import conexionDB.ConexionUsuarios;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
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
public class FXMLUsersController implements Initializable {

    @FXML
    private TextField txt_identification;
    @FXML
    private TextField txt_name;
    @FXML
    private TextField txt_lastName;
    @FXML
    private TextField txt_secondName;
    @FXML
    private DatePicker datePicker;
    @FXML
    private TextField txt_phone;
    @FXML
    private TextField txt_email;
    @FXML
    private PasswordField txt_password;
    @FXML
    private ComboBox<?> cmbType;
    @FXML
    private Button btn_update;
    @FXML
    private Button btn_delete;
    @FXML
    private TextField txt_search;
    @FXML
    private TableView<Usuario> tbw_users;
    @FXML
    private TableColumn<Usuario, DatePicker> column_birthDay;
    @FXML
    private TableColumn<Usuario, String> column_identification;
    @FXML
    private TableColumn<Usuario, String> column_name;
    @FXML
    private TableColumn<Usuario, String> column_lastName;
    @FXML
    private TableColumn<Usuario, String> column_secondName;
    @FXML
    private TableColumn<Usuario, Integer> column_phone;
    @FXML
    private TableColumn<Usuario, String> column_correo;
    @FXML
    private TableColumn<Usuario, String> column_password;
    @FXML
    private TableColumn<Usuario, String> column_type;
    private ObservableList<Usuario> users = FXCollections.observableArrayList();
    
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cargarDatos();
    }

    @FXML
    private void update(ActionEvent event) {
    }

    @FXML
    private void delete(ActionEvent event) {
    }

    @FXML
    private void Items(MouseEvent event) {
    }

    private void cargarDatos() {

        conn = ConexionUsuarios.getConnection();
        column_birthDay.setCellValueFactory(new PropertyValueFactory<Usuario, DatePicker>("birth_date"));
        column_identification.setCellValueFactory(new PropertyValueFactory<
                Usuario, String>("identification"));
        column_name.setCellValueFactory(new PropertyValueFactory<Usuario, String>("name"));
        column_lastName.setCellValueFactory(new PropertyValueFactory<Usuario, String>("lastName"));
        column_secondName.setCellValueFactory(new PropertyValueFactory<Usuario, String>("secondName"));
        column_phone.setCellValueFactory(new PropertyValueFactory<Usuario, Integer>("telephone"));
        column_correo.setCellValueFactory(new PropertyValueFactory<Usuario, String>("email"));
        column_password.setCellValueFactory(new PropertyValueFactory<Usuario, String>("password"));
        column_type.setCellValueFactory(new PropertyValueFactory<Usuario, String>("type"));
        users = ConexionUsuarios.getDataUsuario();
        tbw_users.setItems(users);
    }

    @FXML
    private void search(KeyEvent ke) {
        FilteredList<Usuario> filterData = new FilteredList<>(users, p -> true);
        txt_search.textProperty().addListener((obsevable, oldvalue, newvalue) -> {
            filterData.setPredicate(User -> {
                if (newvalue == null || newvalue.isEmpty()) {
                    return true;
                }
                String tipoTexto = newvalue.toLowerCase();
                if (User.getBirth_date().toString().contains(tipoTexto)) {

                    return true;
                }
                if (User.getIdentification().toLowerCase().indexOf(tipoTexto) != -1) {

                    return true;
                }
                if (User.getName().toLowerCase().indexOf(tipoTexto) != -1) {

                    return true;
                }

                if (User.getLastName().toLowerCase().indexOf(tipoTexto) != -1) {

                    return true;
                }
                if (User.getSecondName().toLowerCase().indexOf(tipoTexto) != -1) {

                    return true;
                }
                 if (String.valueOf(User.getTelephone()).toLowerCase().
                         indexOf(tipoTexto) != -1) {

                    return true;
                }
                if (User.getEmail().toLowerCase().indexOf(tipoTexto) != -1) {

                    return true;
                }
                if (User.getPassword().toLowerCase().indexOf(tipoTexto) != -1) {

                    return true;
                }
                if (User.getType().toLowerCase().indexOf(tipoTexto) != -1) {

                    return true;
                }
                return false;
            });
            SortedList<Usuario> sortedList = new SortedList<>(filterData);
            sortedList.comparatorProperty().bind(tbw_users.comparatorProperty());
            tbw_users.setItems(sortedList);
        });
    }
}
