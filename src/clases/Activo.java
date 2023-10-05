package clases;


import java.util.Date;
import java.util.List;

public class Activo  {

    private Date fecha;

    private List unidad;

    private List usuario;

    private List ejemplares;

    public Activo(Date fecha, List unidad, List usuario, List ejemplares) {
        this.fecha = fecha;
        this.unidad = unidad;
        this.usuario = usuario;
        this.ejemplares = ejemplares;
    }

    public Activo() {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List getUnidad() {
        return unidad;
    }

    public void setUnidad(List unidad) {
        this.unidad = unidad;
    }

    public List getUsuario() {
        return usuario;
    }

    public void setUsuario(List usuario) {
        this.usuario = usuario;
    }

    public List getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(List ejemplares) {
        this.ejemplares = ejemplares;
    }

    public void buscar() {
    }

    public void modificar() {
    }
}
