package clases;

/**
 * The Library class represents the library that contains books and equipment.
 */
public class Biblioteca {

    private int booksQuantity;

    private int equipmentQuantity;

    private String name;
    /**
     * @param booksQuantity //The number of books available in the library
     * @param equipmentQuantity //The quantity of equipments available in the
     * library
     * @param name //Library name
     */
    public Biblioteca(int booksQuantity, int equipmentQuantity, String name) {
        this.booksQuantity = booksQuantity;
        this.equipmentQuantity = equipmentQuantity;
        this.name = name;
    }


    public Biblioteca() {
    }

    public int getBooksQuantity() {
        return booksQuantity;
    }

    public void setBooksQuantity(int booksQuantity) {
        this.booksQuantity = booksQuantity;
    }

    public int getEquipmentQuantity() {
        return equipmentQuantity;
    }

    public void setEquipmentQuantity(int equipmentQuantity) {
        this.equipmentQuantity = equipmentQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } 

    /**
     * Method to handle equipment registration in the library.
     */
    public void equipment() {
    }

    /**
     * Method to manage the loan of the library resources.
     */
    public void loan() {
    }

    /**
     * Method to manage the registration of books in the library.
     */
    public void book() {
    }
}
