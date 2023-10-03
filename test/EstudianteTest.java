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
public class EstudianteTest {
    
    public EstudianteTest() {
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
     * Test of getTipo method, of class Estudiante.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Estudiante instance = new Estudiante();
        String expResult = "";
        String result = instance.getTipo();
        assertEquals("", "");
    }

    /**
     * Test of setTipo method, of class Estudiante.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        Estudiante instance = new Estudiante();
        instance.setTipo(tipo);
    }
    
}
