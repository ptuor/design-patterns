package com.samu.factory.method;

/**
 * Created by sandromuggli on 13.08.17.
 */

/**
 *  VinylCreator hat nur eine einzige 'create'-Methode und erstellt je nach Parameter (Config) eine EP oder LP.
 *   Keine ConcreateCreators notwendig
 *   => flexible 2. Variante aus Vorlesung 2, Folie 11
 *   => benötigt aber typecast, sofern Client auf konkretes Produkt (hier EP oder LP) zugreifen möchte.
 *      GEFAHR: classCastException!
 *   => bei schwachtypisierten Sprachen viel eleganter lösbar
 */
public class App {
    public static void main(String[] args) {
        Vinyl vinyl = VinylCreator.create(new Config("yellow", "the end", "black sabbath", "EP"));
        System.out.println(vinyl);

        // benötigt cast sofern man auf Eigenschaften des Subtyps zugreifen möchte
        LP lp = (LP) VinylCreator.create(new Config("yellow", "paranoid", "black sabbath", "LP"));
        System.out.println(lp);
        System.out.println("Anzahl Lieder " + lp.getnumberOfSongs());
    }
}
