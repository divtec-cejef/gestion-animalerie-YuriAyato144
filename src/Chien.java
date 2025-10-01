public class Chien extends Animal {
    public Chien(String nom, int age, String sante) {
        super(nom, age, sante);
    }

    @Override
    public void soinQuotidien() {
    }

    @Override
    public String bruit() {
        return "Waf";
    }
}
