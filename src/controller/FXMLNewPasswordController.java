/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import conexionDB.ConexionUsuarios;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author gatov
 */
public class FXMLNewPasswordController implements Initializable {

    @FXML
    private TextField txtNuContra;
    @FXML
    private TextField txtVerifContra;
    @FXML
    private Button BtnReiciar;

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    @FXML
    private TextField txtUserName;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void ActReiniciar(ActionEvent event) {
        if (txtNuContra.getText().equals(txtVerifContra.getText())) {

            try {
                Connection conn = ConexionUsuarios.getConnection();
                String value1 = txtUserName.getText();
                String value2 = txtNuContra.getText();

                String sql = "update user set email= '" + value1 + "',password= '"
                        + value2 + "' where email= '"
                        + value1 + "' ";
                
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setTitle("CONFIRMACIÓN");
            alert.setContentText("¿Desea modificar los datos?");
            Optional<ButtonType> opcion = alert.showAndWait();

            if (opcion.get().equals(ButtonType.OK)) {
                pst = conn.prepareStatement(sql);
                pst.execute();
                alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("INFORMACIÓN");
                alert.setContentText("Datos modificados con éxito.");
                alert.showAndWait();

            }

                 
                // Regresa al inicio LOGIN 
                Parent Regreso = FXMLLoader.load(getClass().getResource("/vista/"
                        + "FXMLLogin.fxml"));
                Scene windowScene = new Scene(Regreso);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setScene(windowScene);
                window.show();

            } catch (Exception ex) {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("ERROR");
                alert.setContentText(" " + ex);
                alert.showAndWait();
            }

        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("La contraseña no coincide");//"Password do not match "
            alert.showAndWait();
        }

    }

}
