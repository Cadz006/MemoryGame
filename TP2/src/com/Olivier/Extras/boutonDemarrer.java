/*
 * Collège Bois-de-Boulogne
 * Cours Programmation Orientés-Objets
 * Présenté à Najoua Ghrieb
 * Fait par Olivier Cadieux
 * Numéro de DA : 1156103
 */
package com.Olivier.Extras;

import com.Olivier.Panel.PanelJeu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 * Cette classe construit et configure le fonctionnement du bouton "démarrer"
 * dans le menu du jeu
 * 
 * @author Olivier Cadieux
 */
public class boutonDemarrer implements ActionListener {

    //Variables du demanderController
    private PanelJeu batard;
    private JMenuItem demarrer;
    private int nbTourInt;

    /**
     * Constructeur avec paramètres pour créer l'objet demarrerController
     * 
     * @param btrd de type FrameJeu
     * @param demarrer de type JMenuItem
     */
    public boutonDemarrer(PanelJeu btrd, JMenuItem demarrer) {
        this.batard = btrd;
        this.demarrer = demarrer;
    }
    

    /**
     * Cette méthode affiche à l'utilisateur une fenêtre pour lui demander
     * le nombre de tours requis pour sa partie, après qu'il a cliqué sur
     * le bouton "démarrer"
     * Cette méthode démarre aussi le thread de la classe Jeu.
     * 
     * @param ae de type ActionEvent
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == demarrer) {
            int resultat = 0;
            String nbtour = JOptionPane.showInputDialog("Veuillez entrer le nombre de tours : ");
            nbTourInt = Integer.parseInt(nbtour);
            Jeu j = new Jeu(nbTourInt, batard, resultat);
            Thread tred = new Thread(j);
            tred.start();
        }
    }

}
