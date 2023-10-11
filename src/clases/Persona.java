package clases;

import java.util.Date;

/**
 * The person class is designed in order to identify the types of people,
 * whether teacher or student, and has its variables that are inherited in both
 * the teacher and student class.
 */

public class Persona  {

    private Date birth_date;

    private String identification;

    private String name;

    private String lastName;

    private String secondName;
    
    private int telephone;
     
    /**
     *
     * @param birth_date = dateBirth: An attribute of type Date that stores
     * the date of birth of the person.
     * @param identification = A String type attribute that stores the person's ID
     * number
     * @param name = A String attribute that stores the name of the person.
     * @param lastName = A String attribute that stores the person's first last
     * name.
     * @param secondName = A String attribute that stores the person's second
     * last name.
     * @param telephone = A String attribute that stores the person's second
     * last name.
     */

    public Persona(Date birth_date, String identification, String name, 
            String lastName, String secondName, int telephone) {
        this.birth_date = birth_date;
        this.identification = identification;
        this.name = name;
        this.lastName = lastName;
        this.secondName = secondName;
        this.telephone = telephone;
    }

    public Persona(){
        
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    
    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }


   
}
