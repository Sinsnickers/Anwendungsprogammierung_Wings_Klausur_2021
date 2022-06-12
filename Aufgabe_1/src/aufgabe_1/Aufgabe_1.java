/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aufgabe_1;

/**
 *
 * @author bero8
 */
public class Aufgabe_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        Zeuge zeuge_meier = new Zeuge("Meier", 75);
        System.out.println(zeuge_meier.getAlter());
        
        Zeuge zeuge_wolf = new Zeuge("Wolf", 109);
        System.out.println(zeuge_wolf.getAlter());
    }
    
}
