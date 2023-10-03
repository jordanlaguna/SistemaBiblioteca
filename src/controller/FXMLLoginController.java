/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        labelLogin.setVisible(false);
        emailLogin.setVisible(false);
        passwordLogin.setVisible(false);
        buttonLogin.setVisible(false);
        forgotPassword.setVisible(false);
        buttonInicio.setVisible(false);
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

        label2.setVisible(true);
        emailRegis.setVisible(true);
        passwordRegis.setVisible(true);
        buttonRegister.setVisible(true);
        buttonRegis.setVisible(true);

        slide.setOnFinished((e -> {

        }));
    }

}
