//import java.util.Scanner;

import java.util.ArrayList;

public class ConsoleIO {
    ArrayList<Animal> listeAnimal = new ArrayList<>();
    Chien chien = new Chien("Chien", "Charle", 5, EtatSante.SOIN_INTENSIF, "");
    Chat chat = new Chat("Chat", "Fripouille", 7, EtatSante.SAIN, "");
    Lapin lapin = new Lapin("Lapin", "Panpan", 3, EtatSante.SOIN_LEGER, "");

    ArrayList<Employe> listeEmployes = new ArrayList<>();
    Soigneur soigeur = new Soigneur("Jean", 24, 4500) {
        @Override
        public String effuctuerTache(Animal animal) {
            return "";
        }
    };

    Vétérinaire veterinaire = new Vétérinaire("Janne", 38, 5890) {
        @Override
        public String effuctuerTache(Animal animal) {
            return "";
        }
    };
}