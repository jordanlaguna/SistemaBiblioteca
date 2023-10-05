package clases;

import java.util.Date;
import java.util.List;

/*The return class is used to record returns of items (books or equipment) loaned to users.*/
public class Devolucion  {

    private Date fecha;

    private Date fechaEntrega;

    private List unidad;

    private List ejemplares;

    private List usuario;

    public Devolucion(Date fecha, Date fechaEntrega, List unidad, List ejemplares, List usuario) {
        this.fecha = fecha;
        this.fechaEntrega = fechaEntrega;
        this.unidad = unidad;
        this.ejemplares = ejemplares;
        this.usuario = usuario;
    }

    public Devolucion() {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public List getUnidad() {
        return unidad;
    }

    public void setUnidad(List unidad) {
        this.unidad = unidad;
    }

    public List getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(List ejemplares) {
        this.ejemplares = ejemplares;
    }

    public List getUsuario() {
        return usuario;
    }

    public void setUsuario(List usuario) {
        this.usuario = usuario;
    }

    //The search method performs a search for specific evaluations
    public void buscar() {
    }
}
