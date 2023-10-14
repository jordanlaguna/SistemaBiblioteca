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
        cargarUsers();
        cargarBooks();
        cargarComputers();
        cargarTablets();
        cargarBooksNot();
        cargarComputersNot();
        cargarTabletsNot();
    }    
    
    public int cargarUsers(){
        // Consulta SQL para contar las filas en la tabla (reemplaza "nombre_tabla" con el nombre de tu tabla)
        String consulta = "SELECT COUNT(*) FROM user";
         

        try {
            // Establecer la conexión
            Connection conexion = DriverManager.getConnection(JDBC_URL, DB_USER,
                    DB_PASSWORD);
            
            // Crear una declaración preparada
            PreparedStatement preparedStatement = conexion.
                    prepareStatement(consulta);

            // Ejecutar la consulta
            ResultSet resultSet = preparedStatement.executeQuery();
            
            // Leer el resultado
            if (resultSet.next()) {
                // Obtener la cantidad de filas
                int cantidadFilas = resultSet.getInt(1);
                if(cantidadFilas < 10){
                   label_users.setText("0"+cantidadFilas); 
                }else{
                   label_users.setText(""+cantidadFilas);
                }
                
                return cantidadFilas;
            }
            
            // Cerrar la conexión y liberar recursos
            resultSet.close();
            preparedStatement.close();
            conexion.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1; // Retorna -1 si hay algún error
    }
    
    public int cargarBooks(){
        // Consulta SQL para contar las filas en la tabla (reemplaza "nombre_tabla" con el nombre de tu tabla)
         
        String consultaDos = "SELECT COUNT(*) FROM book WHERE available = "
                + "'Disponible'";

        try {
            // Establecer la conexión
            Connection conexion = DriverManager.getConnection(JDBC_URL, DB_USER,
                    DB_PASSWORD);
            
            // Crear una declaración preparada
            PreparedStatement preparedStatement = 
                    conexion.prepareStatement(consultaDos);

            // Ejecutar la consulta
            ResultSet resultSet = preparedStatement.executeQuery();
            
            // Leer el resultado
            if (resultSet.next()) {
                // Obtener la cantidad de filas
                int cantidadFilas = resultSet.getInt(1);
                if(cantidadFilas < 10){
                   label_books.setText("0"+cantidadFilas); 
                }else{
                   label_books.setText(""+cantidadFilas);
                }
                
                return cantidadFilas;
            }
            
            // Cerrar la conexión y liberar recursos
            resultSet.close();
            preparedStatement.close();
            conexion.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1; // Retorna -1 si hay algún error
    }
    
    public int cargarComputers(){
        // Consulta SQL para contar las filas en la tabla (reemplaza "nombre_tabla" con el nombre de tu tabla)
       String consultaDos = "SELECT COUNT(*) FROM computer WHERE available = "
               + "'Disponible'";
         

        try {
            // Establecer la conexión
            Connection conexion = DriverManager.getConnection(JDBC_URL, DB_USER,
                    DB_PASSWORD);
            
            // Crear una declaración preparada
            PreparedStatement preparedStatement = 
                    conexion.prepareStatement(consultaDos);

            // Ejecutar la consulta
            ResultSet resultSet = preparedStatement.executeQuery();
            
            // Leer el resultado
            if (resultSet.next()) {
                // Obtener la cantidad de filas
                int cantidadFilas = resultSet.getInt(1);
                if(cantidadFilas < 10){
                   label_laptos.setText("0"+cantidadFilas); 
                }else if(cantidadFilas < 100 && cantidadFilas > 9){
                   label_laptos.setText(" "+cantidadFilas);
                }else{
                    label_laptos.setText(""+cantidadFilas);
                }
                
                return cantidadFilas;
            }
            
            // Cerrar la conexión y liberar recursos
            resultSet.close();
            preparedStatement.close();
            conexion.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1; // Retorna -1 si hay algún error
    }
    public int cargarTablets(){
        // Consulta SQL para contar las filas en la tabla (reemplaza "nombre_tabla" con el nombre de tu tabla)
       String consultaDos = "SELECT COUNT(*) FROM tablet WHERE available = "
               + "'Disponible'";
         

        try {
            // Establecer la conexión
            Connection conexion = DriverManager.getConnection(JDBC_URL, DB_USER,
                    DB_PASSWORD);
            
            // Crear una declaración preparada
            PreparedStatement preparedStatement = 
                    conexion.prepareStatement(consultaDos);

            // Ejecutar la consulta
            ResultSet resultSet = preparedStatement.executeQuery();
            
            // Leer el resultado
            if (resultSet.next()) {
                // Obtener la cantidad de filas
                int cantidadFilas = resultSet.getInt(1);
                if(cantidadFilas < 10){
                   label_tablets.setText("0"+cantidadFilas); 
                }else{
                   label_tablets.setText(""+cantidadFilas);
                }
                
                return cantidadFilas;
            }
            
            // Cerrar la conexión y liberar recursos
            resultSet.close();
            preparedStatement.close();
            conexion.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1; // Retorna -1 si hay algún error
    }
    public int cargarBooksNot(){
        // Consulta SQL para contar las filas en la tabla (reemplaza "nombre_tabla" con el nombre de tu tabla)
         
        String consultaDos = "SELECT COUNT(*) FROM book WHERE available = "
                + "'No disponible'";

        try {
            // Establecer la conexión
            Connection conexion = DriverManager.getConnection(JDBC_URL, DB_USER,
                    DB_PASSWORD);
            
            // Crear una declaración preparada
            PreparedStatement preparedStatement = 
                    conexion.prepareStatement(consultaDos);

            // Ejecutar la consulta
            ResultSet resultSet = preparedStatement.executeQuery();
            
            // Leer el resultado
            if (resultSet.next()) {
                // Obtener la cantidad de filas
                int cantidadFilas = resultSet.getInt(1);
                if(cantidadFilas < 10){
                   label_Pbooks.setText("0"+cantidadFilas); 
                }else if(cantidadFilas < 100 && cantidadFilas > 9){
                   label_Pbooks.setText(" "+cantidadFilas);
                }else{
                    label_Pbooks.setText(""+cantidadFilas);
                }
                
                return cantidadFilas;
            }
            
            // Cerrar la conexión y liberar recursos
            resultSet.close();
            preparedStatement.close();
            conexion.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1; // Retorna -1 si hay algún error
    }
    
    public int cargarComputersNot(){
        // Consulta SQL para contar las filas en la tabla (reemplaza "nombre_tabla" con el nombre de tu tabla)
       String consultaDos = "SELECT COUNT(*) FROM computer WHERE available = "
               + "'No disponible'";
         

        try {
            // Establecer la conexión
            Connection conexion = DriverManager.getConnection(JDBC_URL, DB_USER,
                    DB_PASSWORD);
            
            // Crear una declaración preparada
            PreparedStatement preparedStatement = 
                    conexion.prepareStatement(consultaDos);

            // Ejecutar la consulta
            ResultSet resultSet = preparedStatement.executeQuery();
            
            // Leer el resultado
            if (resultSet.next()) {
                // Obtener la cantidad de filas
                int cantidadFilas = resultSet.getInt(1);
                
                if(cantidadFilas < 10){
                   label_Plaptos.setText("0"+cantidadFilas); 
                }else{
                   label_Plaptos.setText(""+cantidadFilas);
                }
                
                
                return cantidadFilas;
            }
            
            // Cerrar la conexión y liberar recursos
            resultSet.close();
            preparedStatement.close();
            conexion.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1; // Retorna -1 si hay algún error
    }
    public int cargarTabletsNot(){
        // Consulta SQL para contar las filas en la tabla (reemplaza "nombre_tabla" con el nombre de tu tabla)
       String consultaDos = "SELECT COUNT(*) FROM tablet WHERE available = "
               + "'No disponible'";
         

        try {
            // Establecer la conexión
            Connection conexion = DriverManager.getConnection(JDBC_URL, DB_USER,
                    DB_PASSWORD);
            
            // Crear una declaración preparada
            PreparedStatement preparedStatement = 
                    conexion.prepareStatement(consultaDos);

            // Ejecutar la consulta
            ResultSet resultSet = preparedStatement.executeQuery();
            
            // Leer el resultado
            if (resultSet.next()) {
                // Obtener la cantidad de filas
                int cantidadFilas = resultSet.getInt(1);
                if(cantidadFilas < 10){
                   label_Ptablets.setText("0"+cantidadFilas); 
                }else{
                   label_Ptablets.setText(""+cantidadFilas);
                }
                
                return cantidadFilas;
            }
            
            // Cerrar la conexión y liberar recursos
            resultSet.close();
            preparedStatement.close();
            conexion.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1; // Retorna -1 si hay algún error
    }
}
