public class Chien extends Animal {
    public Chien(String race, String nom, int age, EtatSante sante, String bruit, String soinQuotidien) {
        super(race, nom, age, sante, bruit, soinQuotidien);
    }

    @Override
    public String soinQuotidien() {
        return "se faire promener";
    }

    @Override
    public String bruit() {
        return "wouaf";
    }
}
