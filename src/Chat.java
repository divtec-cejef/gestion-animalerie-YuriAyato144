public class Chat extends Animal {
    public Chat(String nom, int age, EtatSante sante) {
        super(nom, age, sante);
    }

    @Override
    public String soinQuotidien() {
        return "gratouiller";
    }

    @Override
    public String bruit() {
        return "Miaou";
    }
}
