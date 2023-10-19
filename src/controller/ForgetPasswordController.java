/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Random;
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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * FXML Controller class
 *
 * @author gatov
 */
public class ForgetPasswordController implements Initializable {

    @FXML
    private TextField txtCorreo;
    @FXML
    private Button BtnEnviar;
    @FXML
    private TextField txtVerfCod;
    @FXML
    private Button BtnVerificar;

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement smtp = null;
    int randomCodigo;
    @FXML
    private AnchorPane containesFpass;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void ActEnvia(ActionEvent event) throws AddressException,
            MessagingException {
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql:"
                    + "//localhost/sistemabiblioteca", "root", "");
            String query = "select email from user where email= ?";
            pst = (PreparedStatement) con.prepareStatement(query);
            pst.setString(1, txtCorreo.getText());
            rs = pst.executeQuery();

            if (rs.next()) {

                try {
                    Random rand = new Random();
                    randomCodigo = rand.nextInt(999999);
                    String host = "smtp.gmail.com";
                    String user = "gatovalverde4@gmail.com";
                    String pass = "xvgn ynck gtdx snjn";
                    String to = txtCorreo.getText();
                    String subject = "Código de Verificació.";
                    String message = "Su código de reinicio es: "
                            + randomCodigo;
                    boolean sessionDebug = false;
                    Properties pros = System.getProperties();
                    pros.put("mail.smtp.starttls.enable", "true");
                    pros.put("mail.smtp.host", "host");
                    pros.put("mail.smtp.port", "587");
                    pros.put("mail.smtp.auth", "true ");
                    pros.put("mail.smtp.starttls.resquired", "true");
                    java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
                    Session mailSession = Session.getDefaultInstance(pros, null);
                    mailSession.setDebug(sessionDebug);
                    Message msg = new MimeMessage(mailSession);
                    msg.setFrom(new InternetAddress(user));
                    InternetAddress[] address = {new InternetAddress(to)};
                    msg.setRecipients(Message.RecipientType.TO, address);
                    msg.setSubject(subject);
                    msg.setText(message);
                    Transport transport = mailSession.getTransport("smtp");
                    transport.connect(host, user, pass);
                    transport.sendMessage(msg, msg.getAllRecipients());
                    transport.close();

                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText(null);
                    alert.setTitle("Información");
                    alert.setContentText("El código fue enviado al correo"
                            + "\n" + txtCorreo.getText()); // "Code has send to the email"
                    alert.showAndWait();
                    /*----------------------------------------------------------------------------------------------------*/

                } catch (MessagingException ex) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText(null);
                    alert.setTitle("ERROR");
                    alert.setContentText(" " + ex);
                    alert.showAndWait();

                }

            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("ERROR"); //"Code do not match"
                alert.setContentText("El correo no se encuentra registrado."
                        + "\nVerifique que esté bien escrito el correo.");
                alert.showAndWait();

            }

        } catch (SQLException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("No se puedo entrar a la base de datos.... "
                    + ex);
            alert.showAndWait();
        }
    }

    @FXML
    private void ActVerfica(ActionEvent event) throws IOException {
        if (Integer.valueOf(txtVerfCod.getText()) == randomCodigo) {

            FXMLLoader loader = new FXMLLoader(getClass().getResource(""
                    + "/vista/FXMLSendEmail.fxml"));
            Parent root = loader.load();
            FXMLNewPasswordController ac = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> {
            });

            Stage myStage = (Stage) this.containesFpass.getScene().getWindow();
            myStage.close();

        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("El código no coincide."); //"Code do not match"
            alert.setContentText(" ");
            alert.showAndWait();

        }
    }

    @FXML
    private void Cerrar(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(""
                + "/vista/FXMLLogin.fxml"));
        Parent root = loader.load();
        FXMLLoginController ac = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.show();

        stage.setOnCloseRequest(e -> {
        });

        Stage myStage = (Stage) this.containesFpass.getScene().getWindow();
        myStage.close();
    }

}
