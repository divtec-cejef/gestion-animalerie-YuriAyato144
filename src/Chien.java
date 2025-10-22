public class Chien extends Animal {
    public Chien(String race, String nom, int age, EtatSante sante, String bruit) {
        super(race, nom, age, sante, bruit);
    }

    @Override
    public String soinQuotidien() {
        return "brosser";
    }

    @Override
    public String bruit() {
        return "Wouaf";
    }
}
