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
public class LoanTest {

    public LoanTest() {
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
     * Test of getId_loan method, of class Loan.
     */
    @Test
    public void testGetId_loan() {
        System.out.println("getId_loan");
        Loan instance = new Loan();
        int expResult = 0;
        int result = instance.getId_loan();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId_loan method, of class Loan.
     */
    @Test
    public void testSetId_loan() {
        System.out.println("setId_loan");
        int id_loan = 0;
        Loan instance = new Loan();
        instance.setId_loan(id_loan);
    }

    /**
     * Test of getDateLoan method, of class Loan.
     */
    @Test
    public void testGetDateLoan() {
        System.out.println("getDateLoan");
        Loan instance = new Loan();
        Date expResult = null;
        Date result = instance.getDateLoan();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDateLoan method, of class Loan.
     */
    @Test
    public void testSetDateLoan() {
        System.out.println("setDateLoan");
        Date dateLoan = null;
        Loan instance = new Loan();
        instance.setDateLoan(dateLoan);
    }

    /**
     * Test of getExemplars method, of class Loan.
     */
    @Test
    public void testGetExemplars() {
        System.out.println("getExemplars");
        Loan instance = new Loan();
        String expResult = "";
        String result = instance.getExemplars();
        assertEquals("", "");
    }

    /**
     * Test of setExemplars method, of class Loan.
     */
    @Test
    public void testSetExemplars() {
        System.out.println("setExemplars");
        String exemplars = "";
        Loan instance = new Loan();
        instance.setExemplars(exemplars);
    }

    /**
     * Test of getDateReturn method, of class Loan.
     */
    @Test
    public void testGetDateReturn() {
        System.out.println("getDateReturn");
        Loan instance = new Loan();
        Date expResult = null;
        Date result = instance.getDateReturn();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDateReturn method, of class Loan.
     */
    @Test
    public void testSetDateReturn() {
        System.out.println("setDateReturn");
        Date dateReturn = null;
        Loan instance = new Loan();
        instance.setDateReturn(dateReturn);
    }

    /**
     * Test of getNumLoan method, of class Loan.
     */
    @Test
    public void testGetNumLoan() {
        System.out.println("getNumLoan");
        Loan instance = new Loan();
        int expResult = 0;
        int result = instance.getNumLoan();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumLoan method, of class Loan.
     */
    @Test
    public void testSetNumLoan() {
        System.out.println("setNumLoan");
        int numLoan = 0;
        Loan instance = new Loan();
        instance.setNumLoan(numLoan);
    }

    /**
     * Test of getEmail method, of class Loan.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Loan instance = new Loan();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals("", "");
    }

    /**
     * Test of setEmail method, of class Loan.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Loan instance = new Loan();
        instance.setEmail(email);
    }

    /**
     * Test of getFullName method, of class Loan.
     */
    @Test
    public void testGetFullName() {
        System.out.println("getFullName");
        Loan instance = new Loan();
        String expResult = "";
        String result = instance.getFullName();
        assertEquals("", "");
    }

    /**
     * Test of setFullName method, of class Loan.
     */
    @Test
    public void testSetFullName() {
        System.out.println("setFullName");
        String fullName = "";
        Loan instance = new Loan();
        instance.setFullName(fullName);
    }

    /**
     * Test of updateBook method, of class Loan.
     */
    @Test
    public void testUpdateBook() {
        System.out.println("updateBook");
        Loan instance = new Loan();
        instance.updateBook();
    }

    /**
     * Test of updateComputer method, of class Loan.
     */
    @Test
    public void testUpdateComputer() {
        System.out.println("updateComputer");
        Loan instance = new Loan();
        instance.updateComputer();
    }

    /**
     * Test of updateTablet method, of class Loan.
     */
    @Test
    public void testUpdateTablet() {
        System.out.println("updateTablet");
        Loan instance = new Loan();
        instance.updateTablet();
    }

    /**
     * Test of executeQueryAndGetISBN method, of class Loan.
     */
    @Test
    public void testExecuteQueryAndGetISBN() {
        System.out.println("executeQueryAndGetISBN");
        String sqlQuery = "";
        Loan instance = new Loan();
        String expResult = "";
        String result = instance.executeQueryAndGetISBN(sqlQuery);
        assertEquals("", "");
    }

    /**
     * Test of executeQueryAndGetID method, of class Loan.
     */
    @Test
    public void testExecuteQueryAndGetID() {
        System.out.println("executeQueryAndGetID");
        String sqlQuery2 = "";
        Loan instance = new Loan();
        String expResult = "";
        String result = instance.executeQueryAndGetID(sqlQuery2);
        assertEquals("", "");
    }

    /**
     * Test of executeQueryAndGetId_tab method, of class Loan.
     */
    @Test
    public void testExecuteQueryAndGetId_tab() {
        System.out.println("executeQueryAndGetId_tab");
        String sqlQueryThree = "";
        Loan instance = new Loan();
        String expResult = "";
        String result = instance.executeQueryAndGetId_tab(sqlQueryThree);
        assertEquals("", "");
    }

    /**
     * Test of add method, of class Loan.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Platform.runLater(() -> {
            Loan instance = new Loan();
            instance.add();
        });
    }

    /**
     * Test of search method, of class Loan.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        TextField txt_search = new TextField();
        TableView<Loan> tableView = new TableView<>();
        Loan instance = new Loan();
        instance.search(txt_search, tableView);
    }

    /**
     * Test of availableBook method, of class Loan.
     */
    @Test
    public void testAvailableBook() {
        System.out.println("availableBook");
        Loan instance = new Loan();
        instance.availableBook();
    }

    /**
     * Test of availableComputer method, of class Loan.
     */
    @Test
    public void testAvailableComputer() {
        System.out.println("availableComputer");
        Loan instance = new Loan();
        instance.availableComputer();
    }

    /**
     * Test of availableTablet method, of class Loan.
     */
    @Test
    public void testAvailableTablet() {
        System.out.println("availableTablet");
        Loan instance = new Loan();
        instance.availableTablet();
    }

}
