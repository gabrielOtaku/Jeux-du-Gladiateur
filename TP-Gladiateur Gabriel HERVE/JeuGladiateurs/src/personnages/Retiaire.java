package personnages;

import java.util.Random;

public class Retiaire extends Personnage{
// <editor-fold  desc="Attribut">
 private boolean aSonFilet = true;
//</editor-fold>

   

//**********************************************************************************************************************************************************
//<editor-fold defaultstate="collapsed" desc="CONSTRUCTEUR et INITIALISATION">
private final String type = "Rétiaire";
           

            public Retiaire(String nom, int pointsDeVie, int valeurMaxAttaque, int valeurDefense) {
                super(nom, pointsDeVie, valeurMaxAttaque, valeurDefense, 0);
            }

            @Override
            public void afficherInfosPersonnage() {
                super.afficherInfosPersonnage();
                System.out.println("Type de combattant : " + this.type);
            }
//</editor-fold>

//**********************************************************************************************************************************************************
// <editor-fold  desc="METHODES">
@Override
public void frapperPersonnage(Personnage personnageCible) {
    Random random = new Random();

    if (this.aSonFilet) {
        System.out.println("Igor l'empaleur lance son filet");
        
        if (random.nextInt(100) < 10) { 
            System.out.println("Son filet attrape " + personnageCible.getNomPersonnage()+ " et il l’empale sauvagement avec sa lance");
            personnageCible.setPointsDeVie(0); 
        } else {
            System.out.println("Le filet n'atteint pas sa cible");
            this.aSonFilet = false; 
        }
    } else {
        System.out.println("Igor l'empaleur ramasse son filet et en profite pour attaquer");
        this.aSonFilet = true; 
        super.frapperPersonnage(personnageCible); 
    }
}
//</editor-fold>

//**********************************************************************************************************************************************************
//<editor-fold defaultstate="collapsed" desc="GETTERS et SETTERS">
 public boolean isaSonFilet() {
        return aSonFilet;
    }

    public void setaSonFilet(boolean aSonFilet) {
        this.aSonFilet = aSonFilet;
    }
//</editor-fold>


}
