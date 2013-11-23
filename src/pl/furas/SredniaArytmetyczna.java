/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.furas;

/**
 *
 * @author student
 */
public class SredniaArytmetyczna implements Srednia {
    
    public double obliczSrednia(double[] liczby) {
        
        double wynik = 0;
        
        if( liczby.length > 0 ) {
            for(int i = 0 ; i < liczby.length ; i++ ) {
                wynik += liczby[i];
            }

            wynik /= liczby.length;
        }
    
        return wynik;
    }
   
}
