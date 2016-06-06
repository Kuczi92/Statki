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
        Plansza instance =new Plansza(10,1,1,1,1);
        instance.Generuj_ustawienia_statków_na_planszy_losowo();
        boolean expResoult = instance.pobierzPozycjeNaPlanszy(x, y);
        instance.Dokonaj_strzalu(x, y);
        assertEquals(expResoult, false);
    }

    /**
     * Test of Ustaw_statki method, of class Plansza.
     */
    /*
    public void testUstaw_statki() {
        System.out.println("Ustaw_statki");
        Plansza instance = new Plansza(10,1,1,1,1);
        instance.Ustaw_statki();
    }

    /**
     * Test of Generuj_ustawienia_statków_na_planszy_losowo method, of class Plansza.
     */
    public void testGeneruj_ustawienia_statków_na_planszy_losowo() {
        System.out.println("Generuj_ustawienia_statk\u00f3w_na_planszy_losowo");
        Plansza instance = new Plansza(10,1,1,1,1);
        instance.Generuj_ustawienia_statków_na_planszy_losowo();
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
        Plansza instance = new Plansza(10,1,1,1,1);
        boolean expResult = false;
        boolean result = instance.SprawdzMasztowiec(x, y, roz, uklad);
        assertEquals(expResult, result);
    }

    /**
     * Test of WyswietlPlanszeKomputera method, of class Plansza.
     */
    public void testWyswietlPlanszeKomputera() {
        System.out.println("WyswietlPlanszeKomputera");
        Plansza instance = new Plansza(10,1,1,1,1);
        instance.WyswietlPlanszeKomputera();
    }

    /**
     * Test of WyswietlPlanszeGracza method, of class Plansza.
     */
    public void testWyswietlPlanszeGracza() {
        System.out.println("WyswietlPlanszeGracza");
        Plansza instance = new Plansza(10,1,1,1,1);
        instance.WyswietlPlanszeGracza();
    }

    /**
     * Test of WczytajPlanszeZPliku method, of class Plansza.
     */
    public void testWczytajPlanszeZPliku() {
        System.out.println("WczytajPlanszeZPliku");
        String nazwa = "";
        Plansza instance = new Plansza(10,1,1,1,1);
        boolean expResult = false;
        boolean result = instance.WczytajPlanszeZPliku(nazwa);
        assertEquals(expResult, result);
    }

    /**
     * Test of DekodujStatki method, of class Plansza.
     */
    public void testDekodujStatki() {
        System.out.println("DekodujStatki");
        String[] wiersze = null;
        Plansza instance = new Plansza(10,1,1,1,1);
        boolean expResult = false;
        boolean result = instance.DekodujStatki(wiersze);
        assertEquals(expResult, result);
    }

    /**
     * Test of DekodujLiczbeStatkow method, of class Plansza.
     */
    public void testDekodujLiczbeStatkow() {
        System.out.println("DekodujLiczbeStatkow");
        String wiersz = "";
        Plansza instance = new Plansza(10,1,1,1,1);
        boolean expResult = false;
        boolean result = instance.DekodujLiczbeStatkow(wiersz);
        assertEquals(expResult, result);
    }

    /**
     * Test of DekodujPozycje method, of class Plansza.
     */
    public void testDekodujPozycje() {
        System.out.println("DekodujPozycje");
        String pozycja = "";
        Plansza instance = new Plansza(10,1,1,1,1);
        instance.DekodujPozycje(pozycja);
    }
    
}
