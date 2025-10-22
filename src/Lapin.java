public class Lapin extends Animal {
    public Lapin(String race, String nom, int age, EtatSante sante, String bruit) {
        super(race, nom, age, sante, bruit);
    }


    public String soinQuotidien() {
        return "le manger";
    }


    public String bruit() {
        return "IIIIIIIIIIIIIH (selon ChatGPT)";
    }
}
