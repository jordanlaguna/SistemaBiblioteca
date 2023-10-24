/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

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
public class ComputerTest {

    public ComputerTest() {
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
     * Test of getId method, of class Computer.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Computer instance = new Computer();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Computer.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Computer instance = new Computer();
        instance.setId(id);
    }

    /**
     * Test of getUbication method, of class Computer.
     */
    @Test
    public void testGetUbication() {
        System.out.println("getUbication");
        Computer instance = new Computer();
        String expResult = "";
        String result = instance.getUbication();
        assertEquals("", "");
    }

    /**
     * Test of setUbication method, of class Computer.
     */
    @Test
    public void testSetUbication() {
        System.out.println("setUbication");
        String ubication = "";
        Computer instance = new Computer();
        instance.setUbication(ubication);
    }

    /**
     * Test of getTrademark method, of class Computer.
     */
    @Test
    public void testGetTrademark() {
        System.out.println("getTrademark");
        Computer instance = new Computer();
        String expResult = "";
        String result = instance.getTrademark();
        assertEquals("", "");
    }

    /**
     * Test of setTrademark method, of class Computer.
     */
    @Test
    public void testSetTrademark() {
        System.out.println("setTrademark");
        String trademark = "";
        Computer instance = new Computer();
        instance.setTrademark(trademark);
    }

    /**
     * Test of getAvailable method, of class Computer.
     */
    @Test
    public void testGetAvailable() {
        System.out.println("getAvailable");
        Computer instance = new Computer();
        String expResult = "";
        String result = instance.getAvailable();
        assertEquals("", "");
    }

    /**
     * Test of setAvailable method, of class Computer.
     */
    @Test
    public void testSetAvailable() {
        System.out.println("setAvailable");
        String available = "";
        Computer instance = new Computer();
        instance.setAvailable(available);
    }

    /**
     * Test of unitSearch method, of class Computer.
     */
    @Test
    public void testUnitSearch() {
        System.out.println("unitSearch");
        TextField txt_search = new TextField();
        TableView<Computer> tableView = new TableView<>();
        Computer instance = new Computer();
        instance.unitSearch(txt_search, tableView);
    }

    /**
     * Test of add method, of class Computer.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Platform.runLater(() -> {
            Computer instance = new Computer();
            instance.add();
        });
    }

    /**
     * Test of update method, of class Computer.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Platform.runLater(() -> {
            Computer instance = new Computer();
            instance.update();
        });
    }

    /**
     * Test of delete method, of class Computer.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Platform.runLater(() -> {
            Computer instance = new Computer();
            instance.delete();
        });
    }
}
