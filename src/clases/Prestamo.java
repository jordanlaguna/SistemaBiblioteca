package clases;


import java.util.Date;
import java.util.List;

public class Prestamo  {

    private Date fechaPrestamo;

    private List ejemplares;

    private Date fechaDevolucion;

    private List unidad;

    private int numPrestamo;

    public Prestamo(Date fechaPrestamo, List ejemplares, Date fechaDevolucion, List unidad, int numPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
        this.ejemplares = ejemplares;
        this.fechaDevolucion = fechaDevolucion;
        this.unidad = unidad;
        this.numPrestamo = numPrestamo;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public List getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(List ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public List getUnidad() {
        return unidad;
    }

    public void setUnidad(List unidad) {
        this.unidad = unidad;
    }

    public int getNumPrestamo() {
        return numPrestamo;
    }

    public void setNumPrestamo(int numPrestamo) {
        this.numPrestamo = numPrestamo;
    }

    public void verPrestamoActivos() {
    }

    public void agregar() {
    }

    public void buscar() {
    }

    public void verDevoluciones() {
    }

    public void notas() {
    }

    public void usuarios() {
    }
}
