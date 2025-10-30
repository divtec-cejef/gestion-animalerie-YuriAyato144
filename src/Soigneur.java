public class Soigneur extends Employe {

    public Soigneur(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    @Override
    public void effectuerTache(Animal animal) {
        System.out.println();
    }

}