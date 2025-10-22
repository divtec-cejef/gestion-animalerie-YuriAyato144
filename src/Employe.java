public abstract class Employe {
    private final String nom;
    private final int age;
    private final int salaire;

    public Employe(String nom, int age, int salaire) {
        this.nom = nom;
        this.age = age;
        this.salaire = salaire;
    }

    public abstract String effuctuerTache(Animal animal);

    public String toString() {
        return "Nom : " + this.nom + "\n" + "Âge : " + this.age + " ans\n" + "Salaire : " + this.salaire + ".-" + "\n";
    }
}
