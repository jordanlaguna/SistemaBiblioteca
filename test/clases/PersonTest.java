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
public class PersonTest {
    
    public PersonTest() {
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
     * Test of getId_person method, of class Person.
     */
    @Test
    public void testGetId_person() {
        System.out.println("getId_person");
        Person instance = new Person();
        int expResult = 0;
        int result = instance.getId_person();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId_person method, of class Person.
     */
    @Test
    public void testSetId_person() {
        System.out.println("setId_person");
        int id_person = 0;
        Person instance = new Person();
        instance.setId_person(id_person);
    }

    /**
     * Test of getTelephone method, of class Person.
     */
    @Test
    public void testGetTelephone() {
        System.out.println("getTelephone");
        Person instance = new Person();
        int expResult = 0;
        int result = instance.getTelephone();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTelephone method, of class Person.
     */
    @Test
    public void testSetTelephone() {
        System.out.println("setTelephone");
        int telephone = 0;
        Person instance = new Person();
        instance.setTelephone(telephone);
    }

    /**
     * Test of getBirth_date method, of class Person.
     */
    @Test
    public void testGetBirth_date() {
        System.out.println("getBirth_date");
        Person instance = new Person();
        Date expResult = null;
        Date result = instance.getBirth_date();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBirth_date method, of class Person.
     */
    @Test
    public void testSetBirth_date() {
        System.out.println("setBirth_date");
        Date birth_date = null;
        Person instance = new Person();
        instance.setBirth_date(birth_date);
    }

    /**
     * Test of getIdentification method, of class Person.
     */
    @Test
    public void testGetIdentification() {
        System.out.println("getIdentification");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getIdentification();
        assertEquals("", "");
    }

    /**
     * Test of setIdentification method, of class Person.
     */
    @Test
    public void testSetIdentification() {
        System.out.println("setIdentification");
        String identification = "";
        Person instance = new Person();
        instance.setIdentification(identification);
    }

    /**
     * Test of getName method, of class Person.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getName();
        assertEquals("", "");
    }

    /**
     * Test of setName method, of class Person.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Person instance = new Person();
        instance.setName(name);
    }

    /**
     * Test of getLastName method, of class Person.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals("", "");
    }

    /**
     * Test of setLastName method, of class Person.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        Person instance = new Person();
        instance.setLastName(lastName);
    }

    /**
     * Test of getSecondName method, of class Person.
     */
    @Test
    public void testGetSecondName() {
        System.out.println("getSecondName");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getSecondName();
        assertEquals("", "");

    }

    /**
     * Test of setSecondName method, of class Person.
     */
    @Test
    public void testSetSecondName() {
        System.out.println("setSecondName");
        String secondName = "";
        Person instance = new Person();
        instance.setSecondName(secondName);
    }
    
}
