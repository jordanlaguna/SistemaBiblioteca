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
     * Test of equipo method, of class Biblioteca.
     */
    @Test
    public void testEquipo() {
        System.out.println("equipo");
        Biblioteca instance = new Biblioteca();
        instance.equipo();
    }

    /**
     * Test of prestamo method, of class Biblioteca.
     */
    @Test
    public void testPrestamo() {
        System.out.println("prestamo");
        Biblioteca instance = new Biblioteca();
        instance.prestamo();
    }

    /**
     * Test of libro method, of class Biblioteca.
     */
    @Test
    public void testLibro() {
        System.out.println("libro");
        Biblioteca instance = new Biblioteca();
        instance.libro();
    }
    
}
