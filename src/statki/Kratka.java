/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statki;

/**
 ta klasa zawiera w sobie dane dotyczące obiektu kratki która jest  zajęta przez statek bądź nie
 */
public class Kratka
{
    private boolean statek;
    private boolean odwiedzona;
    
    public Kratka(boolean w)
    {
        this.statek = w;
        this.odwiedzona = false;
    }
    
    
    public void setKratka(boolean w)
    {
        this.statek = w;
    }
    
    public boolean getKratka()
    {
        return this.statek;
    }
    
    public void setOdwiedzona(boolean w)
    {
        this.odwiedzona = true;
    }
    
    public boolean getOdwiedzona()
    {
        return this.odwiedzona;
    }
}
