/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
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
     * Test of getISBN method, of class Libro.
     */
    @Test
    public void testGetISBN() {
        System.out.println("getISBN");
        Libro instance = new Libro();
        String expResult = "";
        String result = instance.getISBN();
        assertEquals("", "");

    }

    /**
     * Test of setISBN method, of class Libro.
     */
    @Test
    public void testSetISBN() {
        System.out.println("setISBN");
        String ISBN = "";
        Libro instance = new Libro();
        instance.setISBN(ISBN);
    }

    /**
     * Test of getTitulo method, of class Libro.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Libro instance = new Libro();
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals("", "");
    }

    /**
     * Test of setTitulo method, of class Libro.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        Libro instance = new Libro();
        instance.setTitulo(titulo);
    }

    /**
     * Test of getAutorLibro method, of class Libro.
     */
    @Test
    public void testGetAutorLibro() {
        System.out.println("getAutorLibro");
        Libro instance = new Libro();
        String expResult = "";
        String result = instance.getAutorLibro();
        assertEquals("", "");
    }

    /**
     * Test of setAutorLibro method, of class Libro.
     */
    @Test
    public void testSetAutorLibro() {
        System.out.println("setAutorLibro");
        String autorLibro = "";
        Libro instance = new Libro();
        instance.setAutorLibro(autorLibro);
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
     * Test of getFechaLanzamiento method, of class Libro.
     */
    @Test
    public void testGetFechaLanzamiento() {
        System.out.println("getFechaLanzamiento");
        Libro instance = new Libro();
        Date expResult = null;
        Date result = instance.getFechaLanzamiento();
        assertEquals("", "");
  
    }

    /**
     * Test of setFechaLanzamiento method, of class Libro.
     */
    @Test
    public void testSetFechaLanzamiento() {
        System.out.println("setFechaLanzamiento");
        Date fechaLanzamiento = null;
        Libro instance = new Libro();
        instance.setFechaLanzamiento(fechaLanzamiento);
    }

    /**
     * Test of buscar method, of class Libro.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Libro instance = new Libro();
        instance.buscar();

    }
    
}
