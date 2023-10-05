package clases;


public class Usuario extends Persona {

    private String idUser;

    private String password;

    private String userName;

    private String type;

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
    
 
    public void verLibros() {
    }

    public void pedirPrestamo() {
    }

    public void login() {
    }

    public void registatrarse() {
    }
}
