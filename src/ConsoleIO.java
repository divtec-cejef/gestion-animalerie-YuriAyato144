import java.util.ArrayList;

public class ConsoleIO {

    public static void afficherAnimaux(ArrayList<Animal> animaux) {
        System.out.println("\nANIMAUX :");
        for (Animal animal : animaux) {
            System.out.println(animal);
        }
    }

    public static void afficherEmployes(ArrayList<Employe> employes) {
        System.out.println("\nEMPLOYÉS :");
        for (Employe employe : employes) {
            System.out.println(employe);
        }
    }
}
