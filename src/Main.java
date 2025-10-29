public class Main {
    public static void main(String[] args) {
        ConsoleIO consoleIO = new ConsoleIO();

        consoleIO.listeAnimal.add(consoleIO.chien);
        consoleIO.listeAnimal.add(consoleIO.chat);
        consoleIO.listeAnimal.add(consoleIO.lapin);
        consoleIO.listeAnimal.add(consoleIO.chien2);
        System.out.println("ANIMAUX : \n");

        for (int afficherAnimal = 0; afficherAnimal < consoleIO.listeAnimal.size(); afficherAnimal++) {
            System.out.println(consoleIO.listeAnimal.get(afficherAnimal));
        }

        consoleIO.listeEmployes.add(consoleIO.soigneur);
        consoleIO.listeEmployes.add(consoleIO.veterinaire);
        System.out.println("EMPLOYER : \n");

        for (int afficherEmployees = 0; afficherEmployees < consoleIO.listeEmployes.size(); afficherEmployees++) {
            System.out.println(consoleIO.listeEmployes.get(afficherEmployees));
        }
        boolean veterinairePresent = false;
        for (Employe e : consoleIO.listeEmployes) {
            if (e instanceof Vétérinaire) {
                veterinairePresent = true;
                break;
            }
        }

        if (veterinairePresent) {
            System.out.println(consoleIO.santeAnimaux());
            consoleIO.menuSoins();
        } else {
            System.out.println("Aucun vétérinaire présent !");
            System.out.println("Impossible d'administrer des soins sans vétérinaire...");
        }
    }
}