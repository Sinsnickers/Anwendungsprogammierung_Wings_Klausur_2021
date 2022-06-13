/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aufgabe_5;

/**
 *
 * @author bero8
 */
public class Artikel {
    
    private int nummer;
    private String bezeichnung;
    private double preis;
    
    public Artikel(int nummer, String bezeichnung, double preis) {
        this.nummer = nummer;
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }
    
    public Artikel() {};
    
    public int getNummer() {
        return this.nummer;
    }
    
    public String getBezeichnung() {
        return this.bezeichnung;
    }
    
    public double getPreis() {
        return this.preis;
    }
    
    
    
}
