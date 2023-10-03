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
public class UsuarioTest {
    
    public UsuarioTest() {
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
     * Test of verLibros method, of class Usuario.
     */
    @Test
    public void testVerLibros() {
        System.out.println("verLibros");
        Usuario instance = new Usuario();
        instance.verLibros();

    }

    /**
     * Test of pedirPrestamo method, of class Usuario.
     */
    @Test
    public void testPedirPrestamo() {
        System.out.println("pedirPrestamo");
        Usuario instance = new Usuario();
        instance.pedirPrestamo();
    }

    /**
     * Test of login method, of class Usuario.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        Usuario instance = new Usuario();
        instance.login();
    }

    /**
     * Test of registatrarse method, of class Usuario.
     */
    @Test
    public void testRegistatrarse() {
        System.out.println("registatrarse");
        Usuario instance = new Usuario();
        instance.registatrarse();
    }
    
}
