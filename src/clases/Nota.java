package clases;
/**
 *
 * The Note class is a representation of a note entity in a system. in order to
 * add notes, referring to the loan.
 */
import java.util.Date;

public class Nota  {

    private Date date;

    private int numNotes;

    private String note;
     /**
     *
     * @param date = A Date attribute that stores the date the note was
     * created.
     * @param numNotes = An integer (int) attribute that stores a number related
     * to the note. A unique identifier or simply a number associated with the
     * note.
     * @param note = A String attribute that stores the content or text of the
     * note itself.
     */

    public Nota(Date date, int numNotes, String note) {
        this.date = date;
        this.numNotes = numNotes;
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

    public int getNumNotes() {
        return numNotes;
    }

    public void setNumNotes(int numNotes) {
        this.numNotes = numNotes;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
