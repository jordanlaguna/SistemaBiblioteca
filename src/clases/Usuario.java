package clases;

import java.util.Date;

public class Usuario extends Persona {

    private String idUser;

    private String contrasena;

    private String nombreUsuario;

    private String tipo;

    public Usuario(Date fechaNacimiento, String cedula, String nombre, String pApellido, String sApellido, String idUser,
            String nombreUsuario, String contrasena, String tipo) {
        super(fechaNacimiento, cedula, nombre, pApellido, sApellido);
        this.idUser = idUser;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return "Usuario{" + "idUser=" + idUser + ", contrasena=" + contrasena + ", nombreUsuario=" + nombreUsuario + ", tipo=" + tipo + '}';
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void verLibros() {
    }

    public void pedirPrestamo() {
    }

    public void login() {
    }

    public void registatrarse() {
    }
}
