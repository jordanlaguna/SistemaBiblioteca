package clases;

import conexionDB.ConexionLoginDB;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.scene.control.Alert;

/**
 *
 * User is a public class that extends the Person class, which means that it
 * inherits attributes and methods from the Person class
 */
public class Usuario extends Persona {

    private String password;

    private String email;

    private String type;

    /**
     * @param birth_date =
     * @param identification = To request the user's ID
     * @param name = To request the name of the user
     * @param lastName = To request the last name of the user
     * @param secondName = To request the last name of the user
     * @param telephone = To request the last name of the user
     * @param email =username: A String attribute that likely stores the
     * username of the user.
     * @param password = password: A String attribute that likely stores the
     * user's password.
     * @param type = type: A String attribute of user classification or
     * categorization, such as "teacher", "student".
     */
    public Usuario(Date birth_date, String identification, String name, 
            String lastName, String secondName, int telephone, String email,
            String password, String type) {
        super(birth_date, identification, name, lastName, secondName, telephone);

        this.password = password;
        this.email = email;
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Its purpose is to identify whether the book is available or exists.
     */
    /**
     * The function to be able to make the function to make the request for the
     * book
     */
    public void verLibros() {
        
    }

    /**
     * The function to be able to make the function to make the request for the
     * book
     */
    public void pedirPrestamo(){
        
        
    }

    /**
     * The function to be able to log into the system and enter the systems
     */
    public boolean login(String email, String paaword, String type) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        conn = ConexionLoginDB.conn();
        String sql = "select * from user where email = ? and password = ? "
                + "and type = ?";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, this.email);
            ps.setString(2, this.password);
            ps.setString(3, this.type);
            rs = ps.executeQuery();

            if (rs.next()) {
                if ("Admin".equals(this.type)) {
                     Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText(null);
                    alert.setTitle("INFORMACIÓN");
                    alert.setContentText("Bienvenido administrador " 
                            + getEmail());
                    alert.showAndWait();
                }
                return true;
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
        return false;
    }
    

    /**
     * The function to register as a user, whether a person or student
     */
    public void registatrarse() throws SQLException {
        Connection conn = null;
        PreparedStatement ps1 = null;
        PreparedStatement ps2 = null;

        try {
            conn = ConexionLoginDB.conn();
            conn.setAutoCommit(false);

            // Insertar en la tabla "person"
            String sqlPerson = "insert into person (birth_date, "
                    + "identification, " + "name, "
                    + "lastName, secondName, telephone) "
                    + "values (?, ?, ?, ?, ?, ?)";
            ps1 = conn.prepareStatement(sqlPerson, Statement.RETURN_GENERATED_KEYS);
            ps1.setString(1, this.getBirth_date().toString());
            ps1.setString(2, this.getIdentification());
            ps1.setString(3, this.getName());
            ps1.setString(4, this.getLastName());
            ps1.setString(5, this.getSecondName());
            ps1.setString(6, String.valueOf(this.getTelephone()));
            ps1.executeUpdate();

            ResultSet generatedKeys = ps1.getGeneratedKeys();
            int idPerson = -1;
            if (generatedKeys.next()) {
                idPerson = generatedKeys.getInt(1);
            } else {
                throw new SQLException("No se pudo obtener el ID de persona"
                        + " generado.");
            }

            // Insertar en la tabla "user"
            String sqlUser = "insert into user (id_user, email, password, type)"
                    + " values (?, ?, ?, ?)";
            ps2 = conn.prepareStatement(sqlUser);
            ps2.setInt(1, idPerson); //Usar el ID de persona como ID de usuario
            ps2.setString(2, this.getEmail());
            ps2.setString(3, this.getPassword());
            ps2.setString(4, this.getType());
            ps2.executeUpdate();

            conn.commit();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Información");
            alert.setContentText("Usuario agregado con éxito");
            alert.showAndWait();
        } catch (Exception e) {
            if (conn != null) {
                conn.rollback();
            }

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("No se pudo agregar el usuario: "
                    + e.getMessage());
            alert.showAndWait();
        } finally {
            try {
                if (ps1 != null) {
                    ps1.close();
                }
                if (ps2 != null) {
                    ps2.close();
                }
                if (conn != null) {
                    conn.setAutoCommit(true);
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }
}
