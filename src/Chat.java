public class Chat extends Animal {
    public Chat(String race, String nom, int age, EtatSante sante, String bruit, String soinQuotidien) {
        super(race = "chat", nom, age, sante, bruit, soinQuotidien);
    }

    @Override
    public String soinQuotidien(Employe employe) {
        return this.getNom() + " se fait caresser";
    }


    public String bruit() {
        return "miaou";
    }
}
