/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package aufgabe_5;

/**
 *
 * @author bero8
 */
public interface Warenkorbschnittstelle {
    
    public Artikel gibArtikelAusWarenkorb(int nummer);
    
    public void legeInWarenkorb(Artikel artikel);
    
}
