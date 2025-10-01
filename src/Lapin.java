public class Lapin extends Animal {
    public Lapin(String nom, int age, String sante) {
        super(nom, age, sante);
    }

    @Override
    public void soinQuotidien() {
    }

    @Override
    public  String bruit() {
        return "IIIIIIIIIIIIIH (selon ChatGPT)";
    }
}
