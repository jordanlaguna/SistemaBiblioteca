/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package clases;

import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gatov
 */
public class ActivoTest {
    
    public ActivoTest() {
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
     * Test of getDate method, of class Activo.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Activo instance = new Activo();
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
         
    }

    /**
     * Test of setDate method, of class Activo.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = null;
        Activo instance = new Activo();
        instance.setDate(date);
         
    }

    /**
     * Test of getUnit method, of class Activo.
     */
    @Test
    public void testGetUnit() {
        System.out.println("getUnit");
        Activo instance = new Activo();
        List expResult = null;
        List result = instance.getUnit();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setUnit method, of class Activo.
     */
    @Test
    public void testSetUnit() {
        System.out.println("setUnit");
        List unit = null;
        Activo instance = new Activo();
        instance.setUnit(unit);
       
    }

    /**
     * Test of getUser method, of class Activo.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Activo instance = new Activo();
        List expResult = null;
        List result = instance.getUser();
        assertEquals(expResult, result);
         
    }

    /**
     * Test of setUser method, of class Activo.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        List user = null;
        Activo instance = new Activo();
        instance.setUser(user);
         
    }

    /**
     * Test of getCopy method, of class Activo.
     */
    @Test
    public void testGetCopy() {
        System.out.println("getCopy");
        Activo instance = new Activo();
        List expResult = null;
        List result = instance.getCopy();
        assertEquals(expResult, result);
         
    }

    /**
     * Test of setCopy method, of class Activo.
     */
    @Test
    public void testSetCopy() {
        System.out.println("setCopy");
        List copy = null;
        Activo instance = new Activo();
        instance.setCopy(copy);
         
    }

    /**
     * Test of search method, of class Activo.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        Activo instance = new Activo();
        instance.search();
         
    }

    /**
     * Test of update method, of class Activo.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Activo instance = new Activo();
        instance.update();
         
    }
    
}
