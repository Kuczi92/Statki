/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;

/**
 *
 * @author Norbert
 */
public class KratkaTest extends TestCase {
    
    public KratkaTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of setStatek method, of class Kratka.
     */
    public void testSetStatek() {
        System.out.println("setStatek");
        boolean value = true;
        Kratka instance = new Kratka(true);
        instance.setStatek(value);
    }

    /**
     * Test of getStatek method, of class Kratka.
     */
    public void testGetStatek() {
        System.out.println("getStatek");
        Kratka instance = new Kratka(true);
        boolean expResult = true;
        boolean result = instance.getStatek();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOdwiedzona method, of class Kratka.
     */
    public void testSetOdwiedzona() {
        System.out.println("setOdwiedzona");
        boolean value = false;
        Kratka instance = new Kratka(false);
        instance.setOdwiedzona(value);
    }

    /**
     * Test of getOdwiedzona method, of class Kratka.
     */
    public void testGetOdwiedzona() {
        System.out.println("getOdwiedzona");
        Kratka instance = new Kratka(true);
        boolean expResult = false;
        boolean result = instance.getOdwiedzona();
        assertEquals(expResult, result);
        instance.setOdwiedzona(true);
        expResult = true;
        result = instance.getOdwiedzona();
        assertEquals(expResult, result);
    }
    
}
