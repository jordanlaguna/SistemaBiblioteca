public class Profesor  extends Usuario {
    /**
 * The variables are called from the User class
 * @param tipo = type: A String type attribute that represents the type of 
 * professor to make the difference if it contains a position at the University 
 * or not.
 */
    public Profesor(String tipo) {
        this.tipo = tipo;
    }
    
    public Profesor() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private String tipo;
}
