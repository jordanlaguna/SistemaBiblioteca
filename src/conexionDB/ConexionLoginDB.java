/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionDB;

import clases.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;

public class ConexionLoginDB {

    Connection conn;

    public static Connection conn() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabiblioteca", "root", "");
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

    public static ObservableList<Usuario> getDataUsuario() {

        Connection con = conn();
        ObservableList<Usuario> list = FXCollections.observableArrayList();

        try {
            PreparedStatement ps = con.prepareStatement("select * from user");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Usuario(rs.getString("fechaNacimiento"), 
                        rs.getString("nombre"),
                        rs.getString("cedula"), rs.getString("primerApellido"), 
                        rs.getString("segundoApellido"), rs.getString("idUser"),
                        rs.getString("userName"), rs.getString("password"),
                        rs.getString("type")));
            }

        } catch (SQLException | NumberFormatException e) {

            System.out.println(e);

        }

        return list;
    }
}
