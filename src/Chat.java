public class Chat extends Animal {
    public Chat(String race, String nom, int age, EtatSante sante, String bruit) {
        super(race, nom, age, sante, bruit);
    }


    public String soinQuotidien() {
        return "gratouiller";
    }


    public String bruit() {
        return "Miaou";
    }
}
