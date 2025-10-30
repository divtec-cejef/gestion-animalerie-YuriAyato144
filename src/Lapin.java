public class Lapin extends Animal {
    public Lapin(String race, int age, EtatSante sante) {
        super(race, nom, age, sante, bruit, soinQuotidien);
    }

    @Override
    public String soinQuotidien(Employe employe) {
        return "manger des carottes";
    }


    public String bruit() {
        return "IIIIIIIIIIIIIH (selon ChatGPT)";
    }
}
