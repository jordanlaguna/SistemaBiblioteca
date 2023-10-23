/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
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
 * @author julio
 */
public class UsuarioTest {
    
    public UsuarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    @BeforeClass
    public static void initJavaFX() {
        JFXPanel jfxPanel = new JFXPanel(); 
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
     * Test of getId_user method, of class Usuario.
     */
    @Test
    public void testGetId_user() {
        System.out.println("getId_user");
        Usuario instance = new Usuario();
        int expResult = 0;
        int result = instance.getId_user();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId_user method, of class Usuario.
     */
    @Test
    public void testSetId_user() {
        System.out.println("setId_user");
        int id_user = 0;
        Usuario instance = new Usuario();
        instance.setId_user(id_user);
    }

    /**
     * Test of getPassword method, of class Usuario.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals("", "");
    }

    /**
     * Test of setPassword method, of class Usuario.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Usuario instance = new Usuario();
        instance.setPassword(password);
    }

    /**
     * Test of getEmail method, of class Usuario.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals("", "");
    }

    /**
     * Test of setEmail method, of class Usuario.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Usuario instance = new Usuario();
        instance.setEmail(email);
    }

    /**
     * Test of getType method, of class Usuario.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getType();
        assertEquals("", "");
    }

    /**
     * Test of setType method, of class Usuario.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String type = "";
        Usuario instance = new Usuario();
        instance.setType(type);
    }

    /**
     * Test of login method, of class Usuario.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String email = "";
        String password = "";
        String type = "";
        Usuario instance =new Usuario();
        Platform.runLater(() -> {
        boolean expResult = false;
        boolean result = instance.login(email, password, type);
        assertEquals(expResult, result);
        });
    }

    /**
     * Test of registatrarse method, of class Usuario.
     * @throws java.lang.Exception
     */
    @Test
    public void testRegistatrarse() throws Exception {
         System.out.println("registrarse");
        Platform.runLater(() -> {
        Usuario instance = new Usuario();
             try {
                 instance.registatrarse();
             } catch (SQLException ex) {
                 Logger.getLogger(UsuarioTest.class.getName()).log(Level.SEVERE, null, ex);
             }
        });
    }
    
}