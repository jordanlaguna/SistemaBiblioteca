/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import java.util.List;
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
public class DevolucionTest {
    
    public DevolucionTest() {
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
     * Test of getFecha method, of class Devolucion.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Devolucion instance = new Devolucion();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFecha method, of class Devolucion.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        Devolucion instance = new Devolucion();
        instance.setFecha(fecha);
    }

    /**
     * Test of getFechaEntrega method, of class Devolucion.
     */
    @Test
    public void testGetFechaEntrega() {
        System.out.println("getFechaEntrega");
        Devolucion instance = new Devolucion();
        Date expResult = null;
        Date result = instance.getFechaEntrega();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFechaEntrega method, of class Devolucion.
     */
    @Test
    public void testSetFechaEntrega() {
        System.out.println("setFechaEntrega");
        Date fechaEntrega = null;
        Devolucion instance = new Devolucion();
        instance.setFechaEntrega(fechaEntrega);

    }

    /**
     * Test of getUnidad method, of class Devolucion.
     */
    @Test
    public void testGetUnidad() {
        System.out.println("getUnidad");
        Devolucion instance = new Devolucion();
        List expResult = null;
        List result = instance.getUnidad();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUnidad method, of class Devolucion.
     */
    @Test
    public void testSetUnidad() {
        System.out.println("setUnidad");
        List unidad = null;
        Devolucion instance = new Devolucion();
        instance.setUnidad(unidad);
    }

    /**
     * Test of getEjemplares method, of class Devolucion.
     */
    @Test
    public void testGetEjemplares() {
        System.out.println("getEjemplares");
        Devolucion instance = new Devolucion();
        List expResult = null;
        List result = instance.getEjemplares();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEjemplares method, of class Devolucion.
     */
    @Test
    public void testSetEjemplares() {
        System.out.println("setEjemplares");
        List ejemplares = null;
        Devolucion instance = new Devolucion();
        instance.setEjemplares(ejemplares);
    }

    /**
     * Test of getUsuario method, of class Devolucion.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Devolucion instance = new Devolucion();
        List expResult = null;
        List result = instance.getUsuario();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUsuario method, of class Devolucion.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        List usuario = null;
        Devolucion instance = new Devolucion();
        instance.setUsuario(usuario);
    }

    /**
     * Test of buscar method, of class Devolucion.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Devolucion instance = new Devolucion();
        instance.buscar();
    }
    
}
