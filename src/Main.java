import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animaux = new ArrayList<>();
        ArrayList<Employe> employes = new ArrayList<>();
        int choixMenuPrincipal = 0;
        do {

            ConsoleIO.afficherMenu();
            choixMenuPrincipal = ConsoleIO.demanderUnChiffre(8, 1);
            switch (choixMenuPrincipal) {
                case 1: animaux.add(creerAnimalUtilisateur()); break;
                case 2: employes.add(creerEmployeUtilisateur()); break;
                case 3: ConsoleIO.afficherListeEmployes(employes); break;
                case 4: ConsoleIO.afficherListeAnimaux(animaux); break;
                case 5: break;
                case 6: break;
            }

        } while (choixMenuPrincipal != 7);
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
            salaire = ConsoleIO.demanderUnChiffre(1000000, 1);
        } while(salaire == 0);

        do {
            ConsoleIO.afficherMenuTypeEmploye();
            role = ConsoleIO.demanderUnChiffre(3, 1);
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
        String nom = "";
        int age = 0;
        Animal animal;
        int role = 0;
        do {
            ConsoleIO.afficherUnString("Quelle est le nom de votre animal ? ");
            nom = ConsoleIO.demanderUnStringDe(50, 1);
        } while(nom.equals("erreur"));

        do {
            ConsoleIO.afficherUnString("Quelle est l'age de votre animal ? ");
            age = ConsoleIO.demanderUnChiffre(100, 1);
        } while(age == 0);

        do {
            ConsoleIO.afficherMenuTypeAnimaux();
            role = ConsoleIO.demanderUnChiffre(4, 1);
        } while(role == 0);

        if (role == 1) {
            animal = new Chat(nom, age, EtatSante.SOIN_INTENSIF);
        } else if (role == 2) {
            animal = new Chien(nom, age, EtatSante.SOIN_INTENSIF);
        } else {
            animal = new Lapin(nom, age, EtatSante.SOIN_INTENSIF);
        }
        ConsoleIO.afficherUnString("L'animal a bien été ajouté");
        return animal;
    }
}