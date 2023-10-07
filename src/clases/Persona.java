package clases;


public class Persona  {

    private String birthDay;

    private String identification;

    private String name;

    private String firtsName;

    private String secondName;

    public Persona(String birthDay, String identification, String name, String firtsName, String secondName) {
        this.birthDay = birthDay;
        this.identification = identification;
        this.name = name;
        this.firtsName = firtsName;
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

    public String getFirtsName() {
        return firtsName;
    }

    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }


   
}
