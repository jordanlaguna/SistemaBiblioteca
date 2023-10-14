package conexionDB;

import clases.Usuario;
import static conexionDB.ConexionLibros.conn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ConexionUsuarios {
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
     public static ObservableList<Usuario> getDataUsuario() {

        Connection conn = conn();
        ObservableList<Usuario> list = FXCollections.observableArrayList();

        try {
            PreparedStatement ps = conn.prepareStatement("SELECT id_person, "
                    + "birth_date, identification, name, lastName,secondName , "
                    + "telephone, email, password, type " +
                    "FROM person " +
                    "INNER JOIN user ON person.id_person = user.id_user");
            ResultSet rs = ps.executeQuery();
         
            while (rs.next()) {
                list.add(new Usuario(rs.getDate("birth_date"), 
                        rs.getString("identification"), 
                        rs.getString("name"),
                        rs.getString("lastName"), 
                        rs.getString("secondName"),
                        Integer.parseInt(rs.getString("telephone")),
                        rs.getString("email"), rs.getString("password"),
                        rs.getString("type")));
            }

        } catch (SQLException | NumberFormatException e) {

            System.out.println(e);

        }

        return list;
    }
}
