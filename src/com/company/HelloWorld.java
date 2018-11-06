package com.company;

public class HelloWorld {
    //Hauptprogramm ist immer main

    public static void unterprogramm()
    {
        System.out.println();
        System.out.println("Mein Unterprogramm");
        System.out.println();

        boolean istSamstag = true;
        boolean istFH = true;

        if (istSamstag == true && istFH)
        {
            System.out.println("Juhu, ich bin am Campus02!");
        }
        else
        {
            System.out.println("Ich lerne gerne zuhause Java :-)");
        }
    }


    public static void main(String[] args) {

        int maxAusgabe;
        maxAusgabe = 0;

        while (maxAusgabe< 100) {
            System.out.println("Hallo Welt " + maxAusgabe);
            System.out.println("Zweite Ausgabezeile");
            maxAusgabe = maxAusgabe + 1;
        }

        long startwert = 31102018;
        unterprogramm();
        int laufWert;
        laufWert = 2;

        while (laufWert <= 9)
        {
            startwert = startwert * laufWert;
            laufWert = laufWert + 1;
            System.out.println(startwert);
        }

        laufWert = 2;
        while (laufWert <=9)
        {
                startwert = startwert / laufWert;
                laufWert = laufWert + 1;
                System.out.println(startwert);
        }
    }
}
