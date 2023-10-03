
import java.util.Date;

/**
 *
 * The Note class is a representation of a note entity in a system. in order to
 * add notes, referring to the loan.
 */
public class Nota {

    private Date fecha;

    private int numNotas;

    private String nota;

    /**
     *
     * @param fecha = A Date attribute that stores the date the note was
     * created.
     * @param numNotas = An integer (int) attribute that stores a number related
     * to the note. A unique identifier or simply a number associated with the
     * note.
     * @param nota = A String attribute that stores the content or text of the
     * note itself.
     */
    public Nota(Date fecha, int numNotas, String nota) {
        this.fecha = fecha;
        this.numNotas = numNotas;
        this.nota = nota;
    }

    public Nota() {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumNotas() {
        return numNotas;
    }

    public void setNumNotas(int numNotas) {
        this.numNotas = numNotas;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    /**
     * This function is probably used to add new notes.
     *
     */
    public void agregar() {
    }

    /**
     * This function could be used to search for relevant notes of information
     * in the system.
     */
    public void buscar() {
    }

    /**
     * This function is used to modify existing notes in the record or existing
     * data in the system.
     */
    public void modificar() {
    }

    /**
     * This function is used to delete system notes.
     */
    public void eliminar() {
    }
}
