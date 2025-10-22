public class Lapin extends Animal {
    public Lapin(String race, String nom, int age, EtatSante sante, String bruit, String soinQuotidien) {
        super(race, nom, age, sante, bruit, soinQuotidien);
    }


    public String soinQuotidien() {
        return "manger des carottes";
    }


    public String bruit() {
        return "IIIIIIIIIIIIIH (selon ChatGPT)";
    }
}
