public class Vétérinaire extends Employe {
    public Vétérinaire(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    @Override
    public void effectuerTache(Animal animal) {
        System.out.println("Le vétérinaire examine et soigne l'animal.");
        EtatSante etatAvant = animal.getSante();
        animal.soigner();
        EtatSante etatApres = animal.getSante();

        if (etatAvant == etatApres) {
            System.out.println("L'animal est déjà en parfaite santé !");
        } else {
            System.out.println("État de santé amélioré : " + etatAvant + " → " + etatApres);
        }
    }
}