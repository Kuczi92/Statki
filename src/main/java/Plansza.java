/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Norbert
 */
public class Plansza
{

    private Kratka[][] Pole;
    private Statek[] Okret;

    
    
    private int liczba4_masztowców;
    private int liczba3_masztowców;
    private int liczba2_masztowców;
    private int liczba1_masztowców;
    private int liczbaStatkow;
    private int rozmiar;

    // przeciążony konstruktor dla Plnaszy gdzie gracz dokonuje strzał a te strzały są zaznaczane
    public Plansza(int rozmiar)
    {
        this.Pole = new Kratka[rozmiar][rozmiar];
        for (int i = 0; i < rozmiar; i++)
        {
            for (int j = 0; j < rozmiar; j++)
            {
                Pole[i][j] = new Kratka(false);
            }
        }
    }

    public Plansza(int rozmiar, int liczba4_masztowców, int liczba3_masztowców, int liczba2_masztowców, int liczba1_masztowców)
    {
        this.rozmiar = rozmiar;
        this.liczba1_masztowców = liczba1_masztowców;
        this.liczba2_masztowców = liczba2_masztowców;
        this.liczba3_masztowców = liczba3_masztowców;
        this.liczba4_masztowców = liczba4_masztowców;

        this.liczbaStatkow = liczba4_masztowców + liczba3_masztowców + liczba2_masztowców + liczba1_masztowców;

        this.Pole = new Kratka[rozmiar][rozmiar];

        for (int i = 0; i < rozmiar; i++)
        {
            for (int j = 0; j < rozmiar; j++)
            {
                Pole[i][j] = new Kratka(false);
            }
        }
        this.Okret = new Statek[liczbaStatkow];
    }

    public void Dokonaj_strzalu(int x, int y)
    {
        if (!Pole[x][y].getOdwiedzona())
        {
            if (Pole[x][y].getStatek())
            {
                System.out.println("Brawo trafiłeś");
                // tutaj nie powinnismy resetowac statku
                //Pole[x][y].setStatek(false);
            }
            else
            {
                System.out.println("Pudło");
            }
            // BEGIN MGawron
            Pole[x][y].setOdwiedzona(true);
            // END
        }
        else
        {
            System.out.println("Juz tu strzelales");
        }
    }

    @SuppressWarnings("UnusedAssignment")
    public void Ustaw_statki()
    {
       
        Scanner scan = new Scanner(System.in);
        

            System.out.println("Podaj liczbę jednomasztowców");
            this.liczba1_masztowców = Integer.parseInt(scan.nextLine());
            System.out.println("Podaj liczbę dwumasztowców");
            this.liczba2_masztowców = Integer.parseInt(scan.nextLine());
            System.out.println("Podaj liczbę trójmasztowców");
            this.liczba3_masztowców = Integer.parseInt(scan.nextLine());
            System.out.println("Podaj liczbę Czteromasztowców");
            this.liczba4_masztowców = Integer.parseInt(scan.nextLine());
        
        int pobierany_statek = 0;
        int x, y;

        System.out.println("Wpisz położenie Czteromasztowców ");
        for (int i = 0; i < liczba4_masztowców; i++)
        {

            System.out.println("Wpisz x");
            x = scan.nextInt();
            System.out.println("Wpisz y");
            y = scan.nextInt();
            System.out.println("Wybierz pion(wciśnij 1) albo poziom(wciśnij 2)");
            if (scan.nextInt() == 1)
            {
                Okret[pobierany_statek] = new Statek(4, false);
            }
            if (scan.nextInt() == 2)
            {
                Okret[pobierany_statek] = new Statek(4, true);
            }

            pobierany_statek++;
            boolean nieumieszczonyStatek = true;
            while (nieumieszczonyStatek)
            {
                if ("Poziomo".equals(Okret[pobierany_statek].pobierzUlozenie()))
                {
                    if (!(Pole[x][y].getStatek() || Pole[x + 1][y].getStatek() || Pole[x + 2][y].getStatek() || Pole[x + 3][y].getStatek()))
                    {

                        Pole[x][y].setStatek(true);
                        Pole[x + 1][y].setStatek(true);
                        Pole[x + 2][y].setStatek(true);
                        Pole[x + 3][y].setStatek(true);
                        nieumieszczonyStatek = false;
                    }
                }
                else if ("Pionowo".equals(Okret[pobierany_statek].pobierzUlozenie()))
                {
                    if (!(Pole[x][y].getStatek() || Pole[x][y + 1].getStatek() || Pole[x][y + 2].getStatek() || Pole[x][y + 3].getStatek()))
                    {

                        Pole[x][y].setStatek(true);
                        Pole[x][y + 1].setStatek(true);
                        Pole[x][y + 2].setStatek(true);
                        Pole[x][y + 3].setStatek(true);
                        nieumieszczonyStatek = false;
                    }
                }
            }
        }

        System.out.println("Wpisz położenie Trójmasztowców ");
        for (int i = 0; i < liczba3_masztowców; i++)
        {
            System.out.println("Wpisz x");
            x = scan.nextInt();
            System.out.println("Wpisz y");
            y = scan.nextInt();
            System.out.println("Wybierz pion(wciśnij 1) albo poziom(wciśnij 2)");
            if (scan.nextInt() == 1)
            {
                Okret[pobierany_statek] = new Statek(3, false);
            }
            if (scan.nextInt() == 2)
            {
                Okret[pobierany_statek] = new Statek(3, true);
            }

            pobierany_statek++;
            boolean nieumieszczonyStatek = true;
            while (nieumieszczonyStatek)
            {
                if ("Poziomo".equals(Okret[pobierany_statek].pobierzUlozenie()))
                {
                    if (!(Pole[x][y].getStatek() || Pole[x + 1][y].getStatek() || Pole[x + 2][y].getStatek()))
                    {

                        Pole[x][y].setStatek(true);
                        Pole[x + 1][y].setStatek(true);
                        Pole[x + 2][y].setStatek(true);
                        nieumieszczonyStatek = false;
                    }
                }
                else if ("Pionowo".equals(Okret[pobierany_statek].pobierzUlozenie()))
                {
                    if (!(Pole[x][y].getStatek() || Pole[x][y + 1].getStatek() || Pole[x][y + 2].getStatek()))
                    {

                        Pole[x][y].setStatek(true);
                        Pole[x][y + 1].setStatek(true);
                        Pole[x][y + 2].setStatek(true);
                        nieumieszczonyStatek = false;
                    }
                }
            }
        }

        System.out.println("Wpisz położenie Dwumasztowców ");
        for (int i = 0; i < liczba2_masztowców; i++)
        {
            System.out.println("Wpisz x");
            x = scan.nextInt();
            System.out.println("Wpisz y");
            y = scan.nextInt();
            System.out.println("Wybierz pion(wciśnij 1) albo poziom(wciśnij 2)");
            if (scan.nextInt() == 1)
            {
                Okret[pobierany_statek] = new Statek(2, false);
            }
            if (scan.nextInt() == 2)
            {
                Okret[pobierany_statek] = new Statek(2, true);
            }

            pobierany_statek++;
            boolean nieumieszczonyStatek = true;
            while (nieumieszczonyStatek)
            {
                if ("Poziomo".equals(Okret[pobierany_statek].pobierzUlozenie()))
                {
                    if (!(Pole[x][y].getStatek() || Pole[x + 1][y].getStatek()))
                    {

                        Pole[x][y].setStatek(true);
                        Pole[x + 1][y].setStatek(true);
                        nieumieszczonyStatek = false;
                    }
                }
                else if ("Pionowo".equals(Okret[pobierany_statek].pobierzUlozenie()))
                {
                    if (!(Pole[x][y].getStatek() || Pole[x][y + 1].getStatek()))
                    {

                        Pole[x][y].setStatek(true);
                        Pole[x][y + 1].setStatek(true);
                        nieumieszczonyStatek = false;
                    }
                }
            }
        }

        System.out.println("Wpisz położenie Jednomasztowców ");
        for (int i = 0; i < liczba1_masztowców; i++)
        {
            System.out.println("Wpisz x");
            x = scan.nextInt();
            System.out.println("Wpisz y");
            y = scan.nextInt();
            System.out.println("Wybierz pion(wciśnij 1) albo poziom(wciśnij 2)");
            if (scan.nextInt() == 1)
            {
                Okret[pobierany_statek] = new Statek(1, false);
            }
            if (scan.nextInt() == 2)
            {
                Okret[pobierany_statek] = new Statek(1, true);
            }

            pobierany_statek++;
            boolean nieumieszczonyStatek = true;
            while (nieumieszczonyStatek)
            {
                if (!Pole[x][y].getStatek())
                {
                    Pole[x][y].setStatek(true);
                    nieumieszczonyStatek = false;
                }
            }
        }
    }

    public void Generuj_ustawienia_statków_na_planszy_losowo()
    {
        //Fragment kodu opdowiedzialny za inicjacje statkow oraz losowe ustanienie pionu poziomu
        int pobierany_statek = 0;
        Random r = new Random();

        for (int i = 0; i < liczba4_masztowców; i++)
        {
            Okret[pobierany_statek] = new Statek(4, r.nextBoolean());
            pobierany_statek++;
        }

        for (int i = 0; i < liczba3_masztowców; i++)
        {
            Okret[pobierany_statek] = new Statek(3, r.nextBoolean());
            pobierany_statek++;
        }

        for (int i = 0; i < liczba2_masztowców; i++)
        {
            Okret[pobierany_statek] = new Statek(2, r.nextBoolean());
            pobierany_statek++;
        }

        for (int i = 0; i < liczba1_masztowców; i++)
        {
            Okret[pobierany_statek] = new Statek(1, r.nextBoolean());
            pobierany_statek++;
        }

        //częśc kodu odpowiedzialna za dodanie losowe statkow na planszy      
        for (int i = 0; i < liczbaStatkow; i++)
        {
            switch (Okret[i].pobierzRozmiar())
            {
                // komputer losowo dodaje 1 masztowce na plansze  pobiera rozmiar i na podstawie ulozenia dodaje na planszy
                case 1:
                    int x,
                     y;
                    boolean nieumieszczonyStatek = true;
                    while (nieumieszczonyStatek)
                    {
                        x = r.nextInt(rozmiar);
                        y = r.nextInt(rozmiar);

                        // BEGIN MGawron
                        // losuj az znajdzie dobre polozenie statku
                        while (!SprawdzMasztowiec(x, y, Okret[i].pobierzRozmiar(), Okret[i].pobierzUlozenie()))
                        {
                            x = r.nextInt(rozmiar - 3);
                            y = r.nextInt(rozmiar - 3);
                        }
                        // END

                        if (!Pole[x][y].getStatek())
                        {
                            Pole[x][y].setStatek(true);
                            nieumieszczonyStatek = false;
                        }
                    }
                    break;

                // komputer losowo dodaje 2 masztowce na plansze  pobiera rozmiar i na podstawie ulozenia dodaje na planszy
                case 2:
                    nieumieszczonyStatek = true;
                    while (nieumieszczonyStatek)
                    {
                        x = r.nextInt(rozmiar - 1);
                        y = r.nextInt(rozmiar - 1);

                        // BEGIN MGawron
                        // losuj az znajdzie dobre polozenie statku
                        while (!SprawdzMasztowiec(x, y, Okret[i].pobierzRozmiar(), Okret[i].pobierzUlozenie()))
                        {
                            x = r.nextInt(rozmiar - 1);
                            y = r.nextInt(rozmiar - 1);
                        }
                        // END

                        if ("Poziomo".equals(Okret[i].pobierzUlozenie()))
                        {
                            if (!(Pole[x][y].getStatek() || Pole[x + 1][y].getStatek()))
                            {
                                Pole[x][y].setStatek(true);
                                Pole[x + 1][y].setStatek(true);
                                nieumieszczonyStatek = false;
                            }
                        }

                        else if ("Pionowo".equals(Okret[i].pobierzUlozenie()))
                        {
                            if (!(Pole[x][y].getStatek() || Pole[x][y + 1].getStatek()))
                            {
                                Pole[x][y].setStatek(true);
                                Pole[x][y + 1].setStatek(true);
                                nieumieszczonyStatek = false;
                            }
                        }
                    }
                    break;

                // komputer losowo dodaje 3 masztowce na plansze  pobiera rozmiar i na podstawie ulozenia dodaje na planszy
                case 3:
                    nieumieszczonyStatek = true;
                    while (nieumieszczonyStatek)
                    {
                        x = r.nextInt(rozmiar - 2);
                        y = r.nextInt(rozmiar - 2);

                        // BEGIN MGawron
                        // losuj az znajdzie dobre polozenie statku
                        while (!SprawdzMasztowiec(x, y, Okret[i].pobierzRozmiar(), Okret[i].pobierzUlozenie()))
                        {
                            x = r.nextInt(rozmiar - 2);
                            y = r.nextInt(rozmiar - 2);
                        }
                        // END

                        if ("Poziomo".equals(Okret[i].pobierzUlozenie()))
                        {
                            if (!(Pole[x][y].getStatek() || Pole[x + 1][y].getStatek() || Pole[x + 2][y].getStatek()))
                            {
                                Pole[x][y].setStatek(true);
                                Pole[x + 1][y].setStatek(true);
                                Pole[x + 2][y].setStatek(true);
                                nieumieszczonyStatek = false;
                            }
                        }

                        else if ("Pionowo".equals(Okret[i].pobierzUlozenie()))
                        {
                            if (!(Pole[x][y].getStatek() || Pole[x][y + 1].getStatek() || Pole[x][y + 2].getStatek()))
                            {
                                Pole[x][y].setStatek(true);
                                Pole[x][y + 1].setStatek(true);
                                Pole[x][y + 2].setStatek(true);
                                nieumieszczonyStatek = false;
                            }
                        }

                    }
                    break;

                // komputer losowo dodaje 4 masztowce na plansze  pobiera rozmiar i na podstawie ulozenia dodaje na planszy
                case 4:
                    nieumieszczonyStatek = true;
                    while (nieumieszczonyStatek)
                    {
                        x = r.nextInt(rozmiar - 3);
                        y = r.nextInt(rozmiar - 3);

                        // BEGIN MGawron
                        // losuj az znajdzie dobre polozenie statku
                        while (!SprawdzMasztowiec(x, y, Okret[i].pobierzRozmiar(), Okret[i].pobierzUlozenie()))
                        {
                            x = r.nextInt(rozmiar - 3);
                            y = r.nextInt(rozmiar - 3);
                        }
                        // END

                        if ("Poziomo".equals(Okret[i].pobierzUlozenie()))
                        {
                            if (!(Pole[x][y].getStatek() || Pole[x + 1][y].getStatek() || Pole[x + 2][y].getStatek() || Pole[x + 3][y].getStatek()))
                            {
                                Pole[x][y].setStatek(true);
                                Pole[x + 1][y].setStatek(true);
                                Pole[x + 2][y].setStatek(true);
                                Pole[x + 3][y].setStatek(true);
                                nieumieszczonyStatek = false;
                            }
                        }

                        else if ("Pionowo".equals(Okret[i].pobierzUlozenie()))
                        {
                            if (!(Pole[x][y].getStatek() || Pole[x][y + 1].getStatek() || Pole[x][y + 2].getStatek()))
                            {
                                Pole[x][y].setStatek(true);
                                Pole[x][y + 1].setStatek(true);
                                Pole[x][y + 2].setStatek(true);
                                Pole[x][y + 3].setStatek(true);
                                nieumieszczonyStatek = false;
                            }
                        }
                    }
                    break;
            }
        }
    }

    // BEGIN MGawron
    public boolean SprawdzMasztowiec(int x, int y, int roz, String uklad)
    {
        /**
         * Trzeba dorobić przerywanie nieskończoenj petli jak brakuje miejsca
         * Jesli funckja jest wywolana 100 razy to zacznij od nowa losowanie czy
         * cos podobnego
         */
        //System.out.println(x + " " + y + " " + roz + " " + uklad);
        int mozna = 1;
        if ("Pionowo".equals(uklad))
        {
            for (int i = x - 1; i < x + 2; i++)
            {
                if (i < 0)
                {
                    continue;
                }
                if (i > this.rozmiar - 1)
                {
                    continue;
                }
                for (int j = y - 1; j < y + roz + 2; j++)
                {
                    if (j < 0)
                    {
                        continue;
                    }
                    if (j > this.rozmiar - 1)
                    {
                        continue;
                    }
                    if (Pole[i][j].getStatek() == false)
                    {
                        mozna *= 1;
                    }
                    else
                    {
                        mozna *= 0;
                    }
                }
            }
        }
        else
        {
            for (int i = x - 1; i < x + roz + 2; i++)
            {
                if (i < 0)
                {
                    continue;
                }
                if (i > this.rozmiar - 1)
                {
                    continue;
                }
                for (int j = y - 1; j < y + 2; j++)
                {
                    if (j < 0)
                    {
                        continue;
                    }
                    if (j > this.rozmiar - 1)
                    {
                        continue;
                    }
                    if (Pole[i][j].getStatek() == false)
                    {
                        mozna *= 1;
                    }
                    else
                    {
                        mozna *= 0;
                    }
                }
            }
        }

        return (mozna == 1);
    }
    // END

    public void WyswietlPlanszeKomputera()
    {
        System.out.print("  ");
        for (int i = 0; i < rozmiar; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < rozmiar; i++)
        {
            System.out.print(i + " ");
            for (int j = 0; j < rozmiar; j++)
            {
                if(Pole[i][j].getOdwiedzona())
                {
                    if (Pole[i][j].getStatek())
                    {
                        System.out.print("# ");
                    }
                    else
                    {
                        System.out.print("o ");
                    }
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println("|");
        }

        System.out.print("  ");
        for (int i = 0; i < rozmiar; i++)
        {
            System.out.print("- ");
        }
        System.out.println();
    }
    
    public void WyswietlPlanszeGracza()
    {
        System.out.print("  ");
        for (int i = 0; i < rozmiar; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < rozmiar; i++)
        {
            System.out.print(i + " ");
            for (int j = 0; j < rozmiar; j++)
            {
                if(Pole[i][j].getOdwiedzona())
                {
                    if (Pole[i][j].getStatek())
                    {
                        System.out.print("# ");
                    }
                    else
                    {
                        System.out.print("o ");
                    }
                }
                else
                {
                    if (Pole[i][j].getStatek())
                    {
                        System.out.print("X ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println("|");
        }

        System.out.print("  ");
        for (int i = 0; i < rozmiar; i++)
        {
            System.out.print("- ");
        }
        System.out.println();
    }

    // BEGIN MGawron
    public boolean WczytajPlanszeZPliku(String nazwa)
    {
        File file = new File("./plansze/" + nazwa);
        RandomAccessFile input = null;
        String wiersz = null;
        int liczba = 0;

        try
        {
            input = new RandomAccessFile(file, "r");

            if (this.DekodujLiczbeStatkow(input.readLine()))
            {
                String[] wiersze = new String[this.liczbaStatkow];
                while ((wiersz = input.readLine()) != null && liczba < this.liczbaStatkow)
                {
                    if (wiersz.equals(""))
                    {
                        continue;
                    }
                    wiersze[liczba] = wiersz;
                    //System.out.println(wiersz);
                    liczba++;
                }

                //System.out.println("odczytane linie z pliku" + liczba);
                if (liczba >= this.liczbaStatkow)
                {
                    /**
                     * TO DO Dekoduj linijki z pliku i zrob z nich plansze
                     */
                    return this.DekodujStatki(wiersze);
                    //return true;
                }
                else
                {
                    System.out.println("Za malo linii w pliku");
                    return false;
                }
            }
            else
            {
                System.out.println("Nie udalo sie odczytac liczby statkow");
                return false;
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Wystapil blad podczas otwierania pliku");
        }
        catch (IOException e)
        {
            System.out.println("Wystapil blad podczas odczytu z pliku");
        }
        finally
        {
            if (input != null)
            {
                try
                {
                    input.close();
                }
                catch (IOException e)
                {
                    System.out.println("Wystapil blad podczas zamykania pliku");
                }
            }
        }
        return false;
    }

    public boolean DekodujStatki(String[] wiersze)
    {
        for (int i = 0; i < wiersze.length; i++)
        {
            //System.out.println(wiersze[i]);
        }
        return true;
    }

    public boolean DekodujLiczbeStatkow(String wiersz)
    {
        String[] wiersze = wiersz.split(" ");
        if (wiersze.length >= 4)
        {
            int suma = 0;
            for (int i = 0; i < 4; i++)
            {
                suma = suma + Integer.parseInt(wiersze[i]);
            }
            this.liczbaStatkow = suma;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void DekodujPozycje(String pozycja)
    {
        int x = Integer.parseInt(pozycja);
        int y = x % 10;
        x = (x - y) / 10;
        this.Dokonaj_strzalu(x, y);
    }
    // END
    public boolean pobierzPozycjeNaPlanszy(int x,int y){
       boolean w = Pole[x][y].getStatek();
        return w; 
    }
}
