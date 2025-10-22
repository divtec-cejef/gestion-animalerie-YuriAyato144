public class Chat extends Animal {
    public Chat(String race, String nom, int age, EtatSante sante) {
        super(race, nom, age, sante);
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
