public class Lapin extends Animal {
    public Lapin(String nom, int age, String sante) {
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
