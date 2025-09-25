package combat;

public class CompteurDeTour {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold desc="Attributs">
    // TODO : Mettre vos attributs ici
    int cptrTour;
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public CompteurDeTour() {
        // TODO : Constructeur SANS paramètres qui initialise un compteur de tour (attribut) à 1
        this.cptrTour = 1;
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    // TODO : Le getter
    public int getCptrTour() {
        return cptrTour;
    }

    // TODO : Le setter
    public void setCptrTour(int cptrTour) {
        this.cptrTour = cptrTour;
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold desc="Mécanique de jeu">
    public void augmenteTour() {
        // TODO : Incrémenter le compteur de tour
        this.cptrTour++;
    }

    public void afficheTour() {
        // TODO : Afficher le tour actuel, tel que montré dans l'énoncé
        System.out.println("");
        System.out.println("---------------");
        System.out.println("Tour Actuel : " + cptrTour);
        System.out.println("---------------");

    }
    // </editor-fold>
}
