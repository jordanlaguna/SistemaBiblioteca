
import java.util.Date;

/**
 *
 * User is a public class that extends the Person class, which means that it
 * inherits attributes and methods from the Person class
 */
public class Usuario extends Persona {

    private String idUser;

    private String contrasena;

    private String nombreUsuario;

    private String tipo;

    /**
     * @param fechaNacimiento
     * @param cedula = To request the user's ID
     * @param nombre = To request the name of the user
     * @param pApellido = To request the last name of the user
     * @param sApellido = To request the last name of the user
     * @param idUser = idUser: A String attribute that likely stores a unique
     * identifier for the user.
     * @param nombreUsuario =username: A String attribute that likely stores the
     * username of the user.
     * @param contrasena = password: A String attribute that likely stores the
     * user's password.
     * @param tipo = type: A String attribute of user classification or
     * categorization, such as "teacher", "student".
     */
    public Usuario(String idUser, String contrasena, String nombreUsuario, String tipo, Date fechaNacimiento, String cedula, String nombre, String pApellido, String sApellido) {
        super(fechaNacimiento, cedula, nombre, pApellido, sApellido);
        this.idUser = idUser;
        this.contrasena = contrasena;
        this.nombreUsuario = nombreUsuario;
        this.tipo = tipo;
    }

    public Usuario(String idUser, String contrasena, String nombreUsuario, String tipo) {
        this.idUser = idUser;
        this.contrasena = contrasena;
        this.nombreUsuario = nombreUsuario;
        this.tipo = tipo;
    }

    public Usuario() {

    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
    public void pedirPrestamo() {
    }

    /**
     * The function to be able to log into the system and enter the systems
     */
    public void login() {
    }

    /**
     * The function to register as a user, whether a person or student
     */
    public void registatrarse() {
    }
}
