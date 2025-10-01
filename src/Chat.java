public class Chat extends Animal {
    public Chat(String nom, int age, String sante) {
        super(nom, age, sante);
    }

    @Override
    public void soinQuotidien() {
    }

    @Override
    public String bruit() {
        return "Miaou";
    }
}
