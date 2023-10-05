/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import conexionDB.ConexionLoginDB;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author jorda
 */
public class FXMLLoginController implements Initializable {

    private Label label;
    @FXML
    private Label label2;
    @FXML
    private TextField emailRegis;
    @FXML
    private PasswordField passwordRegis;
    @FXML
    private TextField emailLogin;
    @FXML
    private PasswordField passwordLogin;
    @FXML
    private Label labelLogin;
    @FXML
    private Label labelUno;
    @FXML
    private Button buttonRegis;
    @FXML
    private Button buttonLogin;
    @FXML
    private AnchorPane paneDos;
    @FXML
    private AnchorPane paneUno;
    @FXML
    private Label forgotPassword;
    @FXML
    private Button buttonRegister;
    @FXML
    private Button buttonInicio;
    @FXML
    private StackPane PaneLogin;
    @FXML
    private ComboBox cmbBox;

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbBox.getItems().addAll("Admin", "Estudiante");
        labelLogin.setVisible(false);
        emailLogin.setVisible(false);
        passwordLogin.setVisible(false);
        buttonLogin.setVisible(false);
        forgotPassword.setVisible(false);
        buttonInicio.setVisible(false);
        cmbBox.setVisible(false);
    }

    @FXML
    private void iniciarSesion(MouseEvent event) {

        TranslateTransition slide = new TranslateTransition();
        slide.setDuration(Duration.seconds(0.7));
        slide.setNode(paneUno);

        slide.setToX(670);
        slide.play();

        paneDos.setTranslateX(-400);
        labelLogin.setVisible(true);
        emailLogin.setVisible(true);
        passwordLogin.setVisible(true);
        buttonLogin.setVisible(true);
        forgotPassword.setVisible(true);
        buttonInicio.setVisible(true);
        cmbBox.setVisible(true);

        label2.setVisible(false);
        emailRegis.setVisible(false);
        passwordRegis.setVisible(false);
        buttonRegister.setVisible(false);
        buttonRegis.setVisible(false);

        slide.setOnFinished((e -> {

        }));
    }

    @FXML
    private void registrarUsuario(MouseEvent event) {
        TranslateTransition slide = new TranslateTransition();
        slide.setDuration(Duration.seconds(0.7));
        slide.setNode(paneUno);

        slide.setToX(0);
        slide.play();

        paneDos.setTranslateX(10);
        labelLogin.setVisible(false);
        emailLogin.setVisible(false);
        passwordLogin.setVisible(false);
        buttonLogin.setVisible(false);
        forgotPassword.setVisible(false);
        buttonInicio.setVisible(false);
        cmbBox.setVisible(false);

        label2.setVisible(true);
        emailRegis.setVisible(true);
        passwordRegis.setVisible(true);
        buttonRegister.setVisible(true);
        buttonRegis.setVisible(true);
        cmbBox.setVisible(true);

        slide.setOnFinished((e -> {

        }));
    }

    @FXML
    private void Login(ActionEvent event) throws IOException {
        conn = ConexionLoginDB.conn();

        String sql = "Select * from usuarios where nombreUsuario = ? and contrasena = ? and tipo =? ";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, emailLogin.getText());
            ps.setString(2, passwordLogin.getText());
            ps.setString(3, cmbBox.getValue().toString());
            rs = ps.executeQuery();

            if (rs.next()) {
                if ("Admin".equals(cmbBox.getValue().toString())) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText(null);
                    alert.setTitle("INFORMACIÓN");
                    alert.setContentText("Bienvenido administrador " + emailLogin.getText());
                    alert.showAndWait();
                    buttonInicio.getScene().getWindow().hide();
                    Parent root = FXMLLoader.load(getClass().getResource("/vista/FXMLDashboardAdmin.fxml"));
                    Stage mainStage = new Stage();
                    Scene scene = new Scene(root);
                    mainStage.setScene(scene);
                    Image icon = new Image(getClass().getResourceAsStream("/img/bibliotecaenlinea.png"));
                    mainStage.getIcons().add(icon);
                    mainStage.setTitle("Biblioteca Admin");
                    mainStage.show();
                }

            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("ERROR");
                alert.setContentText("Usuario/Contraseña incorrectos");
                alert.showAndWait();
            }

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("No se puede iniciar sesión, ingrese los datos en la caja de texto. " + e);
            alert.showAndWait();
        }

    }

    /*FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/FXMLDashboardAdmin.fxml"));
        Parent root = loader.load();
        Stage app_stage;
        app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        Image icon = new Image(getClass().getResourceAsStream("/img/bibliotecaenlinea.png"));
        stage.getIcons().add(icon);
        stage.setTitle("Biblioteca Admin");

        stage.show();*/
}


