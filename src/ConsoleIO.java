import java.util.Scanner;
import java.util.ArrayList;

public class ConsoleIO {
    public static void afficherUnString(String StringAAfficher) {
        System.out.println(StringAAfficher);
    }

    public static void afficherMenu() {
        System.out.println("Menu\n" +
                "1) Ajouter un animal\n" +
                "2) Ajouter un employé\n" +
                "3) Afficher tous les employées\n" +
                "4) Afficher tous les animaux\n" +
                "5) Effectuer une tâche (employé)\n" +
                "6) Faire un bruit (Animal)\n" +
                "7) Quitter\n\n" +
                "Que voulez-vous faire ? (1 - 7)\n");
    }

    public static void afficherListeEmployes(ArrayList<Employe> employes) {
        System.out.println("Liste des employés : ");

        if (employes.isEmpty()) {
            System.out.println("Vous n'avez pas employés");
        }
        for (Employe employe: employes) {
            afficherUnString(employe.toString());
        }
    }

    public static void afficherListeAnimaux(ArrayList<Animal> animaux) {
        System.out.println("Liste des animaux : ");

        if (animaux.isEmpty()) {
            System.out.println("Vous n'avez pas d'animaux");
        }
        for (Animal animal: animaux) {
            afficherUnString(animal.toString());
        }
    }

    public static int demanderUnChiffre(int borneSup, int borneInf) {
        Scanner scanner = new Scanner(System.in);
        int choix = 0;

        if (scanner.hasNextInt()) {
            int saisie = scanner.nextInt();
            if (saisie < borneSup &&  borneInf <= saisie) {
                choix = saisie;
            }
        }
        return choix;
    }

    public static String demanderUnStringDe(int CaractereMax, int CaractereMin) {
        Scanner scanner = new Scanner(System.in);
        String ligne =  scanner.nextLine();
        if (ligne.length() < CaractereMax &&  ligne.length() > CaractereMin) {
            return ligne;
        }
        return "erreur";
    }

    public static void afficherMenuTypeEmploye() {
        System.out.println("Quelle est le role de votre employé ? \n" +
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

}
