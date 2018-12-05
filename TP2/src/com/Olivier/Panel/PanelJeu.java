/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Olivier.Panel;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author olivier
 */
public class PanelJeu extends JPanel {

    protected JButton[][] tabbouton = new JButton[4][4];
    protected final JButton[][] tabinit = new JButton[4][4];
    private final ImageIcon memoire = new ImageIcon("vide.png");
    private final ImageIcon mario = new ImageIcon("Mario.png");
    private final ImageIcon dk = new ImageIcon("DK.png");
    private final ImageIcon samus = new ImageIcon("Samus.png");
    private final ImageIcon fox = new ImageIcon("fox.png");
    private final ImageIcon kirby = new ImageIcon("kirby.png");
    private final ImageIcon link = new ImageIcon("Link.png");
    private final ImageIcon yoshi = new ImageIcon("yoshi.png");
    private final ImageIcon pikachu = new ImageIcon("pikachu.png");
    protected final ImageIcon[] tabImage = new ImageIcon[]{mario, dk, samus, fox, kirby, link, yoshi, pikachu};

    public PanelJeu() {
        this.setLayout(new GridLayout(4, 4));
        JButton[][] tableau = new JButton[4][4];
        tableau = creationBoutonTab(tabbouton);
//        tableauInit(tableau);
        tabbouton = Randomize(tabImage, tabbouton);
//        ReactionBouton(getPositionRand(tabImage, tabbouton));
       
    }
    
    public JButton[][] creationBoutonTab(JButton[][] tableau){
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                tableau[i][j] = new JButton();
                add(tableau[i][j]);
            }
        }
        return tableau;
    }

    public JButton[][] Randomize(ImageIcon[] tableauImage, JButton[][] tableauBouton) {
        int indice = 0;
        int compteur = 0;
        int compteurMario = 0, compteurYoshi = 0, compteurDK = 0, compteurSamus = 0;
        int compteurFox = 0, compteurKirby = 0, compteurLink = 0, compteurPikachu = 0;
        Random rand = new Random();
        while (compteur != 16) {
            for (int i = 0; i < tableauBouton.length; i++) {
                for (int j = 0; j < tableauBouton[i].length; j++) {
                    indice = rand.nextInt(tableauImage.length);
                    switch (indice) {
                        case 0:
                            if (compteurMario != 2) {
                                tableauBouton[i][j].setIcon(tableauImage[indice]);
                                compteurMario++;
                            }
                            break;
                        case 1:
                            if (compteurYoshi != 2) {
                                tableauBouton[i][j].setIcon(tableauImage[indice]);
                                compteurYoshi++;
                            }
                            break;
                        case 2:
                            if (compteurDK != 2) {
                                tableauBouton[i][j].setIcon(tableauImage[indice]);
                                compteurDK++;
                            }
                            break;
                        case 3:
                            if (compteurFox != 2) {
                                tableauBouton[i][j].setIcon(tableauImage[indice]);
                                compteurFox++;
                            }
                            break;
                        case 4:
                            if (compteurSamus != 2) {
                                tableauBouton[i][j].setIcon(tableauImage[indice]);
                                compteurSamus++;
                            }
                            break;
                        case 5:
                            if (compteurKirby != 2) {
                                tableauBouton[i][j].setIcon(tableauImage[indice]);
                                compteurKirby++;
                            }
                            break;
                        case 6:
                            if (compteurLink != 2) {
                                tableauBouton[i][j].setIcon(tableauImage[indice]);
                                compteurLink++;
                            }
                            break;
                        case 7:
                            if (compteurPikachu != 2) {
                                tableauBouton[i][j].setIcon(tableauImage[indice]);
                                compteurPikachu++;
                            }
                            break;
                    }
                }
            }
            compteur++;
        }
        return tableauBouton;
    }
    
    
    public void tableauInit(JButton[][] tableauInit) {
        for (int i = 0; i < tableauInit.length; i++) {
            for (int j = 0; j < tableauInit[i].length; j++) {
                tableauInit[i][j].setIcon(memoire);
            }
        }
    }
    
    public void ReactionBouton(final JButton[][] tableau) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tableau[i][j].setEnabled(false);
                tabbouton[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton clicked = (JButton) e.getSource();
                        for (int k = 0; k < 4; k++) {
                            for (int l = 0; l < 4; l++) {
                                if (clicked == tabbouton[k][l]) {
                                    tableau[k][l].setEnabled(true);
                                }
                            }
                        }
                    }

                });
                tabbouton[i][j].setEnabled(true);
                add(tabbouton[i][j]);
            }
        }
    }
}
