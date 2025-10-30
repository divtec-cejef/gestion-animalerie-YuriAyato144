import java.sql.SQLOutput;

public class Soigneur extends Employe {

    public Soigneur(String nom, String prenom, String role, int age, int salaire) {
        super(nom, prenom, role, age, salaire);
    }

    @Override
    public void effectuerTache(Animal animal) {
        System.out.println(animal.getNom());
    }

}