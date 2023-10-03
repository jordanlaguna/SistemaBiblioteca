/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class NotaTest {
    
    public NotaTest() {
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
     * Test of getFecha method, of class Nota.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Nota instance = new Nota();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFecha method, of class Nota.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        Nota instance = new Nota();
        instance.setFecha(fecha);
    }

    /**
     * Test of getNumNotas method, of class Nota.
     */
    @Test
    public void testGetNumNotas() {
        System.out.println("getNumNotas");
        Nota instance = new Nota();
        int expResult = 0;
        int result = instance.getNumNotas();
        assertEquals(0, 0);
    }

    /**
     * Test of setNumNotas method, of class Nota.
     */
    @Test
    public void testSetNumNotas() {
        System.out.println("setNumNotas");
        int numNotas = 0;
        Nota instance = new Nota();
        instance.setNumNotas(numNotas);
    }

    /**
     * Test of getNota method, of class Nota.
     */
    @Test
    public void testGetNota() {
        System.out.println("getNota");
        Nota instance = new Nota();
        String expResult = "";
        String result = instance.getNota();
        assertEquals("", "");
    }

    /**
     * Test of setNota method, of class Nota.
     */
    @Test
    public void testSetNota() {
        System.out.println("setNota");
        String nota = "";
        Nota instance = new Nota();
        instance.setNota(nota);
    }

    /**
     * Test of agregar method, of class Nota.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        Nota instance = new Nota();
        instance.agregar();
    }

    /**
     * Test of buscar method, of class Nota.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Nota instance = new Nota();
        instance.buscar();
    }

    /**
     * Test of modificar method, of class Nota.
     */
    @Test
    public void testModificar() {
        System.out.println("modificar");
        Nota instance = new Nota();
        instance.modificar();
    }

    /**
     * Test of eliminar method, of class Nota.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Nota instance = new Nota();
        instance.eliminar();
    }
    
}
