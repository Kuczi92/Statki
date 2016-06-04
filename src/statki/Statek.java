/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statki;

/**
 Wiadomo tu opisujemy statek jego właściowści itp
 */
public class Statek {
    int rozmiar;
    String ulozenie;
    public Statek (int rozmiar, boolean poziomo)
            
    {
    this.rozmiar=rozmiar;
    if(poziomo==true)
    this.ulozenie="Poziomo";
    else
        this.ulozenie="Pionowo";
    }
    
}
