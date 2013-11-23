/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.furas;

/**
 *
 * @author student
 */
public class SredniaGeometryczna implements Srednia {

    
    public double obliczSrednia(double[] liczby) {
        
        double wynik = 1;
        
        if( liczby.length > 0 ) {
            for(int i = 0 ; i < liczby.length ; i++ ) {
                wynik *= liczby[i];
            }

            double potega = 1;
            potega /= liczby.length;
            wynik = Math.pow(wynik, potega);
        }
    
        return wynik;
    }    
}
