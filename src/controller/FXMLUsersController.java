/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import clases.Usuario;
import conexionDB.ConexionUsuarios;
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
    private ComboBox cmbType;
    @FXML
    private Button btn_update;
    @FXML
    private Button btn_delete;
    @FXML
    private TextField txt_search;
    @FXML
    private TableView<Usuario> tbw_users;
    @FXML
    private TableColumn<Usuario, java.sql.Date> column_birthDay;
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

    private Integer index;
    Connection conn = null;
    PreparedStatement ps = null;
    PreparedStatement ps1 = null;
    ResultSet rs = null;
    @FXML
    private TextField txt_idPerson;
    @FXML
    private TextField txt_idUser;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbType.getItems().addAll("Admin", "Profesor", "Estudiante");
        loadData();
    }

    @FXML
    private void update(ActionEvent event) {
        try {
            conn = ConexionUsuarios.getConnection();
            //Actualiza la tabla persona.
            String value1 = txt_identification.getText();
            String value2 = txt_name.getText();
            String value3 = txt_lastName.getText();
            String value4 = txt_secondName.getText();
            String value5 = txt_phone.getText();
            String value6 = txt_email.getText();
            String value7 = txt_password.getText();
            String value8 = cmbType.getValue().toString();

            String sql = "update person set identification= '" + value1 + "'"
                    + ", name= '" + value2 + "', lastName= '" + value3 + "'"
                    + ", secondName= '" + value4 + "', telephone= '" + value5
                    + "' where identification= '" + value1 + "'";

            String sql2 = "update user set email= '" + value6 + "',password='"
                    + value7 + "',type='" + value8 + "'where email='"
                    + value6 + "' ";

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setTitle("CONFIRMACIÓN");
            alert.setContentText("¿Desea modificar los datos?");
            Optional<ButtonType> opcion = alert.showAndWait();

            if (opcion.get().equals(ButtonType.OK)) {
                ps = conn.prepareStatement(sql);
                ps1 = conn.prepareStatement(sql2);
                ps.execute();
                ps1.execute();
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
    }

    @FXML
    private void delete(ActionEvent event) {
        String sqlDeletePerson = "delete from person where identification = ?";
        String sqlDeleteUser = "delete from user where email = ?";
        conn = ConexionUsuarios.getConnection();

        try {
            ps = conn.prepareStatement(sqlDeleteUser);
            ps.setString(1, txt_identification.getText());
            ps.executeUpdate();

            // Eliminar de la tabla 'person'
            ps1 = conn.prepareStatement(sqlDeletePerson);
            ps1.setString(1, txt_email.getText());
            ps1.executeUpdate();
            
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("INFORMACIÓN");
                alert.setContentText("Usuario eliminado con éxito.");
                alert.showAndWait();       

            txt_idPerson.clear();
            txt_idUser.clear();

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Los datos no se pudieron eliminar. " + e);
            alert.showAndWait();
        }
        loadData();

    }

    @FXML
    private void Items(MouseEvent event) {
        index = tbw_users.getSelectionModel().getSelectedIndex();

        if (index <= -1) {
            return;
        }

        java.sql.Date sqlDate = (java.sql.Date) column_birthDay.
                getCellData(index);
        // Convierte java.sql.Date a LocalDate
        LocalDate dateValue = sqlDate.toLocalDate();
        // Establece la fecha en el DatePicker
        datePicker.setValue(dateValue);
        txt_identification.setText(column_identification.getCellData(index));
        txt_name.setText(column_name.getCellData(index));
        txt_lastName.setText(column_lastName.getCellData(index));
        txt_secondName.setText(column_secondName.getCellData(index));
        txt_phone.setText(column_phone.getCellData(index).toString());
        txt_email.setText(column_correo.getCellData(index));
        txt_password.setText(column_password.getCellData(index));
        cmbType.setValue(column_type.getCellData(index));

    }

    private void loadData() {

        conn = ConexionUsuarios.getConnection();
        column_birthDay.setCellValueFactory(new PropertyValueFactory<Usuario, 
                java.sql.Date>("birth_date"));
        column_identification.setCellValueFactory(new PropertyValueFactory<
                Usuario, String>("identification"));
        column_name.setCellValueFactory(new PropertyValueFactory<Usuario, 
                String>("name"));
        column_lastName.setCellValueFactory(new PropertyValueFactory<Usuario,
                String>("lastName"));
        column_secondName.setCellValueFactory(new PropertyValueFactory<Usuario,
                String>("secondName"));
        column_phone.setCellValueFactory(new PropertyValueFactory<Usuario,
                Integer>("telephone"));
        column_correo.setCellValueFactory(new PropertyValueFactory<Usuario,
                String>("email"));
        column_password.setCellValueFactory(new PropertyValueFactory<Usuario, 
                String>("password"));
        column_type.setCellValueFactory(new PropertyValueFactory<Usuario, 
                String>("type"));
        users = ConexionUsuarios.getDataUsuario();
        tbw_users.setItems(users);
    }

    @FXML
    private void search(KeyEvent ke) {
        FilteredList<Usuario> filterData = new FilteredList<>(users, p -> true);
        txt_search.textProperty().addListener((obsevable, oldvalue, newvalue)
                -> {
            filterData.setPredicate(User -> {
                if (newvalue == null || newvalue.isEmpty()) {
                    return true;
                }
                String tipoTexto = newvalue.toLowerCase();
                if (User.getBirth_date().toString().contains(tipoTexto)) {

                    return true;
                }
                if (User.getIdentification().toLowerCase().indexOf(tipoTexto)
                        != -1) {

                    return true;
                }
                if (User.getName().toLowerCase().indexOf(tipoTexto) != -1) {

                    return true;
                }

                if (User.getLastName().toLowerCase().indexOf(tipoTexto) != -1) {

                    return true;
                }
                if (User.getSecondName().toLowerCase().indexOf(tipoTexto)
                        != -1) {

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
