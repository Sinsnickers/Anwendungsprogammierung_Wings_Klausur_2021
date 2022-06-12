/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aufgabe_3;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author bero8
 */
public class Tabelle {
    
    public Tabelle() {
    
    Object [][] tabledata = {
        {1,"Frankreich", 4, 1},
        {2,"Deutschland", 3, 1},
        {3,"Portugal", 3, 1},
        {4,"Ungarn", 1, -3}};
    
    Object [] columnHeaders = {"Platz", "Mannschaft", "Punkte", "Tordifferenz"};
    
    JFrame frame = new JFrame();
    JTable table = new JTable(tabledata, columnHeaders);
    JScrollPane scrollpane =  new JScrollPane(table);
    frame.add(scrollpane);
    scrollpane.setVisible(true);
    frame.pack();
    frame.setVisible(true);
        
}}
