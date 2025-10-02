public class Lapin extends Animal {
    public Lapin(String nom, int age, EtatSante sante) {
        super(nom, age, sante);
    }

    @Override
    public String soinQuotidien() {
        return "le manger";
    }

    @Override
    public  String bruit() {
        return "IIIIIIIIIIIIIH (selon ChatGPT)";
    }
}
