import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> listeAnimal = new ArrayList<>();
        Chien chien = new Chien("Charle", 5, EtatSante.SAIN);
        Chat chat = new Chat("Fripouille", 7, EtatSante.SAIN);
        Lapin lapin = new Lapin("Panpan", 3, EtatSante.SAIN);

        listeAnimal.add(chien);
        listeAnimal.add(chat);
        listeAnimal.add(lapin);
        for (int afficherAnimal = 0; afficherAnimal < listeAnimal.size(); afficherAnimal++) {
            System.out.println(listeAnimal.get(afficherAnimal));
        }
    }
}