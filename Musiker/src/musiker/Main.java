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
        Band metallica = new Band("2002");
        Musiker james_hetfield = new Musiker("James Hetfield", "James Alan Hetfield");
        metallica.fuegeMusikerHinzu(james_hetfield);
    }
    
}
