/*
 * Collège Bois-de-Boulogne
 * Cours Programmation Orientés-Objets
 * Présenté à Najoua Ghrieb
 * Fait par Olivier Cadieux
 * Numéro de DA : 1156103
 */
package com.Olivier.Extras;

import com.Olivier.Panel.PanelJeu;
import static java.lang.Thread.sleep;

/**
 * Cette classe détermine les fonctions et les variables nécessaires au 
 * bon fonctionnement du jeu.
 * 
 * @author Olivier Cadieux
 */
public class Jeu implements Runnable {

    //Variables du Jeu
    private int NbTours;
    private PanelJeu tab;
    private int score;

    /**
     * Constructeur avec paramètres pour créer l'objet Jeu
     * 
     * @param nbTourInt de type int qui contient la valeur en entier du nombre de tours
     * @param tab de type FrameJeu qui contient un Panel des boutons du jeu
     * @param score de type int qui contient la valeur du score actuel
     */
    Jeu(int nbTourInt, PanelJeu tab, int score) {
        this.NbTours = nbTourInt;
        this.tab = tab;
        this.score = score;
    }
    
    /**
     * Cette méthode va exécuter le jeu suite au nombre de tours que l'utilisateur aura demander.
     */
    @Override
    public void run() {
        while (NbTours != 0) {
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
            }
            try {
                sleep(200);
            } catch (InterruptedException ex) {
                
            }
            NbTours--;
        }
    }
}
