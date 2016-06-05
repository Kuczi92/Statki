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
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0}
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // BEGIN MGawron
        /*System.out.println(Sprawdz(0, 0, 2, "Pionowo"));
        System.out.println(Sprawdz(0, 2, 2, "Pionowo"));
        System.out.println(Sprawdz(3, 3, 2, "Pionowo"));
        System.out.println(Sprawdz(4, 3, 2, "Pionowo"));
        System.out.println(Sprawdz(0, 0, 2, "Poziomo"));
        System.out.println(Sprawdz(3, 0, 2, "Poziomo"));
        System.out.println(Sprawdz(3, 3, 2, "Poziomo"));
        System.out.println(Sprawdz(3, 4, 2, "Poziomo"));*/
        // END
        Plansza Gracza_Komputera;
        Gracza_Komputera = new Plansza(10, 1, 2, 3, 4);
        Gracza_Komputera.Generuj_ustawienia_statków_na_planszy_losowo();
        Gracza_Komputera.WyswietlPlansze();
        System.out.println("Wygenerowano Plansze dla Komputera");
    }

}
