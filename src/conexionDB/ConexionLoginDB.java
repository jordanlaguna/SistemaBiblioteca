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
            Connection conn = DriverManager.getConnection("jdbc:mysql://"
                    + "localhost:3306/sistemabiblioteca", "root", "");
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

        Connection conn = conn();
        ObservableList<Usuario> list = FXCollections.observableArrayList();

        try {
            PreparedStatement ps = conn.prepareStatement(
                    "select * from user");
            ResultSet rs = ps.executeQuery();

            addLoginToList(rs, list);

        } catch (SQLException | NumberFormatException e) {

            System.out.println(e);

        }
        return list;
    }

    private static void addLoginToList(ResultSet rs,
            ObservableList<Usuario> list) throws SQLException {
        if (rs.next()) {
            list.add(new Usuario(Integer.parseInt(rs.getString("id_person")),
                    rs.getDate("birth_date"),
                    rs.getString("identification"),
                    rs.getString("name"),
                    rs.getString("lastName"),
                    rs.getString("secondName"),
                    Integer.parseInt(rs.getString("telephone")),
                    Integer.parseInt(rs.getString("id_user")),
                    rs.getString("correo"), rs.getString("password"),
                    rs.getString("type")));
            addLoginToList(rs, list);
        }
    }

    /*
    public static ObservableList<Usuario> getDataUsuario() {

        Connection con = conn();
        ObservableList<Usuario> list = FXCollections.observableArrayList();

        try {
            PreparedStatement ps = con.prepareStatement("select * from user");
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                list.add(new Usuario(rs.getDate("birth_date"),
                        rs.getString("identification"),
                        rs.getString("name"),
                        rs.getString("lastName"),
                        rs.getString("secondName"),
                        Integer.parseInt(rs.getString("telephone")),
                        rs.getString("correo"), rs.getString("password"),
                        rs.getString("type")));
            }
        } catch (SQLException | NumberFormatException e) {

            e.printStackTrace();
        }

        return list;
    }
     */
}
