package combat;

import personnages.Personnage;

public class AffichageEcran {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold desc="Méthodes d'affichage">
    public void afficherDebutCombat() {
        // TODO : Afficher le message du début du combat, tel que montré dans l'énoncé
        System.out.println("");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>> Que le combat commence ! <<<<");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("");
    }

    public void afficherSeparateurDeTour() {
        // TODO : Afficher un retour à la ligne, suivi d'une ligne d'astérisques, tel que montré dans l'énoncé
        System.out.println("");
        System.out.println("*****************************");
    }

    public void afficherSeparateurInfosPerso() {
        // TODO : Afficher un retour à la ligne, suivi du séparateur "infos personnages", tel que montré dans l'énoncé
        System.out.println("");
        System.out.println("------------------------");
        System.out.println(" Informations personnage");
        System.out.println("------------------------");
    }

    public void afficheVictoire(Personnage personnage1, Personnage personnage2) {
        // TODO : Afficher le gagnant du combat, tel que montré dans l'énoncé
        System.out.println("");
           if (personnage1.getPointsDeVie() > 0) {
        System.out.println(personnage1.getNomPersonnage() + " a remporté la victoire !!! ");
    }
    
    else {
        System.out.println(personnage2.getNomPersonnage()+ " a remporté la victoire !!! ");
    }
    }
    // </editor-fold>
}
