/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statki;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Norbert
 */
public class Statki
{
    // BEGIN MGawron
    /**
     * testowa plansza i funcja spradzajaca, czy statek moze byc ustawiony o
     * podanej pozycji
     */
    public static int[][] tab =
    {
        {0, 0, 0, 0, 0},
        {0, 1, 1, 1, 1},
        {0, 1, 0, 0, 0},
        {0, 1, 0, 0, 0},
        {0, 1, 0, 0, 0}
    };

    public static boolean Sprawdz(int x, int y, int roz, String uklad)
    {
        int mozna = 1;
        if ("Pionowo".equals(uklad))
        {
            for (int i = y - 1; i < y + roz + 2; i++)
            {
                if (i < 0)
                {
                    continue;
                }
                if (i > 4)
                {
                    continue;
                }
                for (int j = x - 1; j < x + 2; j++)
                {
                    if (j < 0)
                    {
                        continue;
                    }
                    if (j > 4)
                    {
                        continue;
                    }
                    if (tab[i][j] == 0)
                    {
                        mozna *= 1;
                    }
                    else
                    {
                        mozna *= 0;
                    }
                    System.out.print(tab[i][j]);
                }
                System.out.println();
            }
        }
        else
        {
            for (int i = y - 1; i < y + 2; i++)
            {
                if (i < 0)
                {
                    continue;
                }
                if (i > 4)
                {
                    continue;
                }
                for (int j = x - 1; j < x + roz + 2; j++)
                {
                    if (j < 0)
                    {
                        continue;
                    }
                    if (j > 4)
                    {
                        continue;
                    }
                    if (tab[i][j] == 0)
                    {
                        mozna *= 1;
                    }
                    else
                    {
                        mozna *= 0;
                    }
                    System.out.print(tab[i][j]);
                }
                System.out.println();
            }
        }

        return (mozna == 1);
    }
    // END
    
    public static String WczytajPozycje()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj pozycje gdzie strzelic: ");
        String pozycja = scan.nextLine();
        return pozycja;
    }

    public static String StrzalKomputera(int rozmiar)
    {
        Random r = new Random();
        int x = r.nextInt(rozmiar);
        int y = r.nextInt(rozmiar);
        String pozycja = Integer.toString(x) + Integer.toString(y);
        return pozycja;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // BEGIN MGawron
        //System.out.println(Sprawdz(0, 0, 2, "Pionowo"));
        /*System.out.println(Sprawdz(0, 2, 2, "Pionowo"));
        System.out.println(Sprawdz(3, 3, 2, "Pionowo"));
        System.out.println(Sprawdz(4, 3, 2, "Pionowo"));
        System.out.println(Sprawdz(0, 0, 2, "Poziomo"));
        System.out.println(Sprawdz(3, 0, 2, "Poziomo"));
        System.out.println(Sprawdz(3, 3, 2, "Poziomo"));
        System.out.println(Sprawdz(3, 4, 2, "Poziomo"));*/
        // END
        Plansza Komputer;
        Plansza Gracz;
        Komputer = new Plansza(10, 1, 2, 3, 4);
        Gracz = new Plansza(10, 1, 2, 3, 4);
        Komputer.Generuj_ustawienia_statków_na_planszy_losowo();
        Gracz.Generuj_ustawienia_statków_na_planszy_losowo();
        System.out.println("Wygenerowano Plansze dla Gracza i Komputera");
        //Komputer.WczytajPlanszeZPliku("testowa.txt");
        while(true)
        {
            Komputer.WyswietlPlanszeKomputera();
            Gracz.WyswietlPlanszeGracza();
            Komputer.DekodujPozycje(WczytajPozycje());
            Gracz.DekodujPozycje(StrzalKomputera(10));
        }
    }

}
