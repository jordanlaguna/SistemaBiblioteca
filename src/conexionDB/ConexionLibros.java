/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionDB;

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
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "");
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
            PreparedStatement ps = conn.prepareStatement("select * from book");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Libro(rs.getString("fechaNacimiento"), 
                        rs.getString("nombre"),
                        rs.getString("cedula"), rs.getString("primerApellido"), 
                        rs.getDate("type")));
            }

        } catch (SQLException | NumberFormatException e) {

            System.out.println(e);

        }

        return list;
    }
}
