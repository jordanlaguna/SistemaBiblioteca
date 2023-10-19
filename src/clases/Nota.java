package clases;
/**
 *
 * The Note class is a representation of a note entity in a system. in order to
 * add notes, referring to the loan.
 */
import java.util.Date;

public class Nota  {

    private Date date;
    private String identification;
    private String note;
  
     /**
     *
     * @param date = A Date attribute that stores the date the note was
     * created.
     * @param identification = An integer (int) attribute that stores a number related
     * to the note. A unique identifier or simply a number associated with the
     * note.
     * @param note = A String attribute that stores the content or text of the
     * note itself.
     */

    public Nota(Date date, String identification, String note) {
        this.date = date;
        this.identification = identification; 
        this.note = note;
    }

    

    public Nota() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    
     public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }
    
    
    /**
     * This function is probably used to add new notes.
     *
     */
    public void add() {
    }
     /**
     * This function could be used to search for relevant notes of information
     * in the system.
     */
    public void search() {
    }
    /**
     * This function is used to modify existing notes in the record or existing
     * data in the system.
     */
    public void update() {
    }
     /**
     * This function is used to delete system notes.
     */
    public void delete() {
    }
}
