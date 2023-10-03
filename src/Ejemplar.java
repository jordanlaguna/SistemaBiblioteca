/**
 * The "Ejemplar" class represents a type of book in the library
 */
public class Ejemplar  {

    private int paginas;

    private String codigo;

    private Boolean disponible;
    
      /**
     * @param paginas //Number of pages in the exemplar
     * @param codigo //Unique identification code the exemplar
     * @param disponible //Indicates if the exemplar is available for loan
     */
    public Ejemplar(int paginas, String codigo, Boolean disponible) {
        this.paginas = paginas;
        this.codigo = codigo;
        this.disponible = disponible;
    }

    public Ejemplar() {
    }
    

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
    
    /**
     * This method provides additional details (specific information) about the
     * exemplar
     */
    public void detalles() {
    }
}
