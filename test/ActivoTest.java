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
public class ActivoTest {
    
    public ActivoTest() {
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
     * Test of getFecha method, of class Activo.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Activo instance = new Activo();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFecha method, of class Activo.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        Activo instance = new Activo();
        instance.setFecha(fecha);
  
    }

    /**
     * Test of getUnidad method, of class Activo.
     */
    @Test
    public void testGetUnidad() {
        System.out.println("getUnidad");
        Activo instance = new Activo();
        List expResult = null;
        List result = instance.getUnidad();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUnidad method, of class Activo.
     */
    @Test
    public void testSetUnidad() {
        System.out.println("setUnidad");
        List unidad = null;
        Activo instance = new Activo();
        instance.setUnidad(unidad);
    }

    /**
     * Test of getUsuario method, of class Activo.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Activo instance = new Activo();
        List expResult = null;
        List result = instance.getUsuario();
        assertEquals(expResult, result);    
    }

    /**
     * Test of setUsuario method, of class Activo.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        List usuario = null;
        Activo instance = new Activo();
        instance.setUsuario(usuario);
    }

    /**
     * Test of getEjemplares method, of class Activo.
     */
    @Test
    public void testGetEjemplares() {
        System.out.println("getEjemplares");
        Activo instance = new Activo();
        List expResult = null;
        List result = instance.getEjemplares();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEjemplares method, of class Activo.
     */
    @Test
    public void testSetEjemplares() {
        System.out.println("setEjemplares");
        List ejemplares = null;
        Activo instance = new Activo();
        instance.setEjemplares(ejemplares);
    }

    /**
     * Test of buscar method, of class Activo.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Activo instance = new Activo();
        instance.buscar();
    }

    /**
     * Test of modificar method, of class Activo.
     */
    @Test
    public void testModificar() {
        System.out.println("modificar");
        Activo instance = new Activo();
        instance.modificar();

    }
    
}
