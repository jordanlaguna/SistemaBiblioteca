package clases;

public class Ejemplar  {

    private int paginas;

    private String codigo;

    private Boolean disponible;

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public Ejemplar() {
    }

    public Ejemplar(int paginas, String codigo, Boolean disponible) {
        this.paginas = paginas;
        this.codigo = codigo;
        this.disponible = disponible;
    }

    public void detalles() {
    }
}
