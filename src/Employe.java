public abstract class Employe {
    private String diplome;
    private String nom;
    private int age;
    private int salaire;
    private String role;

    public Employe(String diplome, String nom, int age, int salaire, String role) {
        this.diplome = diplome;
        this.nom = nom;
        this.age = age;
        this.salaire = salaire;
        this.role = role;
    }

    public abstract String effuctuerTache();

    public String toString() {
        return "Diplome : " + this.diplome + "\n" + "Nom : " + this.nom + "\n" + "Âge : " + this.age + " ans\n" + "Salaire : " + this.salaire + ".-" + "\n" + "Role : " + this.role + "\n";
    }
}
