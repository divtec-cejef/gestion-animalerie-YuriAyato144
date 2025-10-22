public class Chat extends Animal {
    public Chat(String race, String nom, int age, EtatSante sante) {
        super(race, nom, age, sante);
    }


    public String soinQuotidien() {
        return "gratouiller";
    }


    public String bruit() {
        return "Miaou";
    }
}
