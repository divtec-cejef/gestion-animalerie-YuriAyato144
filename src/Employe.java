public abstract class Employe {
    private  String nom;
    private  String prenom;
    private  String role;
    private final int age;
    private int salaire;

    public Employe(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.role = role;
        this.age = age;
        this.salaire = salaire;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public abstract void effectuerTache(Animal animal);


    public String toString() {
        return "Nom : " + this.nom + "\n"
                + "Prenom : " + this.prenom + "\n"
                + "Role : " + this.role + "\n"
                + "Âge : " + this.age + " ans\n"
                + "Salaire : " + this.salaire + ".-" + "\n";
    }

}
