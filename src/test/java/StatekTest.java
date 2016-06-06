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
public class StatekTest extends TestCase {
    
    public StatekTest(String testName) {
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
     * Test of pobierzRozmiar method, of class Statek.
     */
    public void testPobierzRozmiar() {
        System.out.println("pobierzRozmiar");
        Statek instance = new Statek(10,true);
        int expResult = 10;
        int result = instance.pobierzRozmiar();
        assertEquals(expResult, result);
    }

    /**
     * Test of pobierzUlozenie method, of class Statek.
     */
    public void testPobierzUlozenie() {
        System.out.println("pobierzUlozenie");
        Statek instance = new Statek(10,true);
        String expResult = "Poziomo";
        String result = instance.pobierzUlozenie();
        assertEquals(expResult, result);
    }

    /**
     * Test of SetZatopiony method, of class Statek.
     */
    public void testSetZatopiony() {
        System.out.println("SetZatopiony");
        boolean value = false;
        Statek instance = new Statek(10,true);;
        instance.SetZatopiony(value);
    }

    /**
     * Test of GetZatopiony method, of class Statek.
     */
    public void testGetZatopiony() {
        System.out.println("GetZatopiony");
        Statek instance = new Statek(10,true);
        boolean expResult = false;
        boolean result = instance.GetZatopiony();
        assertEquals(expResult, result);
    }

    /**
     * Test of SetTrafiony method, of class Statek.
     */
    public void testSetTrafiony() {
        System.out.println("SetTrafiony");
        Statek instance = new Statek(10,true);;
        instance.SetTrafiony();
    }

    /**
     * Test of GetTrafiony method, of class Statek.
     */
    public void testGetTrafiony() {
        System.out.println("GetTrafiony");
        Statek instance = new Statek(10,true);
        int expResult = 0;
        int result = instance.GetTrafiony();
        assertEquals(expResult, result);
    }

    /**
     * Test of SprawdzCzyZatopiony method, of class Statek.
     */
    public void testSprawdzCzyZatopiony() {
        System.out.println("SprawdzCzyZatopiony");
        Statek instance = new Statek(10,true);
        boolean expResult = false;
        boolean result = instance.SprawdzCzyZatopiony();
        assertEquals(expResult, result);
    }
    
}
