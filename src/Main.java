import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animal = new ArrayList<>();
        ArrayList<Employe> employes = new ArrayList<>();
        int choixMenuPrincipal = 0;
        do {

            ConsoleIO.afficherMenu();
            choixMenuPrincipal = ConsoleIO.demanderNombre(8, 1);
            switch (choixMenuPrincipal) {
                case 1: animal.add(creerAnimalUtilisateur()); break;
                case 2: employes.add(creerEmployeUtilisateur()); break;
                case 3: ConsoleIO.afficherListeEmployes(employes); break;
                case 4: ConsoleIO.afficherListeAnimaux(animal); break;
                case 5: break;
                case 6: faireBruitAnimal(animal); break;
            }

        } while (choixMenuPrincipal != 7);
    }

    public static void faireBruitAnimal(ArrayList<Animal> animaux) {
        if (animaux.isEmpty()) {
            ConsoleIO.afficherUnString("\nVous n'avez pas d'animaux pour faire du bruit.\n");
            return;
        }
        
        ConsoleIO.afficherUnString("\nSélectionnez un animal pour entendre son bruit :\n");

        for (int i = 0; i < animaux.size(); i++) {
            Animal animal = animaux.get(i);
            ConsoleIO.afficherUnString((i + 1) + ") " + animal.getNom() + " (" + animal.getRace() + ")");
        }
        ConsoleIO.afficherUnString("\nChoisissez un animal (1 - " + animaux.size() + ") : ");
        int choix = ConsoleIO.demanderNombre(animaux.size() + 1, 1);

        if (choix != 0) {
            Animal animalChoisi = animaux.get(choix - 1);
            ConsoleIO.afficherUnString("\n" + animalChoisi.getNom() + " fait : " + animalChoisi.bruit() + "\n");
        } else {
            ConsoleIO.afficherUnString("\nChoix invalide.\n");
        }
    }

    public static Employe creerEmployeUtilisateur() {
        String nom = "";
        String prenom = "";
        int salaire = 0;
        int role = 0;
        Employe employe;

        do {
            ConsoleIO.afficherUnString("Quelle est le nom de votre employé ? ");
            nom = ConsoleIO.demanderUnStringDe(50, 1);
        } while(nom.equals("erreur"));

        do {
            ConsoleIO.afficherUnString("Quelle est le prénom de votre employé ? ");
            prenom = ConsoleIO.demanderUnStringDe(50, 1);
        } while(prenom.equals("erreur"));

        do {
            ConsoleIO.afficherUnString("Quelle est le salaire de votre employé ? ");
            salaire = ConsoleIO.demanderNombre(1000000, 1);
        } while(salaire == 0);

        do {
            ConsoleIO.afficherMenuTypeEmploye();
            role = ConsoleIO.demanderNombre(3, 1);
        } while(role == 0);

        if (role == 1) {
            employe = new Vétérinaire(nom, prenom, salaire);
        } else {
            employe = new Soigneur(nom, prenom, salaire);
        }
        ConsoleIO.afficherUnString("L'employé a bien été ajouté");
        return employe;
    }

    public static Animal creerAnimalUtilisateur() {
        String race = "";
        String nom = "";
        int age = 0;
        EtatSante sante = EtatSante.SAIN;
        String bruit = "";
        String soinQuotidien = "";
        Animal animal;
        int role = 0;

        do {
            ConsoleIO.afficherUnString("Quelle est le nom de votre animal ? ");
            nom = ConsoleIO.demanderUnStringDe(50, 1);
        } while(nom.equals("erreur"));

        do {
            ConsoleIO.afficherUnString("Quelle est l'age de votre animal ? ");
            age = ConsoleIO.demanderNombre(100, 1);
        } while(age == 0);

        do {
            ConsoleIO.afficherMenuTypeAnimaux();
            role = ConsoleIO.demanderNombre(4, 1);
        } while(role == 0);

        if (role == 1) {
            animal = new Chat(race, nom, age, EtatSante.SOIN_INTENSIF, bruit, soinQuotidien);
        } else if (role == 2) {
            animal = new Chien(race, nom, age, EtatSante.SOIN_INTENSIF, bruit, soinQuotidien);
        } else {
            animal = new Lapin(race, nom, age, EtatSante.SOIN_INTENSIF, bruit, soinQuotidien);
        }
        ConsoleIO.afficherUnString("\nL'animal a bien été ajouté");
        return animal;
    }
}