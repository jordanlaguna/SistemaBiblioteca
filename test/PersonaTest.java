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
public class PersonaTest {
    
    public PersonaTest() {
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
     * Test of getFechaNacimiento method, of class Persona.
     */
    @Test
    public void testGetFechaNacimiento() {
        System.out.println("getFechaNacimiento");
        Persona instance = new Persona();
        Date expResult = null;
        Date result = instance.getFechaNacimiento();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFechaNacimiento method, of class Persona.
     */
    @Test
    public void testSetFechaNacimiento() {
        System.out.println("setFechaNacimiento");
        Date fechaNacimiento = null;
        Persona instance = new Persona();
        instance.setFechaNacimiento(fechaNacimiento);
    }

    /**
     * Test of getCedula method, of class Persona.
     */
    @Test
    public void testGetCedula() {
        System.out.println("getCedula");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.getCedula();
        assertEquals("", "");

    }

    /**
     * Test of setCedula method, of class Persona.
     */
    @Test
    public void testSetCedula() {
        System.out.println("setCedula");
        String cedula = "";
        Persona instance = new Persona();
        instance.setCedula(cedula);
    }

    /**
     * Test of getNombre method, of class Persona.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals("", "");
    }

    /**
     * Test of setNombre method, of class Persona.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Persona instance = new Persona();
        instance.setNombre(nombre);
    }

    /**
     * Test of getpApellido method, of class Persona.
     */
    @Test
    public void testGetpApellido() {
        System.out.println("getpApellido");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.getpApellido();
        assertEquals("", "");
 
    }

    /**
     * Test of setpApellido method, of class Persona.
     */
    @Test
    public void testSetpApellido() {
        System.out.println("setpApellido");
        String pApellido = "";
        Persona instance = new Persona();
        instance.setpApellido(pApellido);
    }

    /**
     * Test of getsApellido method, of class Persona.
     */
    @Test
    public void testGetsApellido() {
        System.out.println("getsApellido");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.getsApellido();
        assertEquals("", "");
    }

    /**
     * Test of setsApellido method, of class Persona.
     */
    @Test
    public void testSetsApellido() {
        System.out.println("setsApellido");
        String sApellido = "";
        Persona instance = new Persona();
        instance.setsApellido(sApellido);
    }
    
}
