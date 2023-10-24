package clases;

/**
 * The Library class represents the library that contains books and equipment.
 */
public class Library {

    private int booksQuantity;

    private int equipmentQuantity;

    private String name;

    /**
     * @param booksQuantity //The number of books available in the library
     * @param equipmentQuantity //The quantity of equipments available in the
     * library
     * @param name //Library name
     */
    public Library(int booksQuantity, int equipmentQuantity, String name) {
        this.booksQuantity = booksQuantity;
        this.equipmentQuantity = equipmentQuantity;
        this.name = name;
    }

    public Library() {
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
}
