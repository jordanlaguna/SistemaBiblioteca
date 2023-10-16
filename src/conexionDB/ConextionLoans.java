/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
    to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.ConextionLoans
    to edit this template
 */
package conexionDB;

import clases.Devolucion;
import clases.Nota;
import clases.Prestamo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import java.util.List;

/**
 *
 * @author julio
 */
public class ConextionLoans {

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

    public static ObservableList<Prestamo> getDataBook() {

        Connection conn = conn();
        ObservableList<Prestamo> list = FXCollections.observableArrayList();

        try {
            PreparedStatement ps = conn.prepareStatement("select * from loan");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Prestamo(rs.getDate("loan_date"),
                        rs.getString("exemplars"),
                        rs.getDate("devolution_date"),
                        // rs.getList("unit"),
                        rs.getInt("loan_number")));
            }

        } catch (SQLException | NumberFormatException e) {

            System.out.println(e);
        }

        return list;
    }

    public static ObservableList<Nota> getNotas() {

        Connection conn = conn();
        ObservableList<Nota> list = FXCollections.observableArrayList();

        try {
            PreparedStatement ps = conn.prepareStatement("select * from note");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Nota(rs.getDate("date"),
                        rs.getInt("identification"),
                        rs.getString("noteDescription")));
            }

        } catch (SQLException | NumberFormatException e) {

            System.out.println(e);
        }

        return list;
    }

}
