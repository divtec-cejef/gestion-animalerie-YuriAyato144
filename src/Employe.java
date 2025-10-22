public abstract class Employe {
    private final String metier;
    private final String nom;
    private final int age;
    private final int salaire;
    private final String role;

    public Employe(String metier, String nom, int age, int salaire, String role) {
        this.metier = metier;
        this.nom = nom;
        this.age = age;
        this.salaire = salaire;
        this.role = role;
    }

    public abstract String effuctuerTache(Animal animal);

    public String toString() {
        return "Métier : " + this.metier + "\n" + "Nom : " + this.nom + "\n" + "Âge : " + this.age + " ans\n" + "Salaire : " + this.salaire + ".-" + "\n" + "Role : " + this.role + "\n";
    }
}
