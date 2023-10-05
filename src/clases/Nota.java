package clases;


import java.util.Date;

public class Nota  {

    private Date fecha;

    private int numNotas;

    private String nota;

    public Nota(Date fecha, int numNotas, String nota) {
        this.fecha = fecha;
        this.numNotas = numNotas;
        this.nota = nota;
    }

    public Nota() {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumNotas() {
        return numNotas;
    }

    public void setNumNotas(int numNotas) {
        this.numNotas = numNotas;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public void agregar() {
    }

    public void buscar() {
    }

    public void modificar() {
    }

    public void eliminar() {
    }
}
