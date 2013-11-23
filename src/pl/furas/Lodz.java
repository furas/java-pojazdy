/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.furas;

/**
 *
 * @author student
 */
public class Lodz extends Pojazd {
    
    public Lodz(String nazwa) {
        this.nazwa = nazwa;
    }
    
    public boolean czyToWielosiad() {
        return false;
    }
    
    public boolean czyMaDach() {
        return false;
    }
    
    public boolean czyUtonie() {
        return false;
    }
}
