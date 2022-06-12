/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aufgabe_1;

/**
 *
 * @author bero8
 */
public class Zeuge{
    
    String name;
    private int alter;
    
    public Zeuge(String name, int alter) throws Exception {
        
        this.name = name;
        
        if (alter <= 99) {
            this.alter = alter;
        }
        
        else if (alter > 100) {
            this.alter = 0;
            throw new Exception ("Alter ist nicht zulässig");
        }
        
    }
    
    public int getAlter() {
        return this.alter;
    }
    
}
