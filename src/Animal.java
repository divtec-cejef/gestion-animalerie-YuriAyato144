public abstract class Animal {
    private final String race;
    private final String nom;
    private final int age;
    private final EtatSante sante;
    private final String bruit;
    private final String soinQuotidien;

    public Animal(String race, String nom, int age, EtatSante sante, String bruit, String soinQuotidien) {
        this.race = race;
        this.nom = nom;
        this.age = age;
        this.sante = sante;
        this.bruit = bruit;
        this.soinQuotidien = soinQuotidien;
    }

//    public String getRace() {
//        return race;
//    }
//    public void setRace(String race) {
//        this.race = race;
//    }
//    public String getNom() {
//        return nom;
//    }
//    public int getAge() {
//        return age;
//    }
//    public EtatSante getSante() {
//        return this.sante;
//    }
//    public void setSante(EtatSante sante) {
//        this.sante = sante;
//    }

    public abstract String bruit();

    public abstract String soinQuotidien();

    public String toString() {
        return "Race : " + this.race + "\n"
                + "Nom : " + this.nom + "\n"
                + "Âge : " + this.age + " ans\n"
                + "État de santé : " + this.sante + "\n"
                + "Bruit : " + this.bruit() + "\n"
                + "Soin quotidien : " + this.soinQuotidien() + "\n";
    }

    public String getBruit() {
        return bruit;
    }

    public String getSoinQuotidien() {
        return soinQuotidien;
    }
}
