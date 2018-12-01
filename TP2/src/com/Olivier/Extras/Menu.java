/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Olivier.Extras;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author olivier
 */
public class Menu extends JMenuBar {
    
    private JMenu menu = new JMenu("Menu");
    private JMenuItem demarrer = new JMenuItem("Démarrer");
    private JMenuItem quitter = new JMenuItem("Quitter");
    
    public Menu(){
        
        menu.add(demarrer);
        menu.addSeparator();
        menu.add(quitter);
        
        demarrer.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == demarrer){
                    System.out.println("Vous avez cliqué sur démarrer");
                }
            }
        });
        
        quitter.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == quitter){
                    System.exit(0);
                }
            }
        });
        
        add(menu);
        
    }
}
