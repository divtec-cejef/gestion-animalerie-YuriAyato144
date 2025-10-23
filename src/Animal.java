public abstract class Animal {
    private String race;
    private final String nom;
    private final int age;
    private EtatSante sante;
    private String bruit;
    private String soinQuotidien;

    public Animal(String race, String nom, int age, EtatSante sante, String bruit, String soinQuotidien) {
        this.race = race;
        this.nom = nom;
        this.age = age;
        this.sante = sante;
        this.bruit = bruit;
        this.soinQuotidien = soinQuotidien;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public EtatSante getSante() {
        return sante;
    }

    public void setSante(EtatSante sante) {
        this.sante = sante;
    }

    public String getBruit() {
        return bruit;
    }

    public void setBruit(String bruit) {
        this.bruit = bruit;
    }

    public String getSoinQuotidien() {
        return soinQuotidien;
    }

    public void setSoinQuotidien(String soinQuotidien) {
        this.soinQuotidien = soinQuotidien;
    }

    public abstract String bruit();

    public abstract String soinQuotidien();

    @Override
    public String toString() {
        return "Race : " + race + "\n"
                + "Nom : " + nom + "\n"
                + "Âge : " + age + " ans\n"
                + "État de santé : " + sante + "\n"
                + "Bruit : " + bruit() + "\n"
                + "Soin quotidien : " + soinQuotidien() + "\n";
    }
}
