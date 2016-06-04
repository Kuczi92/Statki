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
  
  
  
  public Plansza(int rozmiar){
   this.Pole = new Kratka[rozmiar][rozmiar];
                      
                      for(int i=0;i<rozmiar;i++){
                          for(int j=0;j<rozmiar;j++){
                            Pole[i][j]=new Kratka(false);  
                          }
                      }   
  }
  
  
  
  public void Dokonaj_strzalu(int x,int y)
  {
      if(Pole[x][y].getKratka())
      {
          System.out.println("Brawo trafiłeś");
          Pole[x][y].setKratka(false);
      }
      else
      {
          System.out.println("Pudło");
      }
  }
  public Plansza(int rozmiar,int liczba4_masztowców,int liczba3_masztowców,int liczba2_masztowców,int liczba1_masztowców )
            {
                      this.rozmiar=rozmiar;
                      this.liczba1_masztowców=liczba1_masztowców;
                      this.liczba2_masztowców=liczba2_masztowców;
                      this.liczba3_masztowców=liczba3_masztowców;
                      this.liczba4_masztowców=liczba4_masztowców;

                      this.liczbaStatkow = liczba4_masztowców+liczba3_masztowców+liczba2_masztowców+liczba1_masztowców;

                      this.Pole = new Kratka[rozmiar][rozmiar];
                      
                      for(int i=0;i<rozmiar;i++){
                          for(int j=0;j<rozmiar;j++){
                            Pole[i][j]=new Kratka(false);  
                          }
                      }
                      this.Okret = new Statek[liczbaStatkow];
                      
                         

            } 
  
  public void Generuj_ustawienia_statków_na_planszy_losowo()
            {
                
                
                        //Fragment kodu opdowiedzialny za inicjacje statkow oraz losowe ustanienie pionu poziomu
                         int pobierany_statek=0;
                         Random r = new Random();
                         for(int i= 0;i<liczba1_masztowców;i++)
                         {
                          Okret[pobierany_statek] = new Statek(1, r.nextBoolean());
                          pobierany_statek++;
                         }
                      
                          for(int i= 0;i<liczba2_masztowców;i++)
                         {
                          Okret[pobierany_statek]= new Statek(2, r.nextBoolean());
                          pobierany_statek++;
                         }
                       
                         for(int i= 0;i<liczba3_masztowców;i++)
                         {
                          Okret[pobierany_statek]= new Statek(3, r.nextBoolean());
                          pobierany_statek++;
                         }
                        
                        
                         for(int i= 0;i<liczba4_masztowców;i++)
                         {
                          Okret[pobierany_statek]= new Statek(4, r.nextBoolean());
                          pobierany_statek++;
                         }
               
                         
                   //częśc kodu odpowiedzialna za dodanie losowe statkow na planszy      
                for(int i = 0; i<liczbaStatkow;i++ )
                { 
                    
                    
                  switch (Okret[i].pobierzRozmiar())
                  {   
                      
                      // komputer losowo dodaje 1 masztowce na plansze  pobiera rozmiar i na podstawie ulozenia dodaje na planszy
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
                       
                       
                        // komputer losowo dodaje 2 masztowce na plansze  pobiera rozmiar i na podstawie ulozenia dodaje na planszy
                       case 2:
                       nieumieszczonyStatek=true;
                       while(nieumieszczonyStatek)
                        {
                                  
                                       
                                    x=r.nextInt(rozmiar-1);
                                    y=r.nextInt(rozmiar-1);
                                    if("Poziomo".equals(Okret[i].pobierzUlozenie())){
                                            if(!(Pole[x][y].getKratka() || Pole[x+1][y].getKratka() ))
                                                    {   
                                                        
                                                        Pole[x][y].setKratka(true);
                                                        Pole[x+1][y].setKratka(true);
                                                        nieumieszczonyStatek=false;
                                                    }
                                            }
                                    
                                    
                                    else if("Pionowo".equals(Okret[i].pobierzUlozenie())){
                                            if(!(Pole[x][y].getKratka() || Pole[x][y+1].getKratka() ))
                                                    {   
                                                        
                                                        Pole[x][y].setKratka(true);
                                                        Pole[x][y+1].setKratka(true);
                                                        nieumieszczonyStatek=false;
                                                    }
                                            }
                                    
                                    
                        }
                       break;
                       
                       // komputer losowo dodaje 3 masztowce na plansze  pobiera rozmiar i na podstawie ulozenia dodaje na planszy
                       case 3:
                        
                       nieumieszczonyStatek=true;
                       while(nieumieszczonyStatek)
                        {
                                  
                                       
                                    x=r.nextInt(rozmiar-2);
                                    y=r.nextInt(rozmiar-2);
                                    if("Poziomo".equals(Okret[i].pobierzUlozenie())){
                                            if(!(Pole[x][y].getKratka() || Pole[x+1][y].getKratka() || Pole[x+2][y].getKratka() ))
                                                    {   
                                                        
                                                        Pole[x][y].setKratka(true);
                                                        Pole[x+1][y].setKratka(true);
                                                        Pole[x+2][y].setKratka(true);
                                                        nieumieszczonyStatek=false;
                                                    }
                                            }
                                    
                                    
                                    else if("Pionowo".equals(Okret[i].pobierzUlozenie())){
                                            if(!(Pole[x][y].getKratka() || Pole[x][y+1].getKratka() || Pole[x][y+2].getKratka() ))
                                                    {   
                                                        
                                                        Pole[x][y].setKratka(true);
                                                        Pole[x][y+1].setKratka(true);
                                                        Pole[x][y+2].setKratka(true);
                                                        nieumieszczonyStatek=false;
                                                    }
                                            }
                                    
                                    
                        }
                       break;
                       
                       
                       // komputer losowo dodaje 4 masztowce na plansze  pobiera rozmiar i na podstawie ulozenia dodaje na planszy
                       case 4:
                       nieumieszczonyStatek=true;
                       while(nieumieszczonyStatek)
                        {
                                  
                                       
                                    x=r.nextInt(rozmiar-3);
                                    y=r.nextInt(rozmiar-3);
                                    if("Poziomo".equals(Okret[i].pobierzUlozenie())){
                                            if(!(Pole[x][y].getKratka() || Pole[x+1][y].getKratka() || Pole[x+2][y].getKratka() || Pole[x+3][y].getKratka() ))
                                                    {   
                                                        
                                                        Pole[x][y].setKratka(true);
                                                        Pole[x+1][y].setKratka(true);
                                                        Pole[x+2][y].setKratka(true);
                                                        Pole[x+3][y].setKratka(true);
                                                        nieumieszczonyStatek=false;
                                                    }
                                            }
                                    
                                    
                                    else if("Pionowo".equals(Okret[i].pobierzUlozenie())){
                                            if(!(Pole[x][y].getKratka() || Pole[x][y+1].getKratka() || Pole[x][y+2].getKratka() ))
                                                    {   
                                                        
                                                        Pole[x][y].setKratka(true);
                                                        Pole[x][y+1].setKratka(true);
                                                        Pole[x][y+2].setKratka(true);
                                                        Pole[x][y+3].setKratka(true);
                                                        nieumieszczonyStatek=false;
                                                    }
                                            }
                                    
                                    
                        }
                       break;
                      
                      
                  
                  
                  }
                  
                 
                }
            }
  
  
  public void WyswietlPlansze(){
     System.out.print("  ");
      for(int i=0;i<rozmiar;i++){
          System.out.print(i+1);
      }
      System.out.println();
      for(int i=0;i<rozmiar;i++){
          System.out.print(i+1+" ");
          for(int j=0;j<rozmiar;j++)
          {
             if(Pole[i][j].getKratka()) 
                 System.out.print("X");
             else
                 System.out.print(" ");
          }
          System.out.println("|");
      }
       System.out.print("  ");
      for(int i = 0 ;i<rozmiar;i++){
          System.out.print("-");
          
      }
     System.out.println();
  }
}
