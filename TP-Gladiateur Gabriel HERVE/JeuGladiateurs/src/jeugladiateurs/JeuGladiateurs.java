package jeugladiateurs;

import combat.CompteurDeTour;
import combat.AffichageEcran;
import personnages.Mirmillon;
import personnages.Retiaire;

public class JeuGladiateurs {

    public static void main(String[] args) {

        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold desc="Instanciation des objets">
        CompteurDeTour tour = new CompteurDeTour();
        AffichageEcran affichage = new AffichageEcran();
        Mirmillon bob = new Mirmillon("Bob le malchanceux", 70, 15, 15);
        Retiaire igor = new Retiaire("Igor l'empaleur", 100, 25, 5);
        // </editor-fold>

        // **************************************************************************
        // **************************************************************************
        // **************************************************************************l
        // <editor-fold desc="Affichage pré-combat">
        // TODO : Afficher les infos de chaque personnage
        bob.setNewInitiativeRandom();
        bob.afficherInfosPersonnage();
        System.out.println("");
        igor.setNewInitiativeRandom();
        igor.afficherInfosPersonnage();
        // TODO : Afficher le message du début du combat
        System.out.println("");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("==== Debut du combat ! ===");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
        // </editor-fold>

        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold desc="Mécanique de combat">
        // TODO : La boucle contenant les étapes du combat
        while (bob.getPointsDeVie() > 0 && igor.getPointsDeVie() > 0) {
            tour.afficheTour();

            for (int i = 0; i <= 100; i++) {
                if (i == bob.getInitiative()) {
                    bob.frapperPersonnage(igor);
                    if (igor.getPointsDeVie() <= 0) {
                        break;
                    }
                }

                if (i == igor.getInitiative()) {
                    igor.frapperPersonnage(bob);
                    if (bob.getPointsDeVie() <= 0) {
                        break;
                    }
                }
            }

            if (bob.getPointsDeVie() > 0 && igor.getPointsDeVie() > 0) {
                affichage.afficherSeparateurInfosPerso();
                bob.afficherInfosPersonnage();
                System.out.println("");
                igor.afficherInfosPersonnage();
                bob.setNewInitiativeRandom();
                igor.setNewInitiativeRandom();
                tour.augmenteTour();
                affichage.afficherSeparateurDeTour();
            }
        }
        
        // TODO : Après la boucle, afficher le résultat du combat
        affichage.afficheVictoire(bob, igor);
        // </editor-fold>
    }
}