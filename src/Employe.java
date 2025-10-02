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

}

//TODO : attributs privés, méthode toString, getters/setters, constructeur, méthodes abstraites (effectuerTache)
