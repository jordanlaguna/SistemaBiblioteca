   package clases;

import conexionDB.ConexionBooks;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Optional;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * The Computer class is a type of library equipment, specifically a computer
 * This class inherits from the Equipment class, which means it shares some
 * common features with other types of equipment in the library
 */
public class Computer  {
    private int id;
    
    private String trademark;
    
    private String ubication;

    private String available;

   /**
     * @param id Indicates the identifier of computers of this type.
     *available in the library
     * 
     * @param ubication Indicates the location of computers of this type.
     *available in the library
     *
     * @param trademark It represents the brand of the computers
     *
     * @param available An indicator that signals whether computers of this
     * type are available for use.
     * 
     */
    public Computer(Integer id, String trademark, String ubication,
            String available) {     
        this.id = id;
        this.trademark = trademark;
        this.ubication = ubication;
        this.available = available;
    }

    public Computer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUbication() {
        return ubication;
    }

    public void setUbication(String ubication) {
        this.ubication = ubication;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    /**
     * This method is designed to search for computer drives in the library.
     */
    /**
     * 
     * @param txt_search Search computer
     * @param tableView Table computer
     */
    public void unitSearch(TextField txt_search, TableView<Computer> tableView) {
        FilteredList<Computer> filterData = new FilteredList<>(tableView.
                getItems(), p -> true);

        txt_search.textProperty().addListener((observable, oldValue, newValue) 
                -> {
            filterData.setPredicate(tablet -> {
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }
                String typeText = newValue.toLowerCase();
                 if (tablet.getUbication().toLowerCase().contains(typeText)
                        || tablet.getTrademark().toLowerCase().
                                contains(typeText)
                        || tablet.getAvailable().toLowerCase().
                                contains(typeText)
                        || String.valueOf(tablet.getId()).toLowerCase().
                                contains(typeText)) {
                    return true;
                }
                return false;
            });
        });

        SortedList<Computer> sortedList = new SortedList<>(filterData);
        sortedList.comparatorProperty().bind(tableView.comparatorProperty());
        tableView.setItems(sortedList);
    }
   
    public void add() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        conn = ConexionBooks.conn();

        String sql = "insert into computer(trademark, ubication,"
                + " available)values(?,?,?)";

        try {
           if (getTrademark() != null && getUbication() != null && 
                getAvailable() != null) {
            ps = conn.prepareStatement(sql);
            ps.setString(1, getTrademark());
            ps.setString(2, getUbication());
            ps.setString(3, getAvailable());

            ps.execute();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("INFORMACIÓN");
            alert.setContentText("Computadora guardada correctamente.");
            alert.showAndWait();
        } 
          
           
           
        } catch (Exception e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("No se pudo guardar la computadora. " + e);
            alert.showAndWait();
        }
    }

    public void update() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
             conn = ConexionBooks.conn();
            Integer value1 = getId();
            String value2 = getTrademark();
            String value3 = getUbication();
            String value4 = getAvailable();

            String sql = "update computer set id= '" + value1 + "'"
                    + ", trademark= '" + value2 + "', ubication= '" + value3
                    + "'" + ", available= '" + value4 + "' where id= '"
                    + value1 + "'";

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setTitle("CONFIRMACIÓN");
            alert.setContentText("¿Desea modificar los datos?");
            Optional<ButtonType> opcion = alert.showAndWait();

            if (opcion.get().equals(ButtonType.OK)) {
               ps = conn.prepareStatement(sql);
                ps.execute();
                alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("INFORMACIÓN");
                alert.setContentText("Datos modificados con éxito.");
                alert.showAndWait();

            }
                
        } catch (Exception e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("No se pudo modificar la computadora. ");
            alert.showAndWait();
            
        }
    }

    public void delete() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "delete from computer where id = ? ";
        try {
             conn = ConexionBooks.conn();
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setTitle("CONFIRMACIÓN");
            alert.setContentText("¿Desea eliminar los datos?");
            Optional<ButtonType> opcion = alert.showAndWait();

            if (opcion.get().equals(ButtonType.OK)) {
                ps = conn.prepareStatement(sql);
                ps.setInt(1, getId());
                ps.execute();
                alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("INFORMACIÓN");
                alert.setContentText("Datos eliminados con éxito.");
                alert.showAndWait();

            }
              
        } catch (Exception e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Los datos no se pudieron eliminar. " + e);
            alert.showAndWait();
        }
    }
}
     