/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionDB;

import clases.Computadora;
import clases.Libro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;

public class ConexionLibros {

    Connection conn;

    public static Connection conn() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        // URL de la base de datos
        String url = "jdbc:mysql://localhost:3306/sistemabiblioteca";
        String user = "root";
        String password = "";

        Connection conn = DriverManager.getConnection(url, user, password);
        return conn;
    } catch (ClassNotFoundException | SQLException e) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        alert.setContentText("No se pudo conectar a la base de datos" + e);
        alert.showAndWait();
        return null;
    }
}
     public static ObservableList<Libro> getDataBook() {
        Connection conn = conn();
        ObservableList<Libro> list = FXCollections.observableArrayList();

        try {
            PreparedStatement ps = conn.prepareStatement(
                    "select * from book");
            ResultSet rs = ps.executeQuery();

            addBooksToList(rs, list);

        } catch (SQLException | NumberFormatException e) {

            System.out.println(e);

        }

        return list;
    }
       private static void addBooksToList(ResultSet rs, 
               ObservableList<Libro> list) throws SQLException {
        if (rs.next()) {
              list.add(new Libro(Integer.parseInt(rs.getString("isbn")),
                        rs.getString("title"),
                        rs.getString("authorBook"),
                        rs.getString("editorial"),
                        rs.getString("available"),
                        rs.getDate("releaseDate")));
            addBooksToList(rs, list);
        }
    }
       
       
     public static ObservableList<Computadora> getDataComputer() {
        Connection conn = conn();
        ObservableList<Computadora> list = FXCollections.observableArrayList();

        try {
            PreparedStatement ps = conn.prepareStatement(
                    "select * from computer");
            ResultSet rs = ps.executeQuery();

            addComputersToList(rs, list);

        } catch (SQLException | NumberFormatException e) {

            System.out.println(e);

        }

        return list;
    }
       private static void addComputersToList(ResultSet rs, 
               ObservableList<Computadora> list) throws SQLException {
        if (rs.next()) {
             list.add(new Computadora(Integer.parseInt(rs.getString("id")),
                        rs.getString("trademark"),
                        rs.getString("ubication"),
                        rs.getString("available")));
            addComputersToList(rs, list);
        }
    }
   
}
