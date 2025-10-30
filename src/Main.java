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
        sc.nextLine(); // vide le buffer

        for (int ajoutEmployer = 0; ajoutEmployer < nbEmployes; ajoutEmployer++) {
            System.out.println("\nEmployé " + (ajoutEmployer + 1));
            System.out.print("Prénom : ");
            String prenom = sc.nextLine();

            System.out.print("Nom : ");
            String nom = sc.nextLine();

            System.out.print("Poste (1 -> soigneur / 2 -> vétérinaire) : ");
            int choixPoste = sc.nextInt();
            sc.nextLine();

            System.out.print("Âge : ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Salaire : ");
            int salaire = sc.nextInt();
            sc.nextLine();

            String poste = (choixPoste == 1) ? "soigneur" : "vétérinaire";

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
            System.out.println("\nAnimal " + (i + 1));

            System.out.println("Choisissez l'espèce :");
            System.out.println("1 -> Chien");
            System.out.println("2 -> Chat");
            System.out.println("3 -> Lapin");
            System.out.print("Votre choix : ");
            int choixEspece = sc.nextInt();
            sc.nextLine();

            String espece;
            switch (choixEspece) {
                case 1:
                    espece = "chien";
                    break;
                case 2:
                    espece = "chat";
                    break;
                case 3:
                    espece = "lapin";
                    break;
                default:
                    System.out.println("Choix invalide, l'animal ne sera pas ajouté.");
                    continue;
            }

            System.out.print("Nom : ");
            String nom = sc.nextLine();

            System.out.print("Âge : ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println("État de santé :");
            System.out.println("1 -> SAIN");
            System.out.println("2 -> SOIN LEGER");
            System.out.println("3 -> SOIN INTENSIF");
            System.out.print("Votre choix : ");
            int choixEtat = sc.nextInt();
            sc.nextLine();

            EtatSante etatSante;
            switch (choixEtat) {
                case 1:
                    etatSante = EtatSante.SAIN;
                    break;
                case 2:
                    etatSante = EtatSante.SOIN_LEGER;
                    break;
                case 3:
                    etatSante = EtatSante.SOIN_INTENSIF;
                    break;
                default:
                    System.out.println("Choix invalide, état par défaut : SAIN");
                    etatSante = EtatSante.SAIN;
            }

            Animal animal = null;

            switch (espece) {
                case "chien":
                    animal = new Chien(espece, nom, age, etatSante, "", "");
                    break;
                case "chat":
                    animal = new Chat(espece, nom, age, etatSante, "", "");
                    break;
                case "lapin":
                    animal = new Lapin(espece, nom, age, etatSante, "", "");
                    break;
            }

            listeAnimaux.add(animal);
        }

        sc.close();

        ConsoleIO.afficherEmployes(listeEmployes);
        ConsoleIO.afficherAnimaux(listeAnimaux);
    }
}
