package clases;


import clases.Usuario;
import java.util.Date;

public class Profesor extends Usuario {

    private String tipo;

    public Profesor(String tipo, String idUser, String password, String userName, String type, String fechaNacimiento, String cedula, String nombre, String pApellido, String sApellido) {
        super(idUser, password, userName, type, fechaNacimiento, cedula, nombre, pApellido, sApellido);
        this.tipo = tipo;
    }


  

  

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
