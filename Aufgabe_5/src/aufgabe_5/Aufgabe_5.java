/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aufgabe_5;

/**
 *
 * @author bero8
 */
public class Aufgabe_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Artikel artikel = new Artikel(1234, "Milka 90g", 0.99);
        Warenkorbschnittstelle warenkorb = new Warenkorb();
        
        warenkorb.legeInWarenkorb(artikel);
        System.out.println(artikel.getBezeichnung());
        System.out.println(artikel.getNummer());
        System.out.println(artikel.getPreis());
        
        System.out.println(warenkorb.gibArtikelAusWarenkorb(1234).getBezeichnung());
            
        
            
        }
    }
  


/*
zu a:

Hier sollte das Entwurfsmuster Adapter zur Anwendung kommen. 
Es wird von dem Shop eine Schnittstelle vorgesehen, die wir mit einem Klassenadapter ansteuern können. 

zu b:

Zur Implementierung des Warenkorbs kann eine HashMap verwendet werden. 
Somit kann man jeden Artikel speichern und durch den eindeutigen Schlüssel auf jeden Artikel einfach wieder zugreifen
*/
