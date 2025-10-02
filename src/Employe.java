public abstract class Employe {
    private String nom;
    private int age;
    private int salaire;
    private String role;

    public Employe(String nom, int age, int salaire, String role) {
        this.nom = nom;
        this.age = age;
        this.salaire = salaire;
        this.role = role;
    }

    public abstract void effuctuerTache();

    public String toString() {
        return nom + " " + age + " " + salaire + " " + role;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
