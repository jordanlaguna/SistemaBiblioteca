/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Date;
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
     * Test of getId_person method, of class Persona.
     */
    @Test
    public void testGetId_person() {
        System.out.println("getId_person");
        Persona instance = new Persona();
        int expResult = 0;
        int result = instance.getId_person();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId_person method, of class Persona.
     */
    @Test
    public void testSetId_person() {
        System.out.println("setId_person");
        int id_person = 0;
        Persona instance = new Persona();
        instance.setId_person(id_person);
    }

    /**
     * Test of getTelephone method, of class Persona.
     */
    @Test
    public void testGetTelephone() {
        System.out.println("getTelephone");
        Persona instance = new Persona();
        int expResult = 0;
        int result = instance.getTelephone();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTelephone method, of class Persona.
     */
    @Test
    public void testSetTelephone() {
        System.out.println("setTelephone");
        int telephone = 0;
        Persona instance = new Persona();
        instance.setTelephone(telephone);
    }

    /**
     * Test of getBirth_date method, of class Persona.
     */
    @Test
    public void testGetBirth_date() {
        System.out.println("getBirth_date");
        Persona instance = new Persona();
        Date expResult = null;
        Date result = instance.getBirth_date();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBirth_date method, of class Persona.
     */
    @Test
    public void testSetBirth_date() {
        System.out.println("setBirth_date");
        Date birth_date = null;
        Persona instance = new Persona();
        instance.setBirth_date(birth_date);
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
     * Test of getLastName method, of class Persona.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals("", "");
    }

    /**
     * Test of setLastName method, of class Persona.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        Persona instance = new Persona();
        instance.setLastName(lastName);
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
