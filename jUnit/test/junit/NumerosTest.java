/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juan
 */
public class NumerosTest {
    
    private Numeros n;
    
    public NumerosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        n = new Numeros();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of numeroPar method, of class Numeros.
     */
    @Test
    public void testNumeroPar() {
        /*System.out.println("numeroPar");
        int n = 2;
        Numeros instance = new Numeros();
        Boolean expResult = null;
        Boolean result = instance.numeroPar(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
        assertEquals(true, n.numeroPar(8));
    }

    /**
     * Test of areaCuadrado method, of class Numeros.
     */
    @Test
    public void testAreaCuadrado() {
        System.out.println("areaCuadrado");
        int lado = 0;
        Numeros instance = new Numeros();
        int expResult = 0;
        int result = instance.areaCuadrado(lado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numeroDiv method, of class Numeros.
     */
    @Test
    public void testNumeroDiv() {
        System.out.println("numeroDiv");
        int dividendo = 2;
        int divisor = 2;
        Numeros instance = new Numeros();
        Boolean expResult = null;
        Boolean result = instance.numeroDiv(dividendo, divisor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
