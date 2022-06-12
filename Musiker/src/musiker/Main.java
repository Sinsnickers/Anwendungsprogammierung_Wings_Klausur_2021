/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package musiker;

/**
 *
 * @author bero8
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Band metallica = new Band("Metallic","2002");
        Musiker james_hetfield = new Musiker("James Hetfield", "James Alan Hetfield");
    }
    
}
/*Im großen und ganzen stimme ich mit dem Lösungsvorschlag des Praktikanten zu. Jedoch würde ich anstelle der Komopostion eine Aggregation einsetzen. 
Natürlich gibt es Musiker, die nur in einer Band spielen und alleine nicht erfolgreich wären. Jedoch macht jeder Musiker für sich alleine auch Musik,
somit empfinde ich die Aggregation als "bessere" Lösung
*/
