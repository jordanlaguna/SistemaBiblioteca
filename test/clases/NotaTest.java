/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

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
public class NotaTest {
    
    public NotaTest() {
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
     * Test of getDate method, of class Nota.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Nota instance = new Nota();
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDate method, of class Nota.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = null;
        Nota instance = new Nota();
        instance.setDate(date);
    }

    /**
     * Test of getNote method, of class Nota.
     */
    @Test
    public void testGetNote() {
        System.out.println("getNote");
        Nota instance = new Nota();
        String expResult = "";
        String result = instance.getNote();
        assertEquals("", "");
    }

    /**
     * Test of setNote method, of class Nota.
     */
    @Test
    public void testSetNote() {
        System.out.println("setNote");
        String note = "";
        Nota instance = new Nota();
        instance.setNote(note);
    }

    /**
     * Test of getIdentification method, of class Nota.
     */
    @Test
    public void testGetIdentification() {
        System.out.println("getIdentification");
        Nota instance = new Nota();
        String expResult = "";
        String result = instance.getIdentification();
        assertEquals("", "");
    }

    /**
     * Test of setIdentification method, of class Nota.
     */
    @Test
    public void testSetIdentification() {
        System.out.println("setIdentification");
        String identification = "";
        Nota instance = new Nota();
        instance.setIdentification(identification);
    }
    
}
