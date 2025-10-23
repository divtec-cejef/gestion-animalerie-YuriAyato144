import java.util.ArrayList;

public class ConsoleIO {
    ArrayList<Animal> listeAnimal = new ArrayList<>();
    Chien chien = new Chien("chien", "Charle", 5, EtatSante.SOIN_LEGER, "", "");
    Chat chat = new Chat("chat", "Fripouille", 7, EtatSante.SAIN, "", "");
    Lapin lapin = new Lapin("lapin", "Panpan", 3, EtatSante.SOIN_INTENSIF, "", "");

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

    public String soignerAnimaux() {
        String animauxMalades = "";

        for (Animal animal : listeAnimal) {
            if (animal.getSante() != EtatSante.SAIN) {
                animauxMalades += "Le " + animal.getRace()
                        + " " + animal.getNom() + " est en : "
                        + animal.getSante() + "\n";
            }
        }

        if (animauxMalades.isEmpty()) {
            return "Tous les animaux sont à leur santé maximale ! ☺";
        } else {
            return "Animaux nécessitant des soins :\n" + animauxMalades;
        }
    }
}