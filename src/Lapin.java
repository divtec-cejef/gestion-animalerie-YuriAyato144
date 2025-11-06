public class Lapin extends Animal {
    public Lapin(String race, String nom, int age, EtatSante sante, String bruit, String soinQuotidien) {
        super(race, nom, age, sante, bruit, soinQuotidien);
    }

    @Override
    public String soinQuotidien(Employe employe) {
        return this.getNom() + " mange une carottes";
    }


    public String bruit() {
        return "IIIIIIIIIIIIIH (selon ChatGPT)";
    }
}
