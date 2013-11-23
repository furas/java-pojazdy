/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.furas;

/**
 *
 * @author student
 */
public class Samochod extends Pojazd {

    public Samochod(String nazwa) {
        this.nazwa = nazwa;
    }
    

    public boolean czyToWielosiad() {
        return true;
    }
    
    public boolean czyMaDach() {
        return true;
    }
    
    public boolean czyUtonie() {
        return true;
    }
}
