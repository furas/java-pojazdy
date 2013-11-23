/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.furas;

import java.util.Arrays;

/**
 *
 * @author student
 */
public class Main {

    public static void wypisz(Pojazd pojazd) {
        System.out.println("Czy To Wieloslad: " + pojazd.czyToWielosiad());
        System.out.println("Czy Ma Dach: " + pojazd.czyMaDach());
        System.out.println("Czy Utonie: " + pojazd.czyUtonie());
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Samochod samochod = new Samochod("A");
        Rower rower = new Rower("B");
        Lodz lodz = new Lodz("C");
        
        wypisz(samochod);
        wypisz(rower);
        wypisz(lodz);
        
        Pojazd[] tablica = new Pojazd[5];
        
        tablica[0] = new Samochod("A");
        tablica[1] = new Rower("X");
        tablica[2] = new Lodz("E");
        tablica[3] = new Samochod("C");
        tablica[4] = new Rower("R");
        tablica[4] = new Lodz("W");
        
        Arrays.sort(tablica);
        
        for(int i = 0 ; i < tablica.length ; i++) {
            System.out.println("Nazwa: " + tablica[i].nazwa);
        }
    }
}
