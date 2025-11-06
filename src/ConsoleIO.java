import java.util.Scanner;
import java.util.ArrayList;

public class ConsoleIO {
    public static void afficherUnString(String StringAAfficher) {
        System.out.println(StringAAfficher);
    }

    public static void afficherMenu() {
        System.out.println("MENU\n\n" +
                "1) Ajouter un animal\n" +
                "2) Ajouter un employé\n" +
                "3) Afficher tous les employés\n" +
                "4) Afficher tous les animaux\n" +
                "5) Effectuer une tâche (employé)\n" +
                "6) Faire un bruit (animal)\n" +
                "7) S'inscrire à un concours\n" +
                "8) Arrêter le programme\n\n" +
                "Que voulez-vous faire ? (1 - 8)");
    }

    public static void afficherListeEmployes(ArrayList<Employe> employes) {
        System.out.println("Liste des employés : \n");

        if (employes.isEmpty()) {
            System.out.println("Vous n'avez pas employés\n");
        }
        for (Employe employe : employes) {
            afficherUnString(employe.toString());
        }
    }

    public static void afficherListeAnimaux(ArrayList<Animal> animaux) {
        System.out.println("Liste des animaux : \n");

        if (animaux.isEmpty()) {
            System.out.println("Vous n'avez pas d'animaux\n");
        }
        for (Animal animal : animaux) {
            afficherUnString(animal.toString());
        }
    }

    public static int demanderNombre(int borneSup, int borneInf) {
        Scanner scanner = new Scanner(System.in);
        int choix = 0;

        if (scanner.hasNextInt()) {
            int saisie = scanner.nextInt();
            if (saisie < borneSup && borneInf <= saisie) {
                choix = saisie;
            }
        }
        return choix;
    }

    public static String demanderUnStringLimite(int CaractereMax, int CaractereMin) {
        Scanner scanner = new Scanner(System.in);
        String ligne = scanner.nextLine();
        if (ligne.length() < CaractereMax && ligne.length() > CaractereMin) {
            return ligne;
        }
        return "erreur";
    }

    public static void afficherMenuTypeEmploye() {
        System.out.println("Quelle est le role de votre employé ?\n" +
                "1) Vétérinaire \n" +
                "2) Soigneur \n\n" +
                "Sélectioner (1 ou 2) : ");
    }

    public static void afficherMenuTypeAnimaux() {
        System.out.println("Quelle espèce d'animaux souhaitez-vous choisir ?\n" +
                "1) Chat \n" +
                "2) Chien \n" +
                "3) Lapin \n\n" +
                "Sélectioner (1 - 3) : ");
    }

    public static void faireBruitAnimal(ArrayList<Animal> animaux) {
        if (animaux.isEmpty()) {
            afficherUnString("\nVous n'avez pas d'animaux pour faire du bruit.\n");
            return;
        }

        afficherUnString("\nSélectionnez un animal pour entendre son bruit :\n");

        for (int i = 0; i < animaux.size(); i++) {
            Animal animal = animaux.get(i);
            afficherUnString((i + 1) + ") " + animal.getNom() + " (" + animal.getRace() + ")");
        }
        afficherUnString("\nChoisissez un animal (1 - " + animaux.size() + ") : ");
        int choix = ConsoleIO.demanderNombre(animaux.size() + 1, 1);

        if (choix != 0) {
            Animal animalChoisi = animaux.get(choix - 1);
            afficherUnString("\n" + animalChoisi.getNom() + " fait : " + animalChoisi.bruit() + "\n");
        } else {
            afficherUnString("\nChoix invalide.\n");
        }
    }
}
