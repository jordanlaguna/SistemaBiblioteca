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
public class ExemplarTest {
    
    public ExemplarTest() {
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
     * Test of getPage method, of class Exemplar.
     */
    @Test
    public void testGetPage() {
        System.out.println("getPage");
        Exemplar instance = new Exemplar();
        int expResult = 0;
        int result = instance.getPage();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPage method, of class Exemplar.
     */
    @Test
    public void testSetPage() {
        System.out.println("setPage");
        int page = 0;
        Exemplar instance = new Exemplar();
        instance.setPage(page);
    }

    /**
     * Test of getCode method, of class Exemplar.
     */
    @Test
    public void testGetCode() {
        System.out.println("getCode");
        Exemplar instance = new Exemplar();
        String expResult = "";
        String result = instance.getCode();
        assertEquals("", "");
    }

    /**
     * Test of setCode method, of class Exemplar.
     */
    @Test
    public void testSetCode() {
        System.out.println("setCode");
        String code = "";
        Exemplar instance = new Exemplar();
        instance.setCode(code);
    }

    /**
     * Test of getAvailable method, of class Exemplar.
     */
    @Test
    public void testGetAvailable() {
        System.out.println("getAvailable");
        Exemplar instance = new Exemplar();
        Boolean expResult = null;
        Boolean result = instance.getAvailable();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAvailable method, of class Exemplar.
     */
    @Test
    public void testSetAvailable() {
        System.out.println("setAvailable");
        Boolean available = null;
        Exemplar instance = new Exemplar();
        instance.setAvailable(available);
    }

    /**
     * Test of details method, of class Exemplar.
     */
    @Test
    public void testDetails() {
        System.out.println("details");
        Exemplar instance = new Exemplar();
        instance.details();
    }
    
}
