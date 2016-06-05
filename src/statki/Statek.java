/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statki;

/**
 Wiadomo tu opisujemy statek jego właściowści itp
 */
public class Statek
{
    private int rozmiar;
    private boolean zatopiony;
    private int trafiony;
    private String ulozenie;
    
    public  Statek (int rozmiar, boolean poziomo)      
    {
        this.rozmiar = rozmiar;
        this.zatopiony = false;
        this.trafiony = 0;
        
        if(poziomo == true)
            this.ulozenie = "Poziomo";
        else
            this.ulozenie = "Pionowo";
    }

    public int pobierzRozmiar()
    {
        return this.rozmiar;
    }
    
    public String pobierzUlozenie()
    {
        return this.ulozenie;
    }
    
    public void SetZatopiony(boolean value)
    {
        this.zatopiony = value;
    }
    
    public boolean GetZatopiony()
    {
        return this.zatopiony;
    }
    
    public void SetTrafiony()
    {
        this.trafiony++;
    }
    
    public int GetTrafiony()
    {
        return this.trafiony;
    }
}
