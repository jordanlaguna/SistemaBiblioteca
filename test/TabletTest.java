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
public class TabletTest {
    
    public TabletTest() {
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
     * Test of getCantidad method, of class Tablet.
     */
    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        Tablet instance = new Tablet();
        int expResult = 0;
        int result = instance.getCantidad();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCantidad method, of class Tablet.
     */
    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        int cantidad = 0;
        Tablet instance = new Tablet();
        instance.setCantidad(cantidad);
    }

    /**
     * Test of getMarca method, of class Tablet.
     */
    @Test
    public void testGetMarca() {
        System.out.println("getMarca");
        Tablet instance = new Tablet();
        String expResult = "";
        String result = instance.getMarca();
        assertEquals("", "");

    }

    /**
     * Test of setMarca method, of class Tablet.
     */
    @Test
    public void testSetMarca() {
        System.out.println("setMarca");
        String marca = "";
        Tablet instance = new Tablet();
        instance.setMarca(marca);
    }

    /**
     * Test of getDisponible method, of class Tablet.
     */
    @Test
    public void testGetDisponible() {
        System.out.println("getDisponible");
        Tablet instance = new Tablet();
        Boolean expResult = true;
        Boolean result = instance.getDisponible();
        assertEquals(true, true);

    }

    /**
     * Test of setDisponible method, of class Tablet.
     */
    @Test
    public void testSetDisponible() {
        System.out.println("setDisponible");
        Boolean disponible = null;
        Tablet instance = new Tablet();
        instance.setDisponible(disponible);

    }

    /**
     * Test of buscarUnidad method, of class Tablet.
     */
    @Test
    public void testBuscarUnidad() {
        System.out.println("buscarUnidad");
        Tablet instance = new Tablet();
        instance.buscarUnidad();
    }
    
}
