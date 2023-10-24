package clases;

import javafx.embed.swing.JFXPanel;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.application.Platform;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jorda
 */
public class TabletTest {
    
    public TabletTest() {
    }
  
    @BeforeClass
    public static void setUpClass() {
    }
    @BeforeClass
    public static void initJFX() {
        new JFXPanel(); // Inicializa JavaFX para pruebas
    }
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of getId_tab method, of class Tablet.
     */
    @Test
    public void testGetId_tab() {
        System.out.println("getId_tab");
        Tablet instance = new Tablet();
        int expResult = 0;
        int result = instance.getId_tab();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId_tab method, of class Tablet.
     */
    @Test
    public void testSetId_tab() {
        System.out.println("setId_tab");
        int id_tab = 0;
        Tablet instance = new Tablet();
        instance.setId_tab(id_tab);
    }

    /**
     * Test of getTrademark method, of class Tablet.
     */
    @Test
    public void testGetTrademark() {
        System.out.println("getTrademark");
        Tablet instance = new Tablet();
        String expResult = "";
        String result = instance.getTrademark();
        assertEquals("", "");
    }

    /**
     * Test of setTrademark method, of class Tablet.
     */
    @Test
    public void testSetTrademark() {
        System.out.println("setTrademark");
        String trademark = "";
        Tablet instance = new Tablet();
        instance.setTrademark(trademark);
    }

    /**
     * Test of getUbication method, of class Tablet.
     */
    @Test
    public void testGetUbication() {
        System.out.println("getUbication");
        Tablet instance = new Tablet();
        String expResult = "";
        String result = instance.getUbication();
        assertEquals("", "");
    }

    /**
     * Test of setUbication method, of class Tablet.
     */
    @Test
    public void testSetUbication() {
        System.out.println("setUbication");
        String ubication = "";
        Tablet instance = new Tablet();
        instance.setUbication(ubication);
    }

    /**
     * Test of getAvailable method, of class Tablet.
     */
    @Test
    public void testGetAvailable() {
        System.out.println("getAvailable");
        Tablet instance = new Tablet();
        String expResult = "";
        String result = instance.getAvailable();
        assertEquals("", "");
    }

    /**
     * Test of setAvailable method, of class Tablet.
     */
    @Test
    public void testSetAvailable() {
        System.out.println("setAvailable");
        String available = "";
        Tablet instance = new Tablet();
        instance.setAvailable(available);
    }

    /**
     * Test of unitSearch method, of class Tablet.
     */
    @Test
    public void testUnitSearch() {
        System.out.println("unitSearch");
        TextField txt_search = new TextField();
        TableView<Tablet> tableView = new TableView<>();
        Tablet instance = new Tablet();
        instance.unitSearch(txt_search, tableView);
    }

    /**
     * Test of add method, of class Tablet.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Tablet instance = new Tablet();
        instance.add();
    }

    /**
     * Test of update method, of class Tablet.
     */
    @Test
    public void testUpdate() {
         System.out.println("update");
        Platform.runLater(() -> {
        Tablet instance = new Tablet();
        instance.update();
    });
    }

    /**
     * Test of delete method, of class Tablet.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Platform.runLater(() -> {
        Tablet instance = new Tablet();
        instance.delete();
    });
    } 
}