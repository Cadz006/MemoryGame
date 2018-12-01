/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Olivier.Frame;

import com.Olivier.Extras.Menu;
import com.Olivier.Panel.PanelJeu;
import com.Olivier.Panel.Temps;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author olivier
 */
public class Frame extends JFrame {
    
    private final int DIML = 415;
    private final int DIMH = 500;
    
    private PanelJeu panneauJeu;
    private Menu menuToolBar;
    private Temps temps;
    
    public Frame(){
        super("Jeu de mémoire");
        
        //Tableau de boutons en JPanel ici
        panneauJeu = new PanelJeu();
        temps = new Temps();
        menuToolBar = new Menu();
        
        add(menuToolBar, BorderLayout.NORTH);
        add(panneauJeu, BorderLayout.CENTER);
        add(temps, BorderLayout.SOUTH);
        setSize(DIML, DIMH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setResizable(false);
        setVisible(true);
    }
}
