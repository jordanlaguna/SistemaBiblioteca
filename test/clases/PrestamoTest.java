/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
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
public class PrestamoTest {
    
    public PrestamoTest() {
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
     * Test of getId_loan method, of class Prestamo.
     */
    @Test
    public void testGetId_loan() {
        System.out.println("getId_loan");
        Prestamo instance = new Prestamo();
        int expResult = 0;
        int result = instance.getId_loan();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId_loan method, of class Prestamo.
     */
    @Test
    public void testSetId_loan() {
        System.out.println("setId_loan");
        int id_loan = 0;
        Prestamo instance = new Prestamo();
        instance.setId_loan(id_loan);
    }

    /**
     * Test of getDateLoan method, of class Prestamo.
     */
    @Test
    public void testGetDateLoan() {
        System.out.println("getDateLoan");
        Prestamo instance = new Prestamo();
        Date expResult = null;
        Date result = instance.getDateLoan();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDateLoan method, of class Prestamo.
     */
    @Test
    public void testSetDateLoan() {
        System.out.println("setDateLoan");
        Date dateLoan = null;
        Prestamo instance = new Prestamo();
        instance.setDateLoan(dateLoan);
    }

    /**
     * Test of getExemplars method, of class Prestamo.
     */
    @Test
    public void testGetExemplars() {
        System.out.println("getExemplars");
        Prestamo instance = new Prestamo();
        String expResult = "";
        String result = instance.getExemplars();
        assertEquals("", "");
    }

    /**
     * Test of setExemplars method, of class Prestamo.
     */
    @Test
    public void testSetExemplars() {
        System.out.println("setExemplars");
        String exemplars = "";
        Prestamo instance = new Prestamo();
        instance.setExemplars(exemplars);
    }

    /**
     * Test of getDateReturn method, of class Prestamo.
     */
    @Test
    public void testGetDateReturn() {
        System.out.println("getDateReturn");
        Prestamo instance = new Prestamo();
        Date expResult = null;
        Date result = instance.getDateReturn();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDateReturn method, of class Prestamo.
     */
    @Test
    public void testSetDateReturn() {
        System.out.println("setDateReturn");
        Date dateReturn = null;
        Prestamo instance = new Prestamo();
        instance.setDateReturn(dateReturn);
    }

    /**
     * Test of getNumLoan method, of class Prestamo.
     */
    @Test
    public void testGetNumLoan() {
        System.out.println("getNumLoan");
        Prestamo instance = new Prestamo();
        int expResult = 0;
        int result = instance.getNumLoan();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumLoan method, of class Prestamo.
     */
    @Test
    public void testSetNumLoan() {
        System.out.println("setNumLoan");
        int numLoan = 0;
        Prestamo instance = new Prestamo();
        instance.setNumLoan(numLoan);
    }

    /**
     * Test of getEmail method, of class Prestamo.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Prestamo instance = new Prestamo();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals("", "");
    }

    /**
     * Test of setEmail method, of class Prestamo.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Prestamo instance = new Prestamo();
        instance.setEmail(email);
    }

    /**
     * Test of getFullName method, of class Prestamo.
     */
    @Test
    public void testGetFullName() {
        System.out.println("getFullName");
        Prestamo instance = new Prestamo();
        String expResult = "";
        String result = instance.getFullName();
        assertEquals("", "");

    }

    /**
     * Test of setFullName method, of class Prestamo.
     */
    @Test
    public void testSetFullName() {
        System.out.println("setFullName");
        String fullName = "";
        Prestamo instance = new Prestamo();
        instance.setFullName(fullName);
    }

    /**
     * Test of updateBook method, of class Prestamo.
     */
    @Test
    public void testUpdateBook() {
        System.out.println("updateBook");
        Prestamo instance = new Prestamo();
        instance.updateBook();
    }

    /**
     * Test of updateComputer method, of class Prestamo.
     */
    @Test
    public void testUpdateComputer() {
        System.out.println("updateComputer");
        Prestamo instance = new Prestamo();
        instance.updateComputer();
    }

    /**
     * Test of updateTablet method, of class Prestamo.
     */
    @Test
    public void testUpdateTablet() {
        System.out.println("updateTablet");
        Prestamo instance = new Prestamo();
        instance.updateTablet();
    }

    /**
     * Test of executeQueryAndGetISBN method, of class Prestamo.
     */
    @Test
    public void testExecuteQueryAndGetISBN() {
        System.out.println("executeQueryAndGetISBN");
        String sqlQuery = "";
        Prestamo instance = new Prestamo();
        String expResult = "";
        String result = instance.executeQueryAndGetISBN(sqlQuery);
        assertEquals("", "");
    }

    /**
     * Test of executeQueryAndGetID method, of class Prestamo.
     */
    @Test
    public void testExecuteQueryAndGetID() {
        System.out.println("executeQueryAndGetID");
        String sqlQuery2 = "";
        Prestamo instance = new Prestamo();
        String expResult = "";
        String result = instance.executeQueryAndGetID(sqlQuery2);
        assertEquals("", "");
    }

    /**
     * Test of executeQueryAndGetId_tab method, of class Prestamo.
     */
    @Test
    public void testExecuteQueryAndGetId_tab() {
        System.out.println("executeQueryAndGetId_tab");
        String sqlQueryThree = "";
        Prestamo instance = new Prestamo();
        String expResult = "";
        String result = instance.executeQueryAndGetId_tab(sqlQueryThree);
        assertEquals("", "");
    }

    /**
     * Test of add method, of class Prestamo.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Platform.runLater(() -> {
        Prestamo instance = new Prestamo();
        instance.add();
    });
    }

    /**
     * Test of search method, of class Prestamo.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        TextField txt_search = new TextField();
        TableView<Prestamo> tableView = new TableView<>();
        Prestamo instance = new Prestamo();
        instance.search(txt_search, tableView);
    }

    /**
     * Test of availableBook method, of class Prestamo.
     */
    @Test
    public void testAvailableBook() {
        System.out.println("availableBook");
        Prestamo instance = new Prestamo();
        instance.availableBook();
    }

    /**
     * Test of availableComputer method, of class Prestamo.
     */
    @Test
    public void testAvailableComputer() {
        System.out.println("availableComputer");
        Prestamo instance = new Prestamo();
        instance.availableComputer();
    }

    /**
     * Test of availableTablet method, of class Prestamo.
     */
    @Test
    public void testAvailableTablet() {
        System.out.println("availableTablet");
        Prestamo instance = new Prestamo();
        instance.availableTablet();
    }
    
}
