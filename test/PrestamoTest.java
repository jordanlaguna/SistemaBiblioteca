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
public class PrestamoTest {
    
    public PrestamoTest() {
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
     * Test of getFechaPrestamo method, of class Prestamo.
     */
    @Test
    public void testGetFechaPrestamo() {
        System.out.println("getFechaPrestamo");
        Prestamo instance = new Prestamo();
        Date expResult = null;
        Date result = instance.getFechaPrestamo();
        assertEquals(expResult, result); 
    }

    /**
     * Test of setFechaPrestamo method, of class Prestamo.
     */
    @Test
    public void testSetFechaPrestamo() {
        System.out.println("setFechaPrestamo");
        Date fechaPrestamo = null;
        Prestamo instance = new Prestamo();
        instance.setFechaPrestamo(fechaPrestamo); 
    }

    /**
     * Test of getEjemplares method, of class Prestamo.
     */
    @Test
    public void testGetEjemplares() {
        System.out.println("getEjemplares");
        Prestamo instance = new Prestamo();
        List expResult = null;
        List result = instance.getEjemplares();
        assertEquals(expResult, result); 
    }

    /**
     * Test of setEjemplares method, of class Prestamo.
     */
    @Test
    public void testSetEjemplares() {
        System.out.println("setEjemplares");
        List ejemplares = null;
        Prestamo instance = new Prestamo();
        instance.setEjemplares(ejemplares); 
    }

    /**
     * Test of getFechaDevolucion method, of class Prestamo.
     */
    @Test
    public void testGetFechaDevolucion() {
        System.out.println("getFechaDevolucion");
        Prestamo instance = new Prestamo();
        Date expResult = null;
        Date result = instance.getFechaDevolucion();
        assertEquals(expResult, result); 
    }

    /**
     * Test of setFechaDevolucion method, of class Prestamo.
     */
    @Test
    public void testSetFechaDevolucion() {
        System.out.println("setFechaDevolucion");
        Date fechaDevolucion = null;
        Prestamo instance = new Prestamo();
        instance.setFechaDevolucion(fechaDevolucion); 
    }

    /**
     * Test of getUnidad method, of class Prestamo.
     */
    @Test
    public void testGetUnidad() {
        System.out.println("getUnidad");
        Prestamo instance = new Prestamo();
        List expResult = null;
        List result = instance.getUnidad();
        assertEquals(expResult, result); 
    }

    /**
     * Test of setUnidad method, of class Prestamo.
     */
    @Test
    public void testSetUnidad() {
        System.out.println("setUnidad");
        List unidad = null;
        Prestamo instance = new Prestamo();
        instance.setUnidad(unidad); 
    }

    /**
     * Test of getNumPrestamo method, of class Prestamo.
     */
    @Test
    public void testGetNumPrestamo() {
        System.out.println("getNumPrestamo");
        Prestamo instance = new Prestamo();
        int expResult = 0;
        int result = instance.getNumPrestamo();
        assertEquals(expResult, result); 
    }

    /**
     * Test of setNumPrestamo method, of class Prestamo.
     */
    @Test
    public void testSetNumPrestamo() {
        System.out.println("setNumPrestamo");
        int numPrestamo = 0;
        Prestamo instance = new Prestamo();
        instance.setNumPrestamo(numPrestamo); 
    }

    /**
     * Test of verPrestamoActivos method, of class Prestamo.
     */
    @Test
    public void testVerPrestamoActivos() {
        System.out.println("verPrestamoActivos");
        Prestamo instance = new Prestamo();
        instance.verPrestamoActivos(); 
    }

    /**
     * Test of agregar method, of class Prestamo.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        Prestamo instance = new Prestamo();
        instance.agregar(); 
    }

    /**
     * Test of buscar method, of class Prestamo.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Prestamo instance = new Prestamo();
        instance.buscar(); 
    }

    /**
     * Test of verDevoluciones method, of class Prestamo.
     */
    @Test
    public void testVerDevoluciones() {
        System.out.println("verDevoluciones");
        Prestamo instance = new Prestamo();
        instance.verDevoluciones(); 
    }

    /**
     * Test of notas method, of class Prestamo.
     */
    @Test
    public void testNotas() {
        System.out.println("notas");
        Prestamo instance = new Prestamo();
        instance.notas(); 
    }

    /**
     * Test of usuarios method, of class Prestamo.
     */
    @Test
    public void testUsuarios() {
        System.out.println("usuarios");
        Prestamo instance = new Prestamo();
        instance.usuarios(); 
    }
}
