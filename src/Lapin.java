public class Lapin extends Animal {
    public Lapin(String race, String nom, int age, EtatSante sante) {
        super(race, nom, age, sante);
    }


    public String soinQuotidien() {
        return "le manger";
    }


    public String bruit() {
        return "IIIIIIIIIIIIIH (selon ChatGPT)";
    }
}
