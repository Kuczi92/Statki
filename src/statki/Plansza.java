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
  
  
  public Plansza(int rozmiar, int liczba_statkow){
    this.Pole = new Kratka[rozmiar][rozmiar];
    this.Okret = new Statek[liczba_statkow];
  }  
}
