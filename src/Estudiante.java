
/**
 * The Student class represents a user who is a student in the library
 * management system. It inherits attributes and methods from the User class
 */
public class Estudiante  extends Usuario {
   private String tipo;
   
  

    public Estudiante() {
    }
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

 
}
