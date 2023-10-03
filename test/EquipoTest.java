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
public class EquipoTest {
    
    public EquipoTest() {
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
     * Test of getCantidad method, of class Equipo.
     */
    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        Equipo instance = new Equipo();
        int expResult = 0;
        int result = instance.getCantidad();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCantidad method, of class Equipo.
     */
    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        int cantidad = 0;
        Equipo instance = new Equipo();
        instance.setCantidad(cantidad);
    }

    /**
     * Test of verTable method, of class Equipo.
     */
    @Test
    public void testVerTable() {
        System.out.println("verTable");
        Equipo instance = new Equipo();
        instance.verTable();
    }

    /**
     * Test of verComputadora method, of class Equipo.
     */
    @Test
    public void testVerComputadora() {
        System.out.println("verComputadora");
        Equipo instance = new Equipo();
        instance.verComputadora();
    }
    
}
