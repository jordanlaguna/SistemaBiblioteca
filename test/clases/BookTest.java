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
public class BookTest {
    
    public BookTest() {
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
     * Test of getAvailable method, of class Book.
     */
    @Test
    public void testGetAvailable() {
        System.out.println("getAvailable");
        Book instance = new Book();
        String expResult = "";
        String result = instance.getAvailable();
        assertEquals("", "");
    }

    /**
     * Test of setAvailable method, of class Book.
     */
    @Test
    public void testSetAvailable() {
        System.out.println("setAvailable");
        String available = "";
        Book instance = new Book();
        instance.setAvailable(available);
    }

    /**
     * Test of getIsbn method, of class Book.
     */
    @Test
    public void testGetIsbn() {
        System.out.println("getIsbn");
        Book instance = new Book();
        Integer expResult = null;
        Integer result = instance.getIsbn();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIsbn method, of class Book.
     */
    @Test
    public void testSetIsbn() {
        System.out.println("setIsbn");
        Integer isbn = null;
        Book instance = new Book();
        instance.setIsbn(isbn);
    }

    /**
     * Test of getTitle method, of class Book.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Book instance = new Book();
        String expResult = "";
        String result = instance.getTitle();
        assertEquals("", "");
    }

    /**
     * Test of setTitle method, of class Book.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Book instance = new Book();
        instance.setTitle(title);
    }

    /**
     * Test of getAuthorBook method, of class Book.
     */
    @Test
    public void testGetAuthorBook() {
        System.out.println("getAuthorBook");
        Book instance = new Book();
        String expResult = "";
        String result = instance.getAuthorBook();
        assertEquals("", "");
    }

    /**
     * Test of setAuthorBook method, of class Book.
     */
    @Test
    public void testSetAuthorBook() {
        System.out.println("setAuthorBook");
        String authorBook = "";
        Book instance = new Book();
        instance.setAuthorBook(authorBook);
    }

    /**
     * Test of getEditorial method, of class Book.
     */
    @Test
    public void testGetEditorial() {
        System.out.println("getEditorial");
        Book instance = new Book();
        String expResult = "";
        String result = instance.getEditorial();
        assertEquals("", "");
    }

    /**
     * Test of setEditorial method, of class Book.
     */
    @Test
    public void testSetEditorial() {
        System.out.println("setEditorial");
        String editorial = "";
        Book instance = new Book();
        instance.setEditorial(editorial);
    }

    /**
     * Test of getReleaseDate method, of class Book.
     */
    @Test
    public void testGetReleaseDate() {
        System.out.println("getReleaseDate");
        Book instance = new Book();
        Date expResult = null;
        Date result = instance.getReleaseDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setReleaseDate method, of class Book.
     */
    @Test
    public void testSetReleaseDate() {
        System.out.println("setReleaseDate");
        Date releaseDate = null;
        Book instance = new Book();
        instance.setReleaseDate(releaseDate);
    }

    /**
     * Test of searchBook method, of class Book.
     */
    @Test
    public void testSearchBook() {
        System.out.println("searchBook");
        TextField txt_search = new TextField();
        TableView<Book> tableView = new TableView<>();
        Book instance = new Book();
        instance.searchBook(txt_search, tableView);
    }
    
}
