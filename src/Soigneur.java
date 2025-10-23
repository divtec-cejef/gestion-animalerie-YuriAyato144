public abstract class Soigneur extends Employe {
    public Soigneur(String nom, String prenom, String role, int age, int salaire) {
        super(nom, prenom, role, age, salaire);
    }

    public String effuctuerTache(Animal animal) {
        return "";
    }
}