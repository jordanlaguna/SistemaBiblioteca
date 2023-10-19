package clases;

import conexionDB.ConexionTabletDB;
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
 * The tablet class is for the purpose of identifying the quantities of tablets
 * available for the loan and their status.
 */
public class Tablet {

    private int id_tab;

    private String trademark;

    private String ubication;

    private String available;

    /**
     * @param id_tab Indicates the id of computers
     *
     * @param trademark It represents the brand of the computers
     *
     * @param ubication An indicator that signals whether computers of this type
     * are available for use.
     * @param available An indicator that signals whether computers of this type
     * are available for use.
     */
    public Tablet(int id_tab, String trademark, String ubication, String available) {
        this.id_tab = id_tab;
        this.trademark = trademark;
        this.ubication = ubication;
        this.available = available;
    }

    public Tablet() {
    }

    public int getId_tab() {
        return id_tab;
    }

    public void setId_tab(int id_tab) {
        this.id_tab = id_tab;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getUbication() {
        return ubication;
    }

    public void setUbication(String ubication) {
        this.ubication = ubication;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    /**
     * This method is designed to search for tablet drives in the library.
     */
    public void unitSearch(TextField txt_search, TableView<Tablet> tableView) {
        FilteredList<Tablet> filterData = new FilteredList<>(tableView.
                getItems(), p -> true);

        txt_search.textProperty().addListener((observable, oldValue, newValue) 
                -> {
            filterData.setPredicate(tablet -> {
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }
                String tipoTexto = newValue.toLowerCase();
                 if (tablet.getUbication().toLowerCase().contains(tipoTexto)
                        || tablet.getTrademark().toLowerCase().
                                contains(tipoTexto)
                        || tablet.getAvailable().toLowerCase().
                                contains(tipoTexto)
                        || String.valueOf(tablet.getId_tab()).toLowerCase().
                                contains(tipoTexto)) {
                    return true;
                }
                return false;
            });
        });

        SortedList<Tablet> sortedList = new SortedList<>(filterData);
        sortedList.comparatorProperty().bind(tableView.comparatorProperty());
        tableView.setItems(sortedList);

    }
     /**
     * This method desing add a computer drives in the library.
     */
    public void add() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        conn = ConexionTabletDB.getConnection();

        String sql = "insert into tablet(trademark, ubication,"
                + " available)values(?,?,?)";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, getTrademark());
            ps.setString(2, getUbication());
            ps.setString(3, getAvailable());

            ps.execute();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("INFORMACIÓN");
            alert.setContentText("Tablet guardada correctamente.");
            alert.showAndWait();

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("No se pudo guardar la tablet. " + e);
            alert.showAndWait();
        }
    }
     /**
     * This method is designed to update a computer drives in the library.
     */
    public void update() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = ConexionTabletDB.getConnection();
            Integer value1 = getId_tab();
            String value2 = getTrademark();
            String value3 = getUbication();
            String value4 = getAvailable();

            String sql = "update tablet set id_tab= '" + value1 + "'"
                    + ", trademark= '" + value2 + "', ubication= '" + value3
                    + "'" + ", available= '" + value4 + "' where id_tab= '"
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
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("No se pudo modificar el usuario. " + e);
            alert.showAndWait();

        }
    }
     /**
     * This method is designed to delete a computer drives in the library.
     */
    public void delete() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "delete from tablet where id_tab = ? ";
        try {
            conn = ConexionTabletDB.getConnection();
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setTitle("CONFIRMACIÓN");
            alert.setContentText("¿Desea eliminar los datos?");
            Optional<ButtonType> opcion = alert.showAndWait();

            if (opcion.get().equals(ButtonType.OK)) {
                ps = conn.prepareStatement(sql);
                ps.setInt(1, getId_tab());
                ps.execute();
                alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("INFORMACIÓN");
                alert.setContentText("Datos eliminados con éxito.");
                alert.showAndWait();

            }

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Los datos no se pudieron eliminar. " + e);
            alert.showAndWait();
        }
    }
}
