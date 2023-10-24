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
public class NoteTest {
    
    public NoteTest() {
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
     * Test of getDate method, of class Note.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Note instance = new Note();
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDate method, of class Note.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = null;
        Note instance = new Note();
        instance.setDate(date);
    }

    /**
     * Test of getNote method, of class Note.
     */
    @Test
    public void testGetNote() {
        System.out.println("getNote");
        Note instance = new Note();
        String expResult = "";
        String result = instance.getNote();
        assertEquals("", "");
    }

    /**
     * Test of setNote method, of class Note.
     */
    @Test
    public void testSetNote() {
        System.out.println("setNote");
        String note = "";
        Note instance = new Note();
        instance.setNote(note);
    }

    /**
     * Test of getIdentification method, of class Note.
     */
    @Test
    public void testGetIdentification() {
        System.out.println("getIdentification");
        Note instance = new Note();
        String expResult = "";
        String result = instance.getIdentification();
        assertEquals("", "");

    }

    /**
     * Test of setIdentification method, of class Note.
     */
    @Test
    public void testSetIdentification() {
        System.out.println("setIdentification");
        String identification = "";
        Note instance = new Note();
        instance.setIdentification(identification);
    }
    
}
