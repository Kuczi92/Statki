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
public class PlanszaTest extends TestCase {
    
    public PlanszaTest(String testName) {
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
     * Test of Dokonaj_strzalu method, of class Plansza.
     */
    public void testDokonaj_strzalu() {
        System.out.println("Dokonaj_strzalu");
        int x = 0;
        int y = 0;
        Plansza instance = null;
        instance.Dokonaj_strzalu(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Ustaw_statki method, of class Plansza.
     */
    public void testUstaw_statki() {
        System.out.println("Ustaw_statki");
        Plansza instance = null;
        instance.Ustaw_statki();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Generuj_ustawienia_statków_na_planszy_losowo method, of class Plansza.
     */
    public void testGeneruj_ustawienia_statków_na_planszy_losowo() {
        System.out.println("Generuj_ustawienia_statk\u00f3w_na_planszy_losowo");
        Plansza instance = null;
        instance.Generuj_ustawienia_statków_na_planszy_losowo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SprawdzMasztowiec method, of class Plansza.
     */
    public void testSprawdzMasztowiec() {
        System.out.println("SprawdzMasztowiec");
        int x = 0;
        int y = 0;
        int roz = 0;
        String uklad = "";
        Plansza instance = null;
        boolean expResult = false;
        boolean result = instance.SprawdzMasztowiec(x, y, roz, uklad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of WyswietlPlanszeKomputera method, of class Plansza.
     */
    public void testWyswietlPlanszeKomputera() {
        System.out.println("WyswietlPlanszeKomputera");
        Plansza instance = null;
        instance.WyswietlPlanszeKomputera();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of WyswietlPlanszeGracza method, of class Plansza.
     */
    public void testWyswietlPlanszeGracza() {
        System.out.println("WyswietlPlanszeGracza");
        Plansza instance = null;
        instance.WyswietlPlanszeGracza();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of WczytajPlanszeZPliku method, of class Plansza.
     */
    public void testWczytajPlanszeZPliku() {
        System.out.println("WczytajPlanszeZPliku");
        String nazwa = "";
        Plansza instance = null;
        boolean expResult = false;
        boolean result = instance.WczytajPlanszeZPliku(nazwa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DekodujStatki method, of class Plansza.
     */
    public void testDekodujStatki() {
        System.out.println("DekodujStatki");
        String[] wiersze = null;
        Plansza instance = null;
        boolean expResult = false;
        boolean result = instance.DekodujStatki(wiersze);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DekodujLiczbeStatkow method, of class Plansza.
     */
    public void testDekodujLiczbeStatkow() {
        System.out.println("DekodujLiczbeStatkow");
        String wiersz = "";
        Plansza instance = null;
        boolean expResult = false;
        boolean result = instance.DekodujLiczbeStatkow(wiersz);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DekodujPozycje method, of class Plansza.
     */
    public void testDekodujPozycje() {
        System.out.println("DekodujPozycje");
        String pozycja = "";
        Plansza instance = null;
        instance.DekodujPozycje(pozycja);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
