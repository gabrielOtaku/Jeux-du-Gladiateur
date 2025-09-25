package personnages;

import java.util.Random;

public class Personnage {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold desc="Attributs">
    // TODO : Mettre vos attributs ici
    String nomPersonnage;
    private int pointsDeVie;
    private int valeurMaxAttaque;
    private int valeurDefense;
    private int initiative;
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        // TODO : Constructeur AVEC paramètres
        this.nomPersonnage = nom;
        this.pointsDeVie = pvs;
        this.valeurMaxAttaque = attaqueMax;
        this.valeurDefense = defense;
        this.initiative = ini;

    }

    public Personnage() {
        // TODO : Constructeur SANS paramètres qui initialise à ZÉRO ou à ""
        System.out.println("");
    }
    
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    // TODO : Les getters
    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getValeurMaxAttaque() {
        return valeurMaxAttaque;
    }

    public int getValeurDefense() {
        return valeurDefense;
    }

    public int getInitiative() {
        return initiative;
    }
    // TODO : Les setters

    public void setNomPersonnage(String nomPersonnage) {
        this.nomPersonnage = nomPersonnage;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }

    public void setValeurDefense(int valeurDefense) {
        this.valeurDefense = valeurDefense;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public String getNomPersonnage() {
        return nomPersonnage;
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {
        System.out.println("Nom du personnage : " + this.nomPersonnage);
        System.out.println("Points de vie : " + this.pointsDeVie);
        System.out.println("Attaque maximale : " + this.valeurMaxAttaque);
        System.out.println("Valeur de défense : " + this.valeurDefense);
        System.out.println("Initiative : " + this.initiative);
        if (this.pointsDeVie <= 0) {
            System.out.println("Statut : Mort");
        } else {
            System.out.println("Statut : Vivant");
        }
    }

    private int attaqueCalcul() {
        // TODO : Retourner la valeur de l'attaque du personnage.
        Random random = new Random();

        int attaque = random.nextInt(this.valeurMaxAttaque + 1);
        // Cette valeur est trouvée aléatoirement et doit se situer entre ZÉRO et valeurMaxAttaque.
        return attaque;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        // TODO : Récupérer la valeur d'attaque pour ce tour, calculer les dégats,
        int forceDeFrappe = this.attaqueCalcul();
        int valeurDefenceCible = personnageCible.getValeurDefense();
        int dammage = forceDeFrappe - valeurDefenceCible;

        if (dammage < 0) {
            dammage = 0;
        }


        int nouveauPointsDeVies = personnageCible.getPointsDeVie() - dammage;

        if (nouveauPointsDeVies < 0) {
            nouveauPointsDeVies = 0;
        }

        personnageCible.setPointsDeVie(nouveauPointsDeVies);


        System.out.println("");
        System.out.println(nomPersonnage + " attaque avec une puissance de : " + forceDeFrappe);
        System.out.println(personnageCible.nomPersonnage + " a une defence de : " + valeurDefenceCible);
        System.out.println("Les dommages sont de  : " + dammage);
    }

    public void setNewInitiativeRandom() {
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
        Random random = new Random();

        this.initiative = random.nextInt(101);
    }
    // </editor-fold>
}
