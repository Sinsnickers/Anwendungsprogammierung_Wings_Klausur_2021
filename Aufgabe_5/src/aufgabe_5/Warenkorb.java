/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aufgabe_5;

import java.util.HashMap;

/**
 *
 * @author bero8
 */
public class Warenkorb extends HashMap<Integer, Artikel> implements Warenkorbschnittstelle{
    
    public Warenkorb() {
        
        //warenkorb = new HashMap<>();        
    }
    
    public Artikel gibArtikelAusWarenkorb(int nummer) {
        return get(nummer);
        
    }
    
    public void legeInWarenkorb(Artikel artikel) {
        put(artikel.getNummer(), artikel);
        
        
    }
 
}
