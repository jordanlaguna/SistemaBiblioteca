/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class ProfesorTest {
    
    public ProfesorTest() {
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
     * Test of getTipo method, of class Profesor.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Profesor instance = new Profesor();
        String expResult = "";
        String result = instance.getTipo();
        assertEquals("", "");

    }

    /**
     * Test of setTipo method, of class Profesor.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        Profesor instance = new Profesor();
        instance.setTipo(tipo);

    }
    
}
