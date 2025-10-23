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

        for (int i = 0; i < listeAnimal.toArray().length; i++) {
            if (listeAnimal.get(i).getSante() != EtatSante.SAIN) {
                animauxMalades += "Le " + listeAnimal.get(i).getRace()
                        + " " + listeAnimal.get(i).getNom() + " est en : "
                        + listeAnimal.get(i).getSante() + "\n";
            }
        }

        if (animauxMalades.isEmpty()) {
            return "Tous les animaux sont à leur santé maximale ! ☺";
        } else {
            return "Animaux nécessitant des soins :\n" + animauxMalades;
        }
    }
}