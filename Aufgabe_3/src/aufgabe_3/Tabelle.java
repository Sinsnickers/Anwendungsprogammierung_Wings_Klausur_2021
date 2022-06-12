/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aufgabe_3;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
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
    JPanel panel = new JPanel();
    JTable table = new JTable(tabledata, columnHeaders);
    JScrollBar scrollbar =  new JScrollBar();
    scrollbar.add(table);
    panel.add(table);
    frame.add(panel);
    scrollbar.setVisible(true);
    frame.setVisible(true);
    panel.setVisible(true);
        
}}
