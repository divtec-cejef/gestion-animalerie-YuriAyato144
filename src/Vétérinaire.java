public class Vétérinaire extends Employe {
    public Vétérinaire(String nom, String prenom, int age, int role, int salaire) {
        super(nom, prenom, age, String.valueOf(role), salaire);
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