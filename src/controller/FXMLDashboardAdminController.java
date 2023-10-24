package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author melan
 */
public class FXMLDashboardAdminController implements Initializable {

    @FXML
    private AnchorPane slider;
    @FXML
    private StackPane containerMenu;
    @FXML
    private AnchorPane paneDash;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // Cargar la vista del dashboard al inicio
            Parent root = FXMLLoader.load(getClass().getResource(
                    "/vista/FXMLHome.fxml"));
            containerMenu.getChildren().clear(); // 
            containerMenu.getChildren().add(root); //
        } catch (IOException ex) {
            System.out.println("" + ex);

        }
    }

    @FXML
    private void openBook(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/vista/"
                + "FXMLBooks.fxml"));
        containerMenu.getChildren().clear(); 
        containerMenu.getChildren().add(root);
    }

    @FXML
    private void openComputer(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/vista/"
                + "FXMLComputer.fxml"));
        containerMenu.getChildren().clear();
        containerMenu.getChildren().add(root);
    }

    @FXML
    private void openTablet(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/vista/FXMLTablet"
                + ".fxml"));
        containerMenu.getChildren().clear(); 
        containerMenu.getChildren().add(root);
    }

    @FXML
    private void openLoans(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(
                "/vista/FXMLLoans.fxml"));
        containerMenu.getChildren().clear();
        containerMenu.getChildren().add(root);
    }

    @FXML
    private void openDash(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(
                "/vista/FXMLHome.fxml"));
        containerMenu.getChildren().clear();
        containerMenu.getChildren().add(root);
    }

    @FXML
    private void openUsers(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(
                "/vista/FXMLUsers.fxml"));
        containerMenu.getChildren().clear(); 
        containerMenu.getChildren().add(root);
    }

    @FXML
    private void openDevolutions(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(
                "/vista/FXMLDevolution.fxml"));
        containerMenu.getChildren().clear(); 
        containerMenu.getChildren().add(root);
    }

    @FXML
    private void loginBack(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista"
                + "/FXMLLogin.fxml"));
        Parent root = loader.load();
        FXMLLoginController ac = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.show();
        stage.setOnCloseRequest(e -> {
        });

        Stage myStage = (Stage) this.paneDash.getScene().getWindow();
        myStage.close();
    }
}
