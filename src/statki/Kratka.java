/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statki;

/**
 ta klasa zawiera w sobie dane dotyczące obiektu kratki która jest  zajęta przez statek bądź nie
 */
public class Kratka {
    boolean pusta = false;
    
    public void setKratka(boolean w)
    {
        this.pusta=w;
    }
    
    public boolean getKratka()
    {
        return this.pusta;
    }
}
