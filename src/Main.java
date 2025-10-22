public class Main {
    public static void main(String[] args) {
        ConsoleIO consoleIO = new ConsoleIO();
        consoleIO.listeAnimal.add(consoleIO.chien);
        consoleIO.listeAnimal.add(consoleIO.chat);
        consoleIO.listeAnimal.add(consoleIO.lapin);
        System.out.println("Animaux : \n");
        for (int afficherAnimal = 0; afficherAnimal < consoleIO.listeAnimal.size(); afficherAnimal++) {
            System.out.println(consoleIO.listeAnimal.get(afficherAnimal));
        }

        consoleIO.listeEmployes.add(consoleIO.soigeur);
        consoleIO.listeEmployes.add(consoleIO.veterinaire);
        System.out.println("Employes : \n");
        for (int afficherEmployees = 0; afficherEmployees < consoleIO.listeEmployes.size(); afficherEmployees++) {
            System.out.println(consoleIO.listeEmployes.get(afficherEmployees));
        }
    }
}