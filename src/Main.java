import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Employe> listeEmployes = new ArrayList<>();
    public static ArrayList<Animal> listeAnimaux = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("AJOUT D'EMPLOYÉS :");
        System.out.print("Combien d'employés voulez-vous ajouter ? ");
        int nbEmployes = sc.nextInt();
        sc.nextLine(); // vide la ligne

        for (int ajoutEmployer = 0; ajoutEmployer < nbEmployes; ajoutEmployer++) {
            System.out.println("\nEmployé " + (ajoutEmployer + 1));
            System.out.print("Prénom : ");
            String prenom = sc.nextLine();

            System.out.print("Nom : ");
            String nom = sc.nextLine();

            System.out.print("Poste (soigneur / vétérinaire) : ");
            String poste = sc.nextLine();

            System.out.print("Âge : ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Salaire : ");
            int salaire = sc.nextInt();
            sc.nextLine();

            if (poste.equalsIgnoreCase("soigneur")) {
                Soigneur soigneur = new Soigneur(prenom, nom, poste, age, salaire) {
                    @Override
                    public String effectuerTache(Animal animal) {
                        return "Soigne " + animal.getNom();
                    }
                };
                listeEmployes.add(soigneur);
            } else {
                Vétérinaire veterinaire = new Vétérinaire(prenom, nom, poste, age, salaire) {
                    @Override
                    public String effectuerTache(Animal animal) {
                        return "Examine " + animal.getNom();
                    }
                };
                listeEmployes.add(veterinaire);
            }
        }

        System.out.println("\nAJOUT D'ANIMAUX :");
        System.out.print("Combien d'animaux voulez-vous ajouter ? ");
        int nbAnimaux = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < nbAnimaux; i++) {
            System.out.println("\nAnimal #" + (i + 1));
            System.out.print("Espèce (chien / chat / lapin) : ");
            String espece = sc.nextLine();

            System.out.print("Nom : ");
            String nom = sc.nextLine();

            System.out.print("Âge : ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("État de santé (sain / soin léger / soin intensif) : ");
            String etat = sc.nextLine().toUpperCase();
            EtatSante etatSante = EtatSante.valueOf(etat);

            Animal animal = null;

            switch (espece.toLowerCase()) {
                case "chien":
                    animal = new Chien(espece, nom, age, etatSante, "", "");
                    break;
                case "chat":
                    animal = new Chat(espece, nom, age, etatSante, "", "");
                    break;
                case "lapin":
                    animal = new Lapin(espece, nom, age, etatSante, "", "");
                    break;
                default:
                    System.out.println("Espèce non reconnue, l'animal ne sera pas ajouté.");
                    continue;
            }

            listeAnimaux.add(animal);
        }

        sc.close();

        ConsoleIO.afficherEmployes(listeEmployes);
        ConsoleIO.afficherAnimaux(listeAnimaux);
    }
}
