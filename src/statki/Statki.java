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
       Plansza PL;
       PL= new Plansza(10,1,2,3,4);
       PL.Generuj_ustawienia_statków_na_planszy_losowo();
       PL.WyswietlPlansze();
    }
    
}
