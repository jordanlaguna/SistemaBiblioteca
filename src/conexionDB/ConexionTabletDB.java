/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionDB;

import clases.Tablet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author jorda
 */
public class ConexionTabletDB {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/"
            + "sistemabiblioteca";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de"
                    + " datos: " + e.getMessage());
        }
        return conn;
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexión cerrada.");
            } catch (SQLException e) {
                System.err.println("Error al cerrar la"
                        + " conexión: " + e.getMessage());
            }
        }
    }

    public static ObservableList<Tablet> getDataTablet() {

        Connection conn = getConnection();
        ObservableList<Tablet> list = FXCollections.observableArrayList();

        try {
            PreparedStatement ps = conn.prepareStatement("select * from tablet");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Tablet(Integer.parseInt(rs.getString("id_tab")),
                        rs.getString("trademark"),
                        rs.getString("ubication"),
                        rs.getString("available")));
            }
        } catch (SQLException | NumberFormatException e) {

            System.out.println(e);

        }

        return list;
    }

}
