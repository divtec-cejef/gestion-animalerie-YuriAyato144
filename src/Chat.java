public class Chat extends Animal {
    public Chat(String nom, int age, EtatSante sante) {
        super(nom, age, sante);
    }

    @Override
    public String soinQuotidien() {
        return "";
    }

    @Override
    public String bruit() {
        return "Miaou";
    }
}
