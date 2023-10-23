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
public class BibliotecaTest {
    
    public BibliotecaTest() {
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
     * Test of getBooksQuantity method, of class Biblioteca.
     */
    @Test
    public void testGetBooksQuantity() {
        System.out.println("getBooksQuantity");
        Biblioteca instance = new Biblioteca();
        int expResult = 0;
        int result = instance.getBooksQuantity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBooksQuantity method, of class Biblioteca.
     */
    @Test
    public void testSetBooksQuantity() {
        System.out.println("setBooksQuantity");
        int booksQuantity = 0;
        Biblioteca instance = new Biblioteca();
        instance.setBooksQuantity(booksQuantity);
 
    }

    /**
     * Test of getEquipmentQuantity method, of class Biblioteca.
     */
    @Test
    public void testGetEquipmentQuantity() {
        System.out.println("getEquipmentQuantity");
        Biblioteca instance = new Biblioteca();
        int expResult = 0;
        int result = instance.getEquipmentQuantity();
        assertEquals(expResult, result);

    }

    /**
     * Test of setEquipmentQuantity method, of class Biblioteca.
     */
    @Test
    public void testSetEquipmentQuantity() {
        System.out.println("setEquipmentQuantity");
        int equipmentQuantity = 0;
        Biblioteca instance = new Biblioteca();
        instance.setEquipmentQuantity(equipmentQuantity);
    }

    /**
     * Test of getName method, of class Biblioteca.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Biblioteca instance = new Biblioteca();
        String expResult = "";
        String result = instance.getName();
        assertEquals("", "");
    }

    /**
     * Test of setName method, of class Biblioteca.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Biblioteca instance = new Biblioteca();
        instance.setName(name);

    }
    
}
