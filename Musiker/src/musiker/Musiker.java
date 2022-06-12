/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musiker;

/**
 *
 * @author bero8
 */
public class Musiker extends Interpret {
    
    private String buergerlicherName;
    
    public Musiker(String name, String buergerlich) {
        super(name);
        this.buergerlicherName = buergerlich;
    }
}
