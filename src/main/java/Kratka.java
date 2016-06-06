/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * ta klasa zawiera w sobie dane dotyczące obiektu kratki która jest zajęta
 * przez statek bądź nie
 */
public class Kratka
{

    private boolean statek;
    private boolean odwiedzona;

    public Kratka(boolean value)
    {
        this.statek = value;
        this.odwiedzona = false;
    }

    public void setStatek(boolean value)
    {
        this.statek = value;
    }

    public boolean getStatek()
    {
        return this.statek;
    }

    public void setOdwiedzona(boolean value)
    {
        this.odwiedzona = value;
    }

    public boolean getOdwiedzona()
    {
        return this.odwiedzona;
    }
}
