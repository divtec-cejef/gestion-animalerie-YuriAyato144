public class Chat extends Animal {
    public Chat(String race, int age, EtatSante sante) {
        super(race, nom, age, sante, bruit, soinQuotidien);
    }

    @Override
    public String soinQuotidien(Employe employe) {
        return "se faire gratouiller";
    }


    public String bruit() {
        return "miaou";
    }
}
