/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statki;

import java.util.Random;

/**
 *
 * @author Norbert
 */
public class Plansza {
  Kratka[][] Pole;
  Statek[] Okret;
  
  int liczba4_masztowców;
  int liczba3_masztowców;
  int liczba2_masztowców;
  int liczba1_masztowców;
  int liczbaStatkow;
  int rozmiar;
  public Plansza(int rozmiar,int liczba4_masztowców,int liczba3_masztowców,int liczba2_masztowców,int liczba1_masztowców )
            {
                      this.rozmiar=rozmiar;
                      this.liczba1_masztowców=liczba1_masztowców;
                      this.liczba2_masztowców=liczba2_masztowców;
                      this.liczba3_masztowców=liczba3_masztowców;
                      this.liczba4_masztowców=liczba4_masztowców;

                      this.liczbaStatkow = liczba4_masztowców+liczba3_masztowców+liczba2_masztowców+liczba1_masztowców;

                      this.Pole = new Kratka[rozmiar][rozmiar];
                      this.Okret = new Statek[liczbaStatkow];

            } 
  
  public void Generuj_ustawienia_statków_na_planszy_losowo()
            {
                
                 Random r = new Random();
                
                // komputer losowo dodaje 1 masztowce 
                for(int i = 0; i<liczba1_masztowców;i++ )
                { 
                  Pole[r.nextInt(rozmiar)][r.nextInt(rozmiar)].setKratka(true);
                 
                }
                
                // komputer losowo dodaje 2 masztowce
                for(int i = 0; i<liczba2_masztowców;i++ )
                {  
                   r.nextInt(rozmiar);
                   
                }
                
                // komputer losowo dodaje 3 masztowce
                for(int i = 0; i<liczba3_masztowców;i++ )
                {  
                    r.nextInt(rozmiar);
                }
                
                // komputer losowo dodaje 4 masztowce
                for(int i = 0; i<liczba4_masztowców;i++ )
                { 
                      r.nextInt(rozmiar);
                }
                
            }
}
