/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musiker;

import java.util.ArrayList;

/**
 *
 * @author bero8
 */
public class Band {
    
    public ArrayList<Musiker> band;
    private String gruendungsjahr;
    
    public Band(String jahr) {
        band = new ArrayList<>();
        this.gruendungsjahr = jahr;
    }
    
    public void fuegeMusikerHinzu(Musiker musiker) {
        band.add(musiker);
    }
    
       
}
