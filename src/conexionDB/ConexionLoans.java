/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
    to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.ConexionLoans
    to edit this template
 */
package conexionDB;

import clases.Loan;
import static conexionDB.ConexionBooks.conn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


/**
 *
 * @author julio
 */
public class ConexionLoans {
    Connection conn;
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/"
            + "sistemabiblioteca";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de "
                    + "datos: " + e.getMessage());

            System.err.println("Error al conectar a la base de datos: "
                    + e.getMessage());
        }
        return conn;
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexión cerrada.");
            } catch (SQLException e) {
                System.err.println("Error al cerrar la "
                        + "conexión: " + e.getMessage());
            }
        }
    }
    
    public static ObservableList<Loan> getDataLoanAndNote() {
        Connection conn = conn(); 
        ObservableList<Loan> list = FXCollections.observableArrayList();
        
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT id_loan,"
                    + "loan_date, exemplars, loan_number,"
                    + "devolution_date, email,fullName,"
                    + "id, date, identification, noteDescription "
                    + "from loan " +
                    "inner join note on loan.id_loan = note.id");
            ResultSet rs = ps.executeQuery();

           addLoanToList(rs, list);
        } catch (SQLException e) {

            System.out.println(e);
        }

        return list;
    }

    private static void addLoanToList(ResultSet rs, ObservableList<Loan> 
            list) throws SQLException {
        if (rs.next()) 
             {
                list.add(new Loan(Integer.parseInt(rs.getString("id_loan")),
                        rs.getDate("loan_date"),
                        rs.getString("exemplars"), 
                        rs.getDate("devolution_date"),
                        rs.getInt("loan_number"),
                        rs.getString("email"),
                        rs.getString("fullName"),
                        rs.getDate("date"),
                        rs.getString("identification"), 
                        rs.getString("noteDescription"))); 
                 addLoanToList(rs, list);
             } 
    }
}
