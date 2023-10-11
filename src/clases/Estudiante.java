package clases;

/**
 * The Student class represents a user who is a student in the library
 * management system. It inherits attributes and methods from the User class
 */
public class Estudiante extends Usuario {

    private String type;

    public Estudiante(String idUser, String password, String userName, String 
            type, String birthDay, String identification, String name, String 
                    lastName, String secondName) {
        super(idUser, password, userName, type, birthDay, identification, name,
                lastName, secondName);
    }

    public String getType() {
        return type;
    }

    public void setTipo(String type) {
        this.type = type;
    }

}
