public class Chat extends Animal {
    public Chat(String race, String nom, int age, EtatSante sante, String bruit, String soinQuotidien) {
        super(race, nom, age, sante, bruit, soinQuotidien);
    }


    public String soinQuotidien(Employe employe) {
        return "se faire gratouiller";
    }


    public String bruit() {
        return "miaou";
    }
}
