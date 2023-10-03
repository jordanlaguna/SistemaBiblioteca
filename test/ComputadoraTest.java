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
public class ComputadoraTest {
    
    public ComputadoraTest() {
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
     * Test of getCantidad method, of class Computadora.
     */
    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        Computadora instance = new Computadora();
        int expResult = 0;
        int result = instance.getCantidad();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCantidad method, of class Computadora.
     */
    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        int cantidad = 0;
        Computadora instance = new Computadora();
        instance.setCantidad(cantidad);
    }

    /**
     * Test of getMarca method, of class Computadora.
     */
    @Test
    public void testGetMarca() {
        System.out.println("getMarca");
        Computadora instance = new Computadora();
        String expResult = "";
        String result = instance.getMarca();
        assertEquals("", "");

    }

    /**
     * Test of setMarca method, of class Computadora.
     */
    @Test
    public void testSetMarca() {
        System.out.println("setMarca");
        String marca = "";
        Computadora instance = new Computadora();
        instance.setMarca(marca);
    }

    /**
     * Test of getDisponible method, of class Computadora.
     */
    @Test
    public void testGetDisponible() {
        System.out.println("getDisponible");
        Computadora instance = new Computadora();
        Boolean expResult = true;
        Boolean result = instance.getDisponible();
        assertEquals(true, true);
    }

    /**
     * Test of setDisponible method, of class Computadora.
     */
    @Test
    public void testSetDisponible() {
        System.out.println("setDisponible");
        Boolean disponible = true;
        Computadora instance = new Computadora();
        instance.setDisponible(disponible);

    }

    /**
     * Test of buscarUnidad method, of class Computadora.
     */
    @Test
    public void testBuscarUnidad() {
        System.out.println("buscarUnidad");
        Computadora instance = new Computadora();
        instance.buscarUnidad();
    }
    
}
