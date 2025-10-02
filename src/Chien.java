public class Chien extends Animal {
    public Chien(String nom, int age, EtatSante sante) {
        super(nom, age, sante);
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
