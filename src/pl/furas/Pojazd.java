/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.furas;

/**
 *
 * @author student
 */
public abstract class Pojazd implements Comparable {
    
    protected Integer miejsca;
    protected Integer kola;
    protected Integer cena;
    protected Integer waga;
    protected String nazwa;

    public void ustawIloscMiejsc(Integer ilosc) {
        this.miejsca = ilosc;
    }
    
    public void ustawIloscKol(Integer ilosc) {
        this.kola = ilosc;
    }
    
    public void ustawCene(Integer ilosc) {
        this.cena = ilosc;
    }
    
    public void ustawWage(Integer ilosc) {
        this.waga = ilosc;
    }
    
    abstract boolean czyToWielosiad();
    
    abstract boolean czyMaDach();
    
    abstract boolean czyUtonie();
    
    public int compareTo(Object p) {
        
        return this.nazwa.compareTo( ((Pojazd)p).nazwa );
    } 
}
