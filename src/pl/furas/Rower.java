/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.furas;

/**
 *
 * @author student
 */
public class Rower extends Pojazd {
    
    public Rower(String nazwa) {
        this.nazwa = nazwa;
    }
    
    public boolean czyToWielosiad() {
        return false;
    }
    
    public boolean czyMaDach() {
        return false;
    }
    
    public boolean czyUtonie() {
        return true;
    }
    
}
