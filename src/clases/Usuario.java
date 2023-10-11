package clases;

import java.sql.Date;

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

    public Usuario(Date birth_date, String identification, String name, String 
            lastName,String secondName, int telephone, String email, 
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
