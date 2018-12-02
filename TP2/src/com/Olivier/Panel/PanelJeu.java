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
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author olivier
 */
public class PanelJeu extends JPanel {

    private final int DIM = 8;
    private JButton[][] tabbouton = new JButton[4][4];
    private final ImageIcon mario = new ImageIcon("Mario.png");
    private final ImageIcon dk = new ImageIcon("DK.png");
    private final ImageIcon samus = new ImageIcon("Samus.png");
    private final ImageIcon fox = new ImageIcon("fox.png");
    private final ImageIcon kirby = new ImageIcon("kirby.png");
    private final ImageIcon link = new ImageIcon("Link.png");
    private final ImageIcon yoshi = new ImageIcon("yoshi.png");
    private final ImageIcon pikachu = new ImageIcon("pikachu.png");
    private final ImageIcon[] tabImage = new ImageIcon[]{mario, dk, samus, fox, kirby, link, yoshi, pikachu};
    private int larg = 100;
    private int haut = 100;
    private int indice = 0;
    private int x = 0;
    private int y = 0;

    public PanelJeu() {
        this.setSize(415, 300);
        this.setLayout(new GridLayout(4, 4));
//        tabbouton = new JButton[4][4];
        JButton[][] tableau = new JButton[4][4];
        for (int i = 0; i < tabbouton.length; i++) {
            for (int j = 0; j < tabbouton[i].length; j++) {
                tabbouton[i][j] = new JButton();
                add(tabbouton[i][j]);
            }
        }
        tableau = getPositionRand(tabImage, tabbouton);
       
    }

    public final JButton[][] getPositionRand(ImageIcon[] tabImage, JButton[][] tabbouton) {
        int indice = 0;
        int compteur = 0;
        int compteurMario = 0;
        int compteurYoshi = 0;
        int compteurDK = 0;
        int compteurSamus = 0;
        int compteurFox = 0;
        int compteurKirby = 0;
        int compteurLink = 0;
        int compteurPikachu = 0;
        Random rand = new Random();
        while (compteur != 16) {
        for (int i = 0; i < tabbouton.length; i++) {
            for (int j = 0; j < tabbouton[i].length; j++) {
                    indice = rand.nextInt(tabImage.length);
                    if (tabImage[indice] == mario) {
                        if (compteurMario != 2) {
                            tabbouton[i][j].setIcon(tabImage[indice]);
                            compteurMario++;
                        } else {
                            indice = rand.nextInt(tabImage.length);
                        }
                    } else if (tabImage[indice] == yoshi) {
                        if (compteurYoshi != 2) {
                            tabbouton[i][j].setIcon(tabImage[indice]);
                            compteurYoshi++;
                        } else {
                            indice = rand.nextInt(tabImage.length);
                        }
                    } else if (tabImage[indice] == dk) { 
                        if (compteurDK != 2) {
                            tabbouton[i][j].setIcon(tabImage[indice]);
                            compteurDK++;
                        } else {
                            indice = rand.nextInt(tabImage.length);
                        }
                    } else if (tabImage[indice] == fox) {
                        if (compteurFox != 2) {
                            tabbouton[i][j].setIcon(tabImage[indice]);
                            compteurFox++;
                        } else {
                            indice = rand.nextInt(tabImage.length);
                        }
                    } else if (tabImage[indice] == samus) {
                        if (compteurSamus != 2) {
                            tabbouton[i][j].setIcon(tabImage[indice]);
                            compteurSamus++;
                        } else {
                            indice = rand.nextInt(tabImage.length);
                        }
                    } else if (tabImage[indice] == kirby) {
                        if (compteurKirby != 2) {
                            tabbouton[i][j].setIcon(tabImage[indice]);
                            compteurKirby++;
                        } else {
                            indice = rand.nextInt(tabImage.length);
                        }
                    } else if (tabImage[indice] == link) {
                        if (compteurLink != 2) {
                            tabbouton[i][j].setIcon(tabImage[indice]);
                            compteurLink++;
                        } else {
                            indice = rand.nextInt(tabImage.length);
                        }
                    } else if (tabImage[indice] == pikachu) {
                        if (compteurPikachu != 2) {
                            tabbouton[i][j].setIcon(tabImage[indice]);
                            compteurPikachu++;
                        } else {
                            indice = rand.nextInt(tabImage.length);
                        }
                    }
                    
            System.out.println(tabbouton[i][j]);
                }

            }
        compteur++;
        System.out.println(compteur);
        }
        return tabbouton;
    }
}
