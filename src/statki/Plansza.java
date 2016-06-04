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
                      
                      int pobierany_statek=0;
                      
                      Random r = new Random();
                         for(int i= 0;i<liczba1_masztowców;i++)
                         {
                          Okret[pobierany_statek].Parametry_Statku(1, r.nextBoolean());
                          pobierany_statek++;
                         }
                      
                          for(int i= 0;i<liczba2_masztowców;i++)
                         {
                          Okret[pobierany_statek].Parametry_Statku(2, r.nextBoolean());
                          pobierany_statek++;
                         }
                       
                         for(int i= 0;i<liczba3_masztowców;i++)
                         {
                          Okret[pobierany_statek].Parametry_Statku(3, r.nextBoolean());
                          pobierany_statek++;
                         }
                        
                        
                         for(int i= 0;i<liczba4_masztowców;i++)
                         {
                          Okret[pobierany_statek].Parametry_Statku(4, r.nextBoolean());
                          pobierany_statek++;
                         }

            } 
  
  public void Generuj_ustawienia_statków_na_planszy_losowo()
            {
                
                 Random r = new Random();
                
                 
                 
                 
                 
                // komputer losowo dodaje 1 masztowce 
                for(int i = 0; i<liczbaStatkow;i++ )
                { 
                    
                    
                  switch (Okret[i].pobierzRozmiar())
                  {
                      case 1:
                        int x,y;
                        boolean nieumieszczonyStatek=true;
                        while(nieumieszczonyStatek)
                        {
                                    x=r.nextInt(rozmiar);
                                    y=r.nextInt(rozmiar);
                                            if(!Pole[x][y].getKratka())
                                                    {    
                                                        Pole[x][y].setKratka(true);
                                                        nieumieszczonyStatek=false;
                                                    }
                        }
                       break;
                       
                       case 2:
                        
                        nieumieszczonyStatek=true;
                        
                        while(nieumieszczonyStatek)
                        {
                                  
                                       
                                    x=r.nextInt(rozmiar-1);
                                    y=r.nextInt(rozmiar-1);
                                    if("Poziomo".equals(Okret[i].pobierzUlozenie())){
                                            if(!(Pole[x][y].getKratka() && Pole[x+1][y].getKratka() ))
                                                    {   
                                                        
                                                        Pole[x][y].setKratka(true);
                                                        Pole[x+1][y].setKratka(true);
                                                        nieumieszczonyStatek=false;
                                                    }
                                            }
                                    
                                    
                                    else if("Pionowo".equals(Okret[i].pobierzUlozenie())){
                                            if(!Pole[x][y+1].getKratka())
                                                    {   
                                                        
                                                        Pole[x][y].setKratka(true);
                                                        Pole[x][y+1].setKratka(true);
                                                        nieumieszczonyStatek=false;
                                                    }
                                            }
                                    
                                    
                        }
                       break;
                      
                      
                  
                  
                  }
                  
                 
                }
            }
}
