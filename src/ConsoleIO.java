import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleIO {
    private Scanner scanner  = new Scanner(System.in);

    public String lireLigneString() {
        return  scanner.nextLine();
    }

    public int lireLigneInt() {
        int nombre = scanner.nextInt();
        scanner.nextLine();
        return nombre;
    }

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
