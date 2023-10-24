/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
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
public class UserTest {

    public UserTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }
    @BeforeClass
    public static void initJFX() {
       new JFXPanel(); // Inicializa JavaFX para pruebas
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
     * Test of getId_user method, of class User.
     */
    @Test
    public void testGetId_user() {
        System.out.println("getId_user");
        User instance = new User();
        int expResult = 0;
        int result = instance.getId_user();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId_user method, of class User.
     */
    @Test
    public void testSetId_user() {
        System.out.println("setId_user");
        int id_user = 0;
        User instance = new User();
        instance.setId_user(id_user);
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        User instance = new User();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals("", "");
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        User instance = new User();
        instance.setPassword(password);
    }

    /**
     * Test of getEmail method, of class User.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        User instance = new User();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals("", "");
    }

    /**
     * Test of setEmail method, of class User.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        User instance = new User();
        instance.setEmail(email);
    }

    /**
     * Test of getType method, of class User.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        User instance = new User();
        String expResult = "";
        String result = instance.getType();
        assertEquals("", "");
    }

    /**
     * Test of setType method, of class User.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String type = "";
        User instance = new User();
        instance.setType(type);
    }

    /**
     * Test of login method, of class User.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String email = "";
        String password = "";
        String type = "";
        User instance = new User();
        Platform.runLater(() -> {
        boolean expResult = false;
        boolean result = instance.login(email, password, type);
        assertEquals(expResult, result);
        });
    }

    /**
     * Test of registatrarse method, of class User.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testRegistatrarse() throws Exception {
        System.out.println("registatrarse");
        Platform.runLater(() -> {
            User instance = new User();
            try {
                instance.registrarse();
            } catch (SQLException ex) {
                Logger.getLogger(UserTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
}
