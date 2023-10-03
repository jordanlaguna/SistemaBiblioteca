
import java.util.Date;

/**
 * The person class is designed in order to identify the types of people,
 * whether teacher or student, and has its variables that are inherited in both
 * the teacher and student class.
 */
public class Persona {

    private Date fechaNacimiento;

    private String cedula;

    private String nombre;

    private String pApellido;

    private String sApellido;

    /**
     *
     * @param fechaNacimiento = dateBirth: An attribute of type Date that stores
     * the date of birth of the person.
     * @param cedula = A String type attribute that stores the person's ID
     * number
     * @param nombre = A String attribute that stores the name of the person.
     * @param pApellido = A String attribute that stores the person's first last
     * name.
     * @param sApellido = A String attribute that stores the person's second
     * last name.
     */
    public Persona(Date fechaNacimiento, String cedula, String nombre, String pApellido, String sApellido) {
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
        this.nombre = nombre;
        this.pApellido = pApellido;
        this.sApellido = sApellido;
    }

    public Persona() {
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getpApellido() {
        return pApellido;
    }

    public void setpApellido(String pApellido) {
        this.pApellido = pApellido;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

}
