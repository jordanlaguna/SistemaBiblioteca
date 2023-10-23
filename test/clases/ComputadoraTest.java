/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javafx.application.Platform;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import javafx.embed.swing.JFXPanel;

/**
 *
 * @author jorda
 */
public class ComputadoraTest {
    
    public ComputadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    @BeforeClass
    public static void initJFX() {
        JFXPanel jfxPanel = new JFXPanel();
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
     * Test of getId method, of class Computadora.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Computadora instance = new Computadora();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Computadora.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Computadora instance = new Computadora();
        instance.setId(id);
    }

    /**
     * Test of getUbication method, of class Computadora.
     */
    @Test
    public void testGetUbication() {
        System.out.println("getUbication");
        Computadora instance = new Computadora();
        String expResult = "";
        String result = instance.getUbication();
        assertEquals("", "");
    }

    /**
     * Test of setUbication method, of class Computadora.
     */
    @Test
    public void testSetUbication() {
        System.out.println("setUbication");
        String ubication = "";
        Computadora instance = new Computadora();
        instance.setUbication(ubication);
    }

    /**
     * Test of getTrademark method, of class Computadora.
     */
    @Test
    public void testGetTrademark() {
        System.out.println("getTrademark");
        Computadora instance = new Computadora();
        String expResult = "";
        String result = instance.getTrademark();
        assertEquals("", "");
    }

    /**
     * Test of setTrademark method, of class Computadora.
     */
    @Test
    public void testSetTrademark() {
        System.out.println("setTrademark");
        String trademark = "";
        Computadora instance = new Computadora();
        instance.setTrademark(trademark);
       
    }

    /**
     * Test of getAvailable method, of class Computadora.
     */
    @Test
    public void testGetAvailable() {
        System.out.println("getAvailable");
        Computadora instance = new Computadora();
        String expResult = "";
        String result = instance.getAvailable();
        assertEquals("", "");
    }

    /**
     * Test of setAvailable method, of class Computadora.
     */
    @Test
    public void testSetAvailable() {
        System.out.println("setAvailable");
        String available = "";
        Computadora instance = new Computadora();
        instance.setAvailable(available);
    }

    /**
     * Test of unitSearch method, of class Computadora.
     */
    @Test
    public void testUnitSearch() {
        System.out.println("unitSearch");
        TextField txt_search = new TextField();
        TableView<Computadora> tableView = new TableView<>();
        Computadora instance = new Computadora();
        instance.unitSearch(txt_search, tableView);
    }

    /**
     * Test of add method, of class Computadora.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Platform.runLater(() -> {
        Computadora instance = new Computadora();
        instance.add();
    });
    }

    /**
     * Test of update method, of class Computadora.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Platform.runLater(() -> {
        Computadora instance = new Computadora();
        instance.update();
    });
    }

    /**
     * Test of delete method, of class Computadora.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Platform.runLater(() -> {
        Computadora instance = new Computadora();
        instance.delete();
    });
    }
    
}
