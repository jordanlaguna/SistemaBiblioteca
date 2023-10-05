package clases;


import clases.Usuario;
import java.util.Date;

public class Profesor extends Usuario {

    private String tipo;

    public Profesor(Date fechaNacimiento, String cedula, String nombre, String pApellido, String sApellido, String idUser, String nombreUsuario, String contrasena, String tipo) {
        super(fechaNacimiento, cedula, nombre, pApellido, sApellido, idUser, nombreUsuario, contrasena, tipo);
    }

  

  

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
