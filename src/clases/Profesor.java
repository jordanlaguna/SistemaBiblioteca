package clases;

  /**
 * The variables are called from the User class
 * @param tipo = type: A String type attribute that represents the type of 
 * professor to make the difference if it contains a position at the University 
 * or not.
 */

public class Profesor extends Usuario {

    private String type;

    public Profesor(String idUser, String password, String userName, String 
            type, String birthDay, String identification, String name, String 
                    lastName, String secondName) {
        super(idUser, password, userName, type, birthDay, identification, name,
                lastName, secondName);
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }
}
