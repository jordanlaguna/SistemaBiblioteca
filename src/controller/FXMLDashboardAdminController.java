/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
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
 
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

   
    @FXML
    private void openBook(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/vista/"
                + "FXMLLibros.fxml"));
        containerMenu.getChildren().clear(); //limpiar
        containerMenu.getChildren().add(root);
    }

    @FXML
    private void openComputer(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/vista/"
                + "FXMLComputadora.fxml"));
        containerMenu.getChildren().clear(); //limpiar
        containerMenu.getChildren().add(root);
    }

    @FXML
    private void openTablet(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/vista/FXMLTablet"
                + ".fxml"));
        containerMenu.getChildren().clear(); //limpiar
        containerMenu.getChildren().add(root);
    }

}
