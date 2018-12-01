/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Olivier.Panel;

import com.Olivier.Extras.TabBouton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author olivier
 */
public class PanelJeu extends JPanel {

    private final int DIM = 8;
    
    public PanelJeu() {
        this.setSize(415, 400);
//        this.setLayout(new GridLayout(4, 4));
        TabBouton tab = new TabBouton();
        add(tab);
    }
}
