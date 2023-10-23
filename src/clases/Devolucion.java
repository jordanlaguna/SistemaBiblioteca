package clases;

import java.util.Date;
import java.util.List;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * The return class is used to record returns of items (books or equipment)
 * loaned to users.
 */
public class Devolucion {

    private Date date;

    private Date deliverDate;
    private int id_loan;
    private String exemplars;

    private String userEmail;

    private String user;

    /**
     * @param date //The date on which the return was registered
     * @param deliverDate //The date on which the items must be returned
     * @param exemplars //The of individual items returned
     * @param user //The list of users who have completed the return.
     * @param id_loan //The id of loan
     * @param userEmail //The email of user
     */
    public Devolucion(int id_loan, Date date, Date deliverDate, String exemplars
            , String userEmail, String user) {
        this.date = date;
        this.deliverDate = deliverDate;
        this.exemplars = exemplars;
        this.userEmail = userEmail;
        this.user = user;
        this.id_loan = id_loan;
    }

    public Devolucion() {
    }

    public int getId_loan() {
        return id_loan;
    }

    public void setId_loan(int id_loan) {
        this.id_loan = id_loan;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDeliverDate() {
        return deliverDate;
    }

    public void setDeliverDate(Date deliverDate) {
        this.deliverDate = deliverDate;
    }

    public String getExemplars() {
        return exemplars;
    }

    public void setExemplars(String exemplars) {
        this.exemplars = exemplars;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    //The search method performs a search for specific evaluations
    public static void search(TextField searchDevolution,
            TableView<Devolucion> tableView) {
        FilteredList<Devolucion> filteredData = new FilteredList<>(tableView.
                getItems(), p -> true);

        searchDevolution.textProperty().addListener((observable, oldValue,
                newValue) -> {
            filteredData.setPredicate(devolucion -> {
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }
                String tipoTexto = newValue.toLowerCase();
                return devolucion.getUser().toLowerCase().contains(tipoTexto)
                        || devolucion.getUserEmail().toLowerCase().
                                contains(tipoTexto)
                        || devolucion.getExemplars().toLowerCase().
                                contains(tipoTexto)
                        || devolucion.getDate().toString().toLowerCase().
                                contains(tipoTexto)
                        || devolucion.getDeliverDate().toString().toLowerCase().
                                contains(tipoTexto);
            });
        });

        SortedList<Devolucion> sortedList = new SortedList<>(filteredData);
        sortedList.comparatorProperty().bind(tableView.comparatorProperty());
        tableView.setItems(sortedList);
    }
}
