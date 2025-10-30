public class Chien extends Animal {
    public Chien(String race, int age, EtatSante sante) {
        super(race, nom, age, sante, bruit, soinQuotidien);
    }

    @Override
    public String soinQuotidien(Employe employe) {
        return "se faire promener";
    }

    @Override
    public String bruit() {
        return "wouaf";
    }
}
