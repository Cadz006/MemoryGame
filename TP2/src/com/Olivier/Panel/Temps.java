/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Olivier.Panel;

import javax.swing.JLabel;

/**
 *
 * @author olivier
 */
public class Temps extends JLabel {
    
    private JLabel affichageTemps;
    private double temps = 0.0;
    
    public Temps(){
        
        affichageTemps = new JLabel("Temps restant : " + temps + "s");
        add(affichageTemps);
        
    }
}
