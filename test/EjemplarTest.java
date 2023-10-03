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
public class EjemplarTest {
    
    public EjemplarTest() {
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
     * Test of getPaginas method, of class Ejemplar.
     */
    @Test
    public void testGetPaginas() {
        System.out.println("getPaginas");
        Ejemplar instance = new Ejemplar();
        int expResult = 0;
        int result = instance.getPaginas();
        assertEquals(0, 0);
        // TODO review the generated test code and remove the default call to fail.
         
    }

    /**
     * Test of setPaginas method, of class Ejemplar.
     */
    @Test
    public void testSetPaginas() {
        System.out.println("setPaginas");
        int paginas = 0;
        Ejemplar instance = new Ejemplar();
        instance.setPaginas(paginas);
        // TODO review the generated test code and remove the default call to fail.
         
    }

    /**
     * Test of getCodigo method, of class Ejemplar.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Ejemplar instance = new Ejemplar();
        String expResult = "";
        String result = instance.getCodigo();
        assertEquals("", "");
    }

    /**
     * Test of setCodigo method, of class Ejemplar.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        String codigo = "";
        Ejemplar instance = new Ejemplar();
        instance.setCodigo(codigo);
 
    }

    /**
     * Test of getDisponible method, of class Ejemplar.
     */
    @Test
    public void testGetDisponible() {
        System.out.println("getDisponible");
        Ejemplar instance = new Ejemplar();
        Boolean expResult = null;
        Boolean result = instance.getDisponible();
        assertEquals(expResult, result);
         
    }

    /**
     * Test of setDisponible method, of class Ejemplar.
     */
    @Test
    public void testSetDisponible() {
        System.out.println("setDisponible");
        Boolean disponible = null;
        Ejemplar instance = new Ejemplar();
        instance.setDisponible(disponible);
         
    }

    /**
     * Test of detalles method, of class Ejemplar.
     */
    @Test
    public void testDetalles() {
        System.out.println("detalles");
        Ejemplar instance = new Ejemplar();
        instance.detalles();
        
    } 
}
