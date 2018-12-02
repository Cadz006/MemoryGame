/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Olivier.Extras;

import java.awt.GridLayout;
import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author olivier
 */
public class TabBouton extends JPanel {

//    private final ImageIcon mario = new ImageIcon("Mario.png");
//    private final ImageIcon dk = new ImageIcon("DK.png");
//    private final ImageIcon samus = new ImageIcon("Samus.png");
//    private final ImageIcon fox = new ImageIcon("fox.png");
//    private final ImageIcon kirby = new ImageIcon("kirby.png");
//    private final ImageIcon link = new ImageIcon("Link.png");
//    private final ImageIcon yoshi = new ImageIcon("yoshi.png");
//    private final ImageIcon pikachu = new ImageIcon("pikachu.png");
//    private final JButton[][] tabbouton;
//    private final ImageIcon[] tabImage = new ImageIcon[]{mario, dk, samus, fox, kirby, link, yoshi, pikachu};
//    private int larg = 100;
//    private int haut = 100;
//    private int indice = 0;
//    private int x = 0;
//    private int y = 0;

//    public TabBouton() {
//        
//    }

    public final ImageIcon getPositionRand(ImageIcon[] tabImage) {
        int indice = 0;
        Random rand = new Random();
        indice = rand.nextInt(tabImage.length);
        return tabImage[indice];
    }
}
