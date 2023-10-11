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
import java.sql.SQLException;
import java.sql.Statement;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
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
    private ComboBox cmbBox;
    @FXML
    private ImageView iconLogin;
    @FXML
    private ImageView iconPass;
    @FXML
    private TextField userName;
    @FXML
    private TextField identification;
    @FXML
    private TextField secondName;
    @FXML
    private TextField lastName;
    @FXML
    private TextField name;
    @FXML
    private DatePicker birthDay;
    @FXML
    private ComboBox cmbType;
    @FXML
    private TextField telephone;

    @FXML
    private Label textRegis;
    @FXML
    private Label textRegis1;
    @FXML
    private Button btn_exit;
    @FXML
    private Button btn_exit1;

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbType.getItems().addAll("Estudiante", "Profesor");
        cmbBox.getItems().addAll("Admin", "Estudiante");
        labelLogin.setVisible(false);
        emailLogin.setVisible(false);
        passwordLogin.setVisible(false);
        buttonLogin.setVisible(false);
        forgotPassword.setVisible(false);
        buttonInicio.setVisible(false);
        cmbBox.setVisible(false);
        iconLogin.setVisible(false);
        iconPass.setVisible(false);
        btn_exit1.setVisible(false);
    }

    @FXML
    private void iniciarSesion(MouseEvent event) {

        TranslateTransition slide = new TranslateTransition();
        slide.setDuration(Duration.seconds(0.5));
        slide.setNode(paneUno);

        slide.setToX(570);
        slide.play();

        paneDos.setTranslateX(-400);
        labelLogin.setVisible(true);
        emailLogin.setVisible(true);
        passwordLogin.setVisible(true);
        buttonLogin.setVisible(true);
        forgotPassword.setVisible(true);
        buttonInicio.setVisible(true);
        cmbBox.setVisible(true);
        iconLogin.setVisible(true);
        iconPass.setVisible(true);
        btn_exit1.setVisible(true);

        textRegis.setVisible(false);
        textRegis1.setVisible(false);
        label2.setVisible(false);
        passwordRegis.setVisible(false);
        buttonRegister.setVisible(false);
        buttonRegis.setVisible(false);

        identification.setVisible(false);
        name.setVisible(false);
        lastName.setVisible(false);
        secondName.setVisible(false);
        birthDay.setVisible(false);
        telephone.setVisible(false);
        userName.setVisible(false);
        cmbType.setVisible(false);
        btn_exit.setVisible(false);

        slide.setOnFinished((e -> {

        }));
    }

    @FXML
    private void registrarUsuario(MouseEvent event) {
        TranslateTransition slide = new TranslateTransition();
        slide.setDuration(Duration.seconds(0.5));
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
        iconLogin.setVisible(false);
        iconPass.setVisible(false);
        btn_exit1.setVisible(false);

        label2.setVisible(true);
        userName.setVisible(true);
        passwordRegis.setVisible(true);
        buttonRegister.setVisible(true);
        buttonRegis.setVisible(true);
        identification.setVisible(true);
        name.setVisible(true);
        lastName.setVisible(true);
        secondName.setVisible(true);
        birthDay.setVisible(true);
        telephone.setVisible(true);
        userName.setVisible(true);
        cmbType.setVisible(true);
        btn_exit.setVisible(true);

        slide.setOnFinished((e -> {

        }));
    }

    @FXML
    private void Login(ActionEvent event) throws IOException {
        conn = ConexionLoginDB.conn();

        String sql = "Select * from user where email = ? and password = ? and type =? ";

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

        } catch (IOException | SQLException e) {
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
    @FXML
    private void registrarUser(ActionEvent event) {
        Connection conn = null;
        PreparedStatement ps1 = null;
        PreparedStatement ps2 = null;

        try {
            conn = ConexionLoginDB.conn();
            conn.setAutoCommit(false);

            // Insertar en la tabla "person"
            String sqlPerson = "INSERT INTO person (birth_date, identification, name, lastName, secondName, telephone) VALUES (?, ?, ?, ?, ?, ?)";
            ps1 = conn.prepareStatement(sqlPerson, Statement.RETURN_GENERATED_KEYS);
            ps1.setString(1, birthDay.getValue().toString());
            ps1.setString(2, identification.getText());
            ps1.setString(3, name.getText());
            ps1.setString(4, lastName.getText());
            ps1.setString(5, secondName.getText());
            ps1.setString(6, telephone.getText());
            ps1.executeUpdate();

            ResultSet generatedKeys = ps1.getGeneratedKeys();
            int idPerson = -1;
            if (generatedKeys.next()) {
                idPerson = generatedKeys.getInt(1);
            } else {
                throw new SQLException("No se pudo obtener el ID de persona generado.");
            }
            // Insertar en la tabla "user"
            String sqlUser = "INSERT INTO user (id_user, email, password, type) VALUES (?, ?, ?, ?)";
            ps2 = conn.prepareStatement(sqlUser);
            ps2.setInt(1, idPerson);  // Usar el ID de persona como ID de usuario
            ps2.setString(2, userName.getText());
            ps2.setString(3, passwordRegis.getText());
            ps2.setString(4, cmbType.getValue().toString());
            ps2.executeUpdate();

            conn.commit();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Información");
            alert.setContentText("Usuario agregado con éxito");
            alert.showAndWait();
        } catch (Exception e) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("No se pudo agregar el usuario: " + e.getMessage());
            alert.showAndWait();
        } finally {
            try {
                if (ps1 != null) {
                    ps1.close();
                }
                if (ps2 != null) {
                    ps2.close();
                }
                if (conn != null) {
                    conn.setAutoCommit(true);
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        cleanTextFields();
    }

    @FXML
    private void exit(ActionEvent event) {
        System.exit(0);
    }
    private void cleanTextFields(){
        birthDay.setValue(null);
        identification.clear();
        name.clear();
        lastName.clear();
        secondName.clear();
        telephone.clear();
        userName.clear();
        passwordRegis.clear();
        cmbType.setValue(null);
        
    }
}
