public abstract class Employe {
    private final String nom;
    private final String prenom;
    private final String role;
    private final int age;
    private final int salaire;

    public Employe(String nom, String prenom, String role, int age, int salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.role = role;
        this.age = age;
        this.salaire = salaire;

    }

    public abstract String effectuerTache(Animal animal);

    public String toString() {
        return "Nom : " + this.nom + "\n"
                + "Prenom : " + this.prenom + "\n"
                +  "Role : " + this.role + "\n"
                + "Âge : " + this.age + " ans\n"
                + "Salaire : " + this.salaire + ".-" + "\n";
    }

}
