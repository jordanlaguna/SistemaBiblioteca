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
public class LibroTest {
    
    public LibroTest() {
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
     * Test of getAvailable method, of class Libro.
     */
    @Test
    public void testGetAvailable() {
        System.out.println("getAvailable");
        Libro instance = new Libro();
        String expResult = "";
        String result = instance.getAvailable();
        assertEquals("", "");
    }

    /**
     * Test of setAvailable method, of class Libro.
     */
    @Test
    public void testSetAvailable() {
        System.out.println("setAvailable");
        String available = "";
        Libro instance = new Libro();
        instance.setAvailable(available);
    }

    /**
     * Test of getIsbn method, of class Libro.
     */
    @Test
    public void testGetIsbn() {
        System.out.println("getIsbn");
        Libro instance = new Libro();
        Integer expResult = null;
        Integer result = instance.getIsbn();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIsbn method, of class Libro.
     */
    @Test
    public void testSetIsbn() {
        System.out.println("setIsbn");
        Integer isbn = null;
        Libro instance = new Libro();
        instance.setIsbn(isbn);
    }

    /**
     * Test of getTitle method, of class Libro.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Libro instance = new Libro();
        String expResult = "";
        String result = instance.getTitle();
        assertEquals("", "");
    }

    /**
     * Test of setTitle method, of class Libro.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Libro instance = new Libro();
        instance.setTitle(title);
    }

    /**
     * Test of getAuthorBook method, of class Libro.
     */
    @Test
    public void testGetAuthorBook() {
        System.out.println("getAuthorBook");
        Libro instance = new Libro();
        String expResult = "";
        String result = instance.getAuthorBook();
        assertEquals("", "");
    }

    /**
     * Test of setAuthorBook method, of class Libro.
     */
    @Test
    public void testSetAuthorBook() {
        System.out.println("setAuthorBook");
        String authorBook = "";
        Libro instance = new Libro();
        instance.setAuthorBook(authorBook);
    }

    /**
     * Test of getEditorial method, of class Libro.
     */
    @Test
    public void testGetEditorial() {
        System.out.println("getEditorial");
        Libro instance = new Libro();
        String expResult = "";
        String result = instance.getEditorial();
        assertEquals("", "");
    }

    /**
     * Test of setEditorial method, of class Libro.
     */
    @Test
    public void testSetEditorial() {
        System.out.println("setEditorial");
        String editorial = "";
        Libro instance = new Libro();
        instance.setEditorial(editorial);
    }

    /**
     * Test of getReleaseDate method, of class Libro.
     */
    @Test
    public void testGetReleaseDate() {
        System.out.println("getReleaseDate");
        Libro instance = new Libro();
        Date expResult = null;
        Date result = instance.getReleaseDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setReleaseDate method, of class Libro.
     */
    @Test
    public void testSetReleaseDate() {
        System.out.println("setReleaseDate");
        Date releaseDate = null;
        Libro instance = new Libro();
        instance.setReleaseDate(releaseDate);
    }

    /**
     * Test of searchBook method, of class Libro.
     */
    @Test
    public void testSearchBook() {
        System.out.println("searchBook");
        TextField txt_search = new TextField();
        TableView<Libro> tableView = new TableView<>();
        Libro instance = new Libro();
        instance.searchBook(txt_search, tableView);
    }
    
}
