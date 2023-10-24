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
public class LibraryTest {
    
    public LibraryTest() {
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
     * Test of getBooksQuantity method, of class Library.
     */
    @Test
    public void testGetBooksQuantity() {
        System.out.println("getBooksQuantity");
        Library instance = new Library();
        int expResult = 0;
        int result = instance.getBooksQuantity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBooksQuantity method, of class Library.
     */
    @Test
    public void testSetBooksQuantity() {
        System.out.println("setBooksQuantity");
        int booksQuantity = 0;
        Library instance = new Library();
        instance.setBooksQuantity(booksQuantity);
    }

    /**
     * Test of getEquipmentQuantity method, of class Library.
     */
    @Test
    public void testGetEquipmentQuantity() {
        System.out.println("getEquipmentQuantity");
        Library instance = new Library();
        int expResult = 0;
        int result = instance.getEquipmentQuantity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEquipmentQuantity method, of class Library.
     */
    @Test
    public void testSetEquipmentQuantity() {
        System.out.println("setEquipmentQuantity");
        int equipmentQuantity = 0;
        Library instance = new Library();
        instance.setEquipmentQuantity(equipmentQuantity);
    }

    /**
     * Test of getName method, of class Library.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Library instance = new Library();
        String expResult = "";
        String result = instance.getName();
        assertEquals("", "");
    }

    /**
     * Test of setName method, of class Library.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Library instance = new Library();
        instance.setName(name);

    }
    
}
