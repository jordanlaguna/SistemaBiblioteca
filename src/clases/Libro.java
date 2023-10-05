package clases;

import java.util.Date;
public class Libro {

    private String ISBN;

    private String titulo;

    private String autorLibro;

    private String editorial;

    private Date fechaLanzamiento;

    public Libro(String ISBN, String titulo, String autorLibro, String editorial, Date fechaLanzamiento) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autorLibro = autorLibro;
        this.editorial = editorial;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Libro() {
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
    

    public void buscar() {
    }
}
