/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author jorda
 */
public class FXMLHomeController implements Initializable {

    @FXML
    private Label label_users;
    @FXML
    private Label label_books;
    @FXML
    private Label label_laptos;
    @FXML
    private Label label_tablets;
    @FXML
    private Label label_Ptablets;
    @FXML
    private Label label_Plaptos;
    @FXML
    private Label label_Pbooks;
    
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306"
            + "/sistemabiblioteca";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        loadUsers();
        loadBooks();
        loadComputers();
        loadTablets();
        loadBooksNot();
        loadComputersNot();
        loadTabletsNot();
    }    
    
    public int loadUsers(){
   
        String consulta = "SELECT COUNT(*) FROM user";
         

        try {

            Connection conexion = DriverManager.getConnection(JDBC_URL, DB_USER,
                    DB_PASSWORD);
           
            PreparedStatement preparedStatement = conexion.
                    prepareStatement(consulta);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                int row = resultSet.getInt(1);
                if(row < 10){
                   label_users.setText("0"+row); 
                }else{
                   label_users.setText(""+row);
                }
                
                return row;
            }

            resultSet.close();
            preparedStatement.close();
            conexion.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1; // Retorna -1 si hay algún error
    }
    
    public int loadBooks(){
        // Consulta SQL para contar las filas en la tabla (reemplaza "nombre_tabla" con el nombre de tu tabla)
         
        String consultaDos = "SELECT COUNT(*) FROM book WHERE available = "
                + "'Disponible'";

        try {

            Connection conexion = DriverManager.getConnection(JDBC_URL, DB_USER,
                    DB_PASSWORD);

            PreparedStatement preparedStatement = 
                    conexion.prepareStatement(consultaDos);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                // Obtener la cantidad de filas
                int rows = resultSet.getInt(1);
                if(rows < 10){
                   label_books.setText("0"+rows); 
                }else{
                   label_books.setText(""+rows);
                }
                
                return rows;
            }

            resultSet.close();
            preparedStatement.close();
            conexion.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1; // Retorna -1 si hay algún error
    }
    
    public int loadComputers(){
         String consultaDos = "SELECT COUNT(*) FROM computer WHERE available = "
               + "'Disponible'";
         

        try {
            Connection conexion = DriverManager.getConnection(JDBC_URL, DB_USER,
                    DB_PASSWORD);

            PreparedStatement preparedStatement = 
                    conexion.prepareStatement(consultaDos);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                // Obtener la cantidad de filas
                int rowQuan = resultSet.getInt(1);
                if(rowQuan < 10){
                   label_laptos.setText("0"+rowQuan); 
                }else if(rowQuan < 100 && rowQuan > 9){
                   label_laptos.setText(" "+rowQuan);
                }else{
                    label_laptos.setText(""+rowQuan);
                }
                
                return rowQuan;
            }
 
            resultSet.close();
            preparedStatement.close();
            conexion.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1; // Retorna -1 si hay algún error
    }
    public int loadTablets(){
      
       String consultaDos = "SELECT COUNT(*) FROM tablet WHERE available = "
               + "'Disponible'";
         

        try {

            Connection conexion = DriverManager.getConnection(JDBC_URL, DB_USER,
                    DB_PASSWORD);

            PreparedStatement preparedStatement = 
                    conexion.prepareStatement(consultaDos);

            ResultSet resultSet = preparedStatement.executeQuery();
 
            if (resultSet.next()) {

                int quanRows = resultSet.getInt(1);
                if(quanRows < 10){
                   label_tablets.setText("0"+quanRows); 
                }else{
                   label_tablets.setText(""+quanRows);
                }
                
                return quanRows;
            }

            resultSet.close();
            preparedStatement.close();
            conexion.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1; // Retorna -1 si hay algún error
    }
    public int loadBooksNot(){

        String consultaDos = "SELECT COUNT(*) FROM book WHERE available = "
                + "'No disponible'";

        try {
            Connection conexion = DriverManager.getConnection(JDBC_URL, DB_USER,
                    DB_PASSWORD);

            PreparedStatement preparedStatement = 
                    conexion.prepareStatement(consultaDos);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                // Obtener la cantidad de filas
                int rows = resultSet.getInt(1);
                if(rows < 10){
                   label_Pbooks.setText("0"+rows); 
                }else if(rows < 100 && rows > 9){
                   label_Pbooks.setText(" "+rows);
                }else{
                    label_Pbooks.setText(""+rows);
                }
                
                return rows;
            }

            resultSet.close();
            preparedStatement.close();
            conexion.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1; 
    }
    
    public int loadComputersNot(){
      
       String consultaDos = "SELECT COUNT(*) FROM computer WHERE available = "
               + "'No disponible'";
         

        try {

            Connection conexion = DriverManager.getConnection(JDBC_URL, DB_USER,
                    DB_PASSWORD);
            
            PreparedStatement preparedStatement = 
                    conexion.prepareStatement(consultaDos);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                int row = resultSet.getInt(1);
                
                if(row < 10){
                   label_Plaptos.setText("0"+row); 
                }else{
                   label_Plaptos.setText(""+row);
                }
                
                
                return row;
            }
            resultSet.close();
            preparedStatement.close();
            conexion.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1;
    }
    public int loadTabletsNot(){
      
       String consultaDos = "SELECT COUNT(*) FROM tablet WHERE available = "
               + "'No disponible'";
         

        try {

            Connection conexion = DriverManager.getConnection(JDBC_URL, DB_USER,
                    DB_PASSWORD);

            PreparedStatement preparedStatement = 
                    conexion.prepareStatement(consultaDos);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                int rowss = resultSet.getInt(1);
                if(rowss < 10){
                   label_Ptablets.setText("0"+rowss); 
                }else{
                   label_Ptablets.setText(""+rowss);
                }
                
                return rowss;
            }

            resultSet.close();
            preparedStatement.close();
            conexion.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1;
    }
}
