import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animal = new ArrayList<>();
        ArrayList<Employe> employes = new ArrayList<>();
        int choixMenuPrincipal;
        do {
            ConsoleIO.afficherMenu();
            choixMenuPrincipal = ConsoleIO.demanderNombre(9, 1);
            switch (choixMenuPrincipal) {
                case 1:
                    animal.add(creerAnimal());
                    break;
                case 2:
                    employes.add(creerEmployer());
                    break;
                case 3:
                    ConsoleIO.afficherListeEmployes(employes);
                    break;
                case 4:
                    ConsoleIO.afficherListeAnimaux(animal);
                    break;
                case 5:
                    effectuerSoinQuotidien(animal, employes);
                    break;
                case 6:
                    ConsoleIO.faireBruitAnimal(animal);
                    break;
                case 7:
                    inscriptionConcours(animal);
                    break;
            }
        } while (choixMenuPrincipal != 8);
    }

    public static void effectuerSoinQuotidien(ArrayList<Animal> animaux, ArrayList<Employe> employes) {
        if (animaux.isEmpty()) {
            ConsoleIO.afficherUnString("\nVous n'avez pas d'animaux à soigner.\n");
            return;
        }

        if (employes.isEmpty()) {
            ConsoleIO.afficherUnString("\nVous n'avez pas d'employés pour effectuer les soins.\n");
            return;
        }

        // Sélection de l'animal
        ConsoleIO.afficherUnString("\nSélectionnez un animal :\n");
        for (int i = 0; i < animaux.size(); i++) {
            Animal animal = animaux.get(i);
            ConsoleIO.afficherUnString((i + 1) + ") " + animal.getNom() + " - santé : " + animal.getSante());
        }

        ConsoleIO.afficherUnString("\nChoisissez un animal (1 - " + animaux.size() + ") : ");
        int choixAnimal = ConsoleIO.demanderNombre(animaux.size() + 1, 1);

        if (choixAnimal == 0) {
            ConsoleIO.afficherUnString("\nChoix invalide.\n");
            return;
        }

        Animal animalChoisi = animaux.get(choixAnimal - 1);

        // Menu pour choisir le type d'action
        ConsoleIO.afficherUnString("\nQue voulez-vous faire ?\n");
        ConsoleIO.afficherUnString("1) Soigner l'animal (Vétérinaire)\n");
        ConsoleIO.afficherUnString("2) Effectuer un soin quotidien (Soigneur)\n");
        ConsoleIO.afficherUnString("\nChoisissez une action (1 - 2) : ");
        int choixAction = ConsoleIO.demanderNombre(3, 1);

        if (choixAction == 0) {
            ConsoleIO.afficherUnString("\nChoix invalide.\n");
            return;
        }

        if (choixAction == 1) {
            // Soigner avec un vétérinaire
            ArrayList<Employe> veterinaires = new ArrayList<>();
            for (Employe employe : employes) {
                if (employe instanceof Veterinaire) {
                    veterinaires.add(employe);
                }
            }

            if (veterinaires.isEmpty()) {
                ConsoleIO.afficherUnString("\nVous n'avez pas de vétérinaire disponible.\n");
                return;
            }

            ConsoleIO.afficherUnString("\nSélectionnez un vétérinaire :\n");
            for (int i = 0; i < veterinaires.size(); i++) {
                Employe vet = veterinaires.get(i);
                ConsoleIO.afficherUnString((i + 1) + ") " + vet.getPrenom() + " " + vet.getNom());
            }

            ConsoleIO.afficherUnString("\nChoisissez un vétérinaire (1 - " + veterinaires.size() + ") : ");
            int choixVet = ConsoleIO.demanderNombre(veterinaires.size() + 1, 1);

            if (choixVet == 0) {
                ConsoleIO.afficherUnString("\nChoix invalide.\n");
                return;
            }

            Employe veterinaireChoisi = veterinaires.get(choixVet - 1);
            ConsoleIO.afficherUnString("\n" + veterinaireChoisi.getPrenom() + " " + veterinaireChoisi.getNom() +
                    " soigne " + animalChoisi.getNom() + ".\n");

            veterinaireChoisi.effectuerTache(animalChoisi);

        } else if (choixAction == 2) {
            // Soin quotidien avec un soigneur
            ArrayList<Employe> soigneurs = new ArrayList<>();
            for (Employe employe : employes) {
                if (employe instanceof Soigneur) {
                    soigneurs.add(employe);
                }
            }

            if (soigneurs.isEmpty()) {
                ConsoleIO.afficherUnString("\nVous n'avez pas de soigneur disponible.\n");
                return;
            }

            ConsoleIO.afficherUnString("\nSélectionnez un soigneur :\n");
            for (int i = 0; i < soigneurs.size(); i++) {
                Employe soigneur = soigneurs.get(i);
                ConsoleIO.afficherUnString((i + 1) + ") " + soigneur.getPrenom() + " " + soigneur.getNom());
            }

            ConsoleIO.afficherUnString("\nChoisissez un soigneur (1 - " + soigneurs.size() + ") : ");
            int choixSoigneur = ConsoleIO.demanderNombre(soigneurs.size() + 1, 1);

            if (choixSoigneur == 0) {
                ConsoleIO.afficherUnString("\nChoix invalide.\n");
                return;
            }

            Employe soigneurChoisi = soigneurs.get(choixSoigneur - 1);
            String soin = animalChoisi.soinQuotidien(soigneurChoisi);
            soigneurChoisi.effectuerTache(animalChoisi);
            ConsoleIO.afficherUnString("\n" + soigneurChoisi.getPrenom() + " " + soigneurChoisi.getNom() +
                    " s'occupe de " + animalChoisi.getNom() + " (" + soin + ").\n");
        }
    }


    public static Employe creerEmployer() {
        String nom;
        String prenom;
        int age = 0;
        int salaire;
        int role;
        Employe employe;

        do {
            ConsoleIO.afficherUnString("Quel est le nom de votre employé ? ");
            nom = ConsoleIO.demanderUnStringLimite(100, 1);
        } while (nom.equals("erreur"));

        do {
            ConsoleIO.afficherUnString("Quel est le prénom de votre employé ? ");
            prenom = ConsoleIO.demanderUnStringLimite(100, 1);
        } while (prenom.equals("erreur"));

        do {
            ConsoleIO.afficherUnString("Quel est le salaire de votre employé ? ");
            salaire = ConsoleIO.demanderNombre(1000000, 1);
        } while (salaire == 0);

        do {
            ConsoleIO.afficherMenuTypeEmploye();
            role = ConsoleIO.demanderNombre(3, 1);
        } while (role == 0);

        switch (role) {
            case 1:
                employe = new Veterinaire(nom, prenom, age, role, salaire);
                break;
            case 2:
                employe = new Soigneur(nom, prenom, age, role, salaire);
                break;
            default:
                ConsoleIO.afficherUnString("Choix invalide, création annulée.");
                return null;
        }

        ConsoleIO.afficherUnString("L'employé a bien été ajouté\n");
        return employe;
    }


    public static Animal creerAnimal() {
        String race = "";
        String nom;
        int age;
        String bruit = "";
        String soinQuotidien = "";
        Animal animal;
        int role;

        do {
            ConsoleIO.afficherUnString("Quel est le nom de votre animal ? ");
            nom = ConsoleIO.demanderUnStringLimite(100, 1);
        } while (nom.equals("erreur"));

        do {
            ConsoleIO.afficherUnString("Quel est l'âge de votre animal ? ");
            age = ConsoleIO.demanderNombre(50, 1);
        } while (age == 0);

        do {
            ConsoleIO.afficherMenuTypeAnimaux();
            role = ConsoleIO.demanderNombre(4, 1);
        } while (role == 0);

        switch (role) {
            case 1:
                animal = new Chat(race, nom, age, EtatSante.SOIN_LEGER, bruit, soinQuotidien);
                break;
            case 2:
                animal = new Chien(race, nom, age, EtatSante.SAIN, bruit, soinQuotidien);
                break;
            case 3:
                animal = new Lapin(race, nom, age, EtatSante.SOIN_LEGER, bruit, soinQuotidien);
                break;
            default:
                ConsoleIO.afficherUnString("Choix invalide, création annulée.");
                return null;
        }

        ConsoleIO.afficherUnString("\nL'animal a bien été ajouté\n");
        return animal;
    }

    public static void inscriptionConcours(ArrayList<Animal> animaux) {
        ConsoleIO.afficherUnString("Nom du concours :");
        ConsoleIO.afficherUnString(Concours.nomConcours("Woof Land\n"));
        ConsoleIO.afficherUnString("Lieux du concours :");
        ConsoleIO.afficherUnString(Concours.lieuxConcours("Suisse\n"));
        ConsoleIO.afficherUnString("Animaux pouvant participer au concours :\n");

        // Collecter les animaux sains
        ArrayList<Animal> animauxSains = new ArrayList<>();
        for (Animal animal : animaux) {
            if (animal.getSante() == EtatSante.SAIN) {
                animauxSains.add(animal);
            }
        }

        // Vérifier s'il y a des animaux sains
        if (animauxSains.isEmpty()) {
            ConsoleIO.afficherUnString("Aucun animal ne peut participer\n");
        } else {
            // Afficher la liste des animaux sains
            for (int i = 0; i < animauxSains.size(); i++) {
                ConsoleIO.afficherUnString((i + 1) + ") " + animauxSains.get(i).getNom() + "\n");
            }

            // Demander la sélection
            ConsoleIO.afficherUnString("Quel animal voulez-vous ajouter au concours ? (1 - " + animauxSains.size() + ")");
            ConsoleIO.demanderNombre(animauxSains.size(), 1);
        }
    }
}