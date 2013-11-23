/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.furas;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author student
 */
public class MaszynaSortujaca {

    Porownywarka porownywarka;
    ArrayList<Pojazd> lista;
    
    public MaszynaSortujaca(Porownywarka porownywarka) {
        this.porownywarka = porownywarka;
        
        this.lista = new ArrayList<Pojazd>();
    }

    
    public void dodajPojazd(Pojazd p){
        this.lista.add(p);
    }
    
    public void sortuj() {
//        Arrays.sort(lista, porownywarka);
    }
    
    public void wypisz() {
        for(Pojazd x: lista){
            System.out.println("nazwa: " + x.nazwa);
        }
    }
}
