/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.furas;

/**
 *
 * @author student
 */
public class MainSrednia {

  public static void main(String[] args) {
      double[] liczby1 = { 1, 2.5 , 13, 5.5 };
      double[] liczby2 = { 2, 2, 5, 7 };
      
      SredniaArytmetyczna sa = new SredniaArytmetyczna();
      SredniaGeometryczna sg = new SredniaGeometryczna();
      SredniaHarmoniczna sh = new SredniaHarmoniczna();
      
      System.out.println("Srednia arytmetyczna: " + sa.obliczSrednia(liczby1) );
      System.out.println("Srednia arytmetyczna: " + sa.obliczSrednia(liczby2) );
      
      System.out.println("Srednia geometryczna: " + sg.obliczSrednia(liczby1) );
      System.out.println("Srednia geometryczna: " + sg.obliczSrednia(liczby2) );
      
      System.out.println("Srednia harmoniczna: " + sh.obliczSrednia(liczby1) );
      System.out.println("Srednia harmoniczna: " + sh.obliczSrednia(liczby2) );
  }    
}
