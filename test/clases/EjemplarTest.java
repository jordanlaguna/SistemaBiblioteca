/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

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
public class EjemplarTest {
    
    public EjemplarTest() {
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
     * Test of getPage method, of class Ejemplar.
     */
    @Test
    public void testGetPage() {
        System.out.println("getPage");
        Ejemplar instance = new Ejemplar();
        int expResult = 0;
        int result = instance.getPage();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPage method, of class Ejemplar.
     */
    @Test
    public void testSetPage() {
        System.out.println("setPage");
        int page = 0;
        Ejemplar instance = new Ejemplar();
        instance.setPage(page);
    }

    /**
     * Test of getCode method, of class Ejemplar.
     */
    @Test
    public void testGetCode() {
        System.out.println("getCode");
        Ejemplar instance = new Ejemplar();
        String expResult = "";
        String result = instance.getCode();
        assertEquals("", "");

    }

    /**
     * Test of setCode method, of class Ejemplar.
     */
    @Test
    public void testSetCode() {
        System.out.println("setCode");
        String code = "";
        Ejemplar instance = new Ejemplar();
        instance.setCode(code);
    }

    /**
     * Test of getAvailable method, of class Ejemplar.
     */
    @Test
    public void testGetAvailable() {
        System.out.println("getAvailable");
        Ejemplar instance = new Ejemplar();
        Boolean expResult = null;
        Boolean result = instance.getAvailable();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAvailable method, of class Ejemplar.
     */
    @Test
    public void testSetAvailable() {
        System.out.println("setAvailable");
        Boolean available = null;
        Ejemplar instance = new Ejemplar();
        instance.setAvailable(available);
    }

    /**
     * Test of details method, of class Ejemplar.
     */
    @Test
    public void testDetails() {
        System.out.println("details");
        Ejemplar instance = new Ejemplar();
        instance.details();
    }
    
}
