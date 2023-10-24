/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;
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
public class DevolutionTest {
    
    public DevolutionTest() {
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
     * Test of getId_loan method, of class Devolution.
     */
    @Test
    public void testGetId_loan() {
        System.out.println("getId_loan");
        Devolution instance = new Devolution();
        int expResult = 0;
        int result = instance.getId_loan();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId_loan method, of class Devolution.
     */
    @Test
    public void testSetId_loan() {
        System.out.println("setId_loan");
        int id_loan = 0;
        Devolution instance = new Devolution();
        instance.setId_loan(id_loan);
    }

    /**
     * Test of getDate method, of class Devolution.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Devolution instance = new Devolution();
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDate method, of class Devolution.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = null;
        Devolution instance = new Devolution();
        instance.setDate(date);
    }

    /**
     * Test of getDeliverDate method, of class Devolution.
     */
    @Test
    public void testGetDeliverDate() {
        System.out.println("getDeliverDate");
        Devolution instance = new Devolution();
        Date expResult = null;
        Date result = instance.getDeliverDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDeliverDate method, of class Devolution.
     */
    @Test
    public void testSetDeliverDate() {
        System.out.println("setDeliverDate");
        Date deliverDate = null;
        Devolution instance = new Devolution();
        instance.setDeliverDate(deliverDate);

    }

    /**
     * Test of getExemplars method, of class Devolution.
     */
    @Test
    public void testGetExemplars() {
        System.out.println("getExemplars");
        Devolution instance = new Devolution();
        String expResult = "";
        String result = instance.getExemplars();
        assertEquals("", "");
    }

    /**
     * Test of setExemplars method, of class Devolution.
     */
    @Test
    public void testSetExemplars() {
        System.out.println("setExemplars");
        String exemplars = "";
        Devolution instance = new Devolution();
        instance.setExemplars(exemplars);
    }

    /**
     * Test of getUserEmail method, of class Devolution.
     */
    @Test
    public void testGetUserEmail() {
        System.out.println("getUserEmail");
        Devolution instance = new Devolution();
        String expResult = "";
        String result = instance.getUserEmail();
        assertEquals("", "");
    }

    /**
     * Test of setUserEmail method, of class Devolution.
     */
    @Test
    public void testSetUserEmail() {
        System.out.println("setUserEmail");
        String userEmail = "";
        Devolution instance = new Devolution();
        instance.setUserEmail(userEmail);
    }

    /**
     * Test of getUser method, of class Devolution.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Devolution instance = new Devolution();
        String expResult = "";
        String result = instance.getUser();
        assertEquals("", "");
    }

    /**
     * Test of setUser method, of class Devolution.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        String user = "";
        Devolution instance = new Devolution();
        instance.setUser(user);
    }

    /**
     * Test of search method, of class Devolution.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        TextField searchDevolution = new TextField();
        TableView<Devolution> tableView = new TableView<>();
        Devolution.search(searchDevolution, tableView);
    }
    
}
