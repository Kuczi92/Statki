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
public class Plansza {
  Kratka[][] Pole;
  Statek[] Okret;
  
  int liczba4_masztowców;
  int liczba3_masztowców;
  int liczba2_masztowców;
  int liczba1_masztowców;
  
  
  public Plansza(int rozmiar,int liczba4_masztowców,int liczba3_masztowców,int liczba2_masztowców,int liczba1_masztowców )
  {
      
            this.liczba1_masztowców=liczba1_masztowców;
            this.liczba2_masztowców=liczba2_masztowców;
            this.liczba3_masztowców=liczba3_masztowców;
            this.liczba4_masztowców=liczba4_masztowców;
            
            int liczbaStatkow = liczba4_masztowców+liczba3_masztowców+liczba2_masztowców+liczba1_masztowców;
  
            this.Pole = new Kratka[rozmiar][rozmiar];
            this.Okret = new Statek[liczbaStatkow];
    
  } 
  
 public void Generuj_ustawienia_statków_na_planszy(){
     
 }
}
