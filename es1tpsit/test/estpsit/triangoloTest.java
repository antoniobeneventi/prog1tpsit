/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estpsit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class triangoloTest {
    
    public triangoloTest() {
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
     * Test of identificazionetriangolo method, of class triangolo.
     */
    @Test
    public void testIdentificazionetriangolo() {
        System.out.println("identificazionetriangolo");
        triangolo instance = new triangolo(1.0,1.0,1.0);;
        String expResult = "equilatero";
        String result = instance.identificazionetriangolo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of calcoloperimetro method, of class triangolo.
     */
    @Test
    public void testCalcoloperimetro() {
        System.out.println("calcoloperimetro");
        triangolo instance = new triangolo(1.0,1.0,1.0);
        double expResult = 3.0;
        double result = instance.calcoloperimetro();
        assertEquals(expResult, result, 3.0);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of calcoloarea method, of class triangolo.
     */
    @Test
    public void testCalcoloarea() {
        System.out.println("calcoloarea");
        triangolo instance = new triangolo(1.0,1.0,1.0);
        double expResult = 0.433;
        double result = instance.calcoloarea();
        assertEquals(expResult, result, 0.433);
        // TODO review the generated test code and remove the default call to fail.
     
    }
    
    
    
}
