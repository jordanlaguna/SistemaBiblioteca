package clases;
/**
 * The person class is designed in order to identify the types of people,
 * whether teacher or student, and has its variables that are inherited in both
 * the teacher and student class.
 */

public class Persona  {

    private String birthDay;

    private String identification;

    private String name;

    private String lastName;

    private String secondName;
     
    /**
     *
     * @param birthDay = dateBirth: An attribute of type Date that stores
     * the date of birth of the person.
     * @param identification = A String type attribute that stores the person's ID
     * number
     * @param name = A String attribute that stores the name of the person.
     * @param lastName = A String attribute that stores the person's first last
     * name.
     * @param secondName = A String attribute that stores the person's second
     * last name.
     */

    public Persona(String birthDay, String identification, String name, String lastName, String secondName) {
        this.birthDay = birthDay;
        this.identification = identification;
        this.name = name;
        this.lastName = lastName;
        this.secondName = secondName;
    }

    public Persona(){
        
    }
    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
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
