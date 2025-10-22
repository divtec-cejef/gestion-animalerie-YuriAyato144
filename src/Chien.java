public class Chien extends Animal {
    public Chien(String race, String nom, int age, EtatSante sante) {
        super(race, nom, age, sante);
    }


    public String soinQuotidien() {
        return "brosser";
    }


    public String bruit() {
        return "Wouaf";
    }
}
