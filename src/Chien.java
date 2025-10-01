public class Chien extends Animal {
    public Chien(String nom, int age, String sante) {
        super(nom, age, sante);
    }

    @Override
    boolean soinQuotidien() {
        return super.soinQuotidien();
    }

    @Override
    boolean bruit() {
        return super.bruit();
    }
}
