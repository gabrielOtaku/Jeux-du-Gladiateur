package personnages;

import java.util.Random;

public class Mirmillon extends Personnage{
// <editor-fold  desc="Attribut">
  private final String type = "Mirmillon";
//</editor-fold>

//**********************************************************************************************************************************************************
//<editor-fold defaultstate="collapsed" desc="CONSTRUCTEUR et INITIALISATION">
  public Mirmillon(String nom, int pointsDeVie, int valeurMaxAttaque, int valeurDefense) {
            super(nom, pointsDeVie, valeurMaxAttaque, valeurDefense, 0);
        }

        @Override
        public void afficherInfosPersonnage() {
            super.afficherInfosPersonnage();
            System.out.println("Type de combattant : " + this.type);
        }

   

        @Override
        public void setNewInitiativeRandom() {
            Random random = new Random();
            this.setInitiative(random.nextInt(31));
        }
//</editor-fold>

//**********************************************************************************************************************************************************
// <editor-fold  desc="METHODES">
@Override
public void frapperPersonnage(Personnage personnageCible) {
    
    super.frapperPersonnage(personnageCible);

    
    if (personnageCible.getPointsDeVie() > 0) {
        System.out.println(this.getNomPersonnage()+ " attaque de nouveau!");
       
        super.frapperPersonnage(personnageCible);
    } else {
        System.out.println(this.getNomPersonnage()+ " décapite l'adversaire!");
    }
}
//</editor-fold>

//**********************************************************************************************************************************************************
//<editor-fold defaultstate="collapsed" desc="GETTERS et SETTERS">
 public String getType() {
        return type;
    }
//</editor-fold>


}
