/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statki;

/**
 *
 * @author Norbert
 */
public class Statki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Plansza Gracza_Komputera;
       Gracza_Komputera= new Plansza(10,1,2,3,4);
       Gracza_Komputera.Generuj_ustawienia_statków_na_planszy_losowo();
       Gracza_Komputera.WyswietlPlansze();
       System.out.println("Wygenerowano Plansze dla Komputera");
    }
    
}
