public class Soigneur extends Employe {

    public Soigneur(String nom, String prenom, int age, int role, int salaire) {
        super(nom, prenom, age, role, salaire);
    }

    @Override
    public void effectuerTache(Animal animal) {
        System.out.println("Le soigneur effectue le soin quotidien de l'animal.");
    }
}