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

    public String soignerAnimaux(ArrayList<Animal> animaux) {
        int nombreSoignes = 0;
        StringBuilder resultat = new StringBuilder();

        for (Animal animal : animaux) {
            if (animal.getSante() != EtatSante.SAIN) {
                animal.soigner();
                resultat.append(animal.getNom()).append(" (").append(animal.getRace()).append(") a été soigné. Nouvel état : ").append(animal.getSante()).append("\n");
                nombreSoignes++;
            } else {
                resultat.append(animal.getNom()).append(" (").append(animal.getRace()).append(") est déjà en pleine santé !\n");
            }
        }
        resultat.append("\nTotal d'animaux à soignés : ").append(nombreSoignes).append("/").append(animaux.size());
        return resultat.toString();
    }
}