/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

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
     * Test of getBirthDay method, of class Persona.
     */
    @Test
    public void testGetBirthDay() {
        System.out.println("getBirthDay");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.getBirthDay();
        assertEquals("", "");
   
    }

    /**
     * Test of setBirthDay method, of class Persona.
     */
    @Test
    public void testSetBirthDay() {
        System.out.println("setBirthDay");
        String birthDay = "";
        Persona instance = new Persona();
        instance.setBirthDay(birthDay);
    }

    /**
     * Test of getIdentification method, of class Persona.
     */
    @Test
    public void testGetIdentification() {
        System.out.println("getIdentification");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.getIdentification();
        assertEquals("", "");
    }

    /**
     * Test of setIdentification method, of class Persona.
     */
    @Test
    public void testSetIdentification() {
        System.out.println("setIdentification");
        String identification = "";
        Persona instance = new Persona();
        instance.setIdentification(identification);
    }

    /**
     * Test of getName method, of class Persona.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.getName();
        assertEquals("", "");
    }

    /**
     * Test of setName method, of class Persona.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Persona instance = new Persona();
        instance.setName(name);
    }

    /**
     * Test of getFirtsName method, of class Persona.
     */
    @Test
    public void testGetFirtsName() {
        System.out.println("getFirtsName");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.getFirtsName();
        assertEquals("", "");
    }

    /**
     * Test of setFirtsName method, of class Persona.
     */
    @Test
    public void testSetFirtsName() {
        System.out.println("setFirtsName");
        String firtsName = "";
        Persona instance = new Persona();
        instance.setFirtsName(firtsName);
    }

    /**
     * Test of getSecondName method, of class Persona.
     */
    @Test
    public void testGetSecondName() {
        System.out.println("getSecondName");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.getSecondName();
        assertEquals("", "");
    }

    /**
     * Test of setSecondName method, of class Persona.
     */
    @Test
    public void testSetSecondName() {
        System.out.println("setSecondName");
        String secondName = "";
        Persona instance = new Persona();
        instance.setSecondName(secondName);

    }
    
}
