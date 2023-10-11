package clases;

/**
 *
 * User is a public class that extends the Person class, which means that it
 * inherits attributes and methods from the Person class
 */

public class Usuario extends Persona {

    private String idUser;

    private String password;

    private String userName;

    private String type;
     /**
     * @param fechaNacimiento
     * @param cedula = To request the user's ID
     * @param nombre = To request the name of the user
     * @param pApellido = To request the last name of the user
     * @param sApellido = To request the last name of the user
     * @param idUser = idUser: A String attribute that likely stores a unique
     * identifier for the user.
     * @param userName =username: A String attribute that likely stores the
     * username of the user.
     * @param password = password: A String attribute that likely stores the
     * user's password.
     * @param type = type: A String attribute of user classification or
     * categorization, such as "teacher", "student".
     */

    public Usuario(String idUser, String password, String userName, String type,
        String fechaNacimiento, String cedula, String nombre, String pApellido,
        String sApellido) {
        super(fechaNacimiento, cedula, nombre, pApellido, sApellido);
        this.idUser = idUser;
        this.password = password;
        this.userName = userName;
        this.type = type;
    }
   
    
    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
