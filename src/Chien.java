public class Chien extends Animal {
    public Chien(String race, String nom, int age, EtatSante sante, String bruit, String soinQuotidien) {
        super(race = "chien", nom, age, sante, bruit, soinQuotidien);
    }

    @Override
    public String soinQuotidien(Employe employe) {
        return this.getNom() + " se fait promener";
    }

    @Override
    public String bruit() {
        return "wouaf";
    }
}
