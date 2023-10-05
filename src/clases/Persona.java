package clases;


import java.util.Date;

public class Persona  {

    private Date fechaNacimiento;

    private String cedula;

    private String nombre;

    private String pApellido;

    private String sApellido;


    public Persona(Date fechaNacimiento, String cedula, String nombre, String pApellido, String sApellido) {
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
        this.nombre = nombre;
        this.pApellido = pApellido;
        this.sApellido = sApellido;
       
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
