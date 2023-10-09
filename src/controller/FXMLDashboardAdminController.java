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
    @FXML
    private Button btPedir;
    
    private BufferedReader lector;
    private String linea;
    private String partes[] = null;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void Pedir(ActionEvent event) {
        String nombreArchivo = "C:\\Users\\jorda\\Documents\\Documentos\\DatosLibros.csv";
        //"C:\\Users\\gatov\\OneDrive\\Documentos\\Biblioteca\\DatosParadigma.xlsx"
        try {
            lector = new BufferedReader(new FileReader(nombreArchivo));
            System.out.println("-------------------------------------------");
            while ((linea = lector.readLine()) != null){
                partes = linea.split("------");
                imprimirLinea();
                System.out.println();
            }
            lector.close();
            linea = null;
            partes=null;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }
    
    void imprimirLinea(){
        for (int i = 0; i < partes.length; i++) {
            System.out.println(partes[i]+" | ");
        }
    }

    @FXML
    private void openBook(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/vista/FXMLLibros.fxml"));
        containerMenu.getChildren().clear(); //lipiar
        containerMenu.getChildren().add(root);
    }

    
}
