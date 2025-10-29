import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleIO {
    ArrayList<Animal> listeAnimal = new ArrayList<>();
    Chien chien = new Chien("chien", "Charle", 5, EtatSante.SOIN_LEGER, "", "");
    Chat chat = new Chat("chat", "Fripouille", 7, EtatSante.SAIN, "", "");
    Lapin lapin = new Lapin("lapin", "Panpan", 3, EtatSante.SOIN_INTENSIF, "", "");
    Chien chien2 = new Chien("chien", "Cookie", 4, EtatSante.SOIN_LEGER, "", "");

    ArrayList<Employe> listeEmployes = new ArrayList<>();
    Soigneur soigeur = new Soigneur("Jean", "Heude", "soigneur", 24, 4593) {

        @Override
        public String effectuerTache(Animal animal) {
            return "";
        }
    };

    Vétérinaire veterinaire = new Vétérinaire("Elleestou", "Janne", "vétérinaire", 38, 5891) {

        @Override
        public String effectuerTache(Animal animal) {
            return "";
        }
    };

    public String santeAnimaux() {
        StringBuilder animauxMalades = new StringBuilder();

        for (int i = 0; i < listeAnimal.toArray().length; i++) {
            if (listeAnimal.get(i).getSante() != EtatSante.SAIN) {
                animauxMalades.append("Le ").append(listeAnimal.get(i).getRace()).append(" ").append(listeAnimal.get(i).getNom()).append(" est en ").append(listeAnimal.get(i).getSante()).append("\n");
            }
        }

        if (animauxMalades.isEmpty()) {
            return "Tous les animaux sont à leur santé maximale ! ☺";
        } else {
            return "Animaux nécessitant des soins :\n" + animauxMalades;
        }
    }

    Scanner scanner = new Scanner(System.in);

    public void menuSoins() {
        boolean continuer = true;

        while (continuer) {
            afficherListeAnimaux();

            System.out.println("\nChoisir un animal à soigner (0 pour quitter) : ");

            int choix = scanner.nextInt();

            if (choix == 0) {
                System.out.println("Soin fini pour aujourd'hui.");
                continuer = false;
            } else if (choix < 1 || choix > listeAnimal.size()) {
                System.out.println("Numéro invalide !");
            } else {
                Animal animalChoisi = listeAnimal.get(choix - 1);
                soignerUnAnimal(animalChoisi);
            }
        }
    }

    private void afficherListeAnimaux() {
        for (int i = 0; i < listeAnimal.size(); i++) {
            Animal animal = listeAnimal.get(i);
            String statut = (animal.getSante() == EtatSante.SAIN) ? "✓" : "×";
            System.out.println(statut + " " + (i + 1) + " - " + animal.getNom()
                    + " : " + animal.getSante());
        }
    }

    private void soignerUnAnimal(Animal animal) {
        if (animal.getSante() == EtatSante.SAIN) {
            System.out.println("✓ " + animal.getNom() + " est déjà en pleine santé !");
            return;
        }

        System.out.println("État actuel : " + animal.getSante());
        System.out.println("\n1 - Soigner jusqu'à l'état de santé supérieur");
        System.out.println("2 - Soigner jusqu'à l'état de santé " + EtatSante.SAIN);
        System.out.print("Votre choix : ");

        int choix = scanner.nextInt();

        if (choix == 1) {
            administrerUnSoin(animal);
        } else if (choix == 2) {
            soignerJusquaGuerison(animal);
        } else {
            System.out.println("Choix invalide !");
        }
    }

    private void administrerUnSoin(Animal animal) {
        EtatSante avantSoin = animal.getSante();
        animal.soigner();

        System.out.println("\n✓ Soin administré à " + animal.getNom());
        System.out.println("  " + avantSoin + " → " + animal.getSante());

        if (animal.getSante() != EtatSante.SAIN) {
            System.out.println("\n× Nécessite encore des soins\n");
        } else {
            System.out.println("\n✓ En pleine santé !\n");
        }
    }

    private void soignerJusquaGuerison(Animal animal) {
        int nombreSoins = 0;

        while (animal.getSante() != EtatSante.SAIN) {
            nombreSoins++;
            EtatSante avantSoin = animal.getSante();
            animal.soigner();
            System.out.println("Soin #" + nombreSoins + " : " + avantSoin + " → " + animal.getSante());
        }

        System.out.println("\n✓ " + animal.getNom() + " est guéri !\n");
        System.out.println("Nombre de soins : " + nombreSoins);
    }
}
