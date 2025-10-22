public abstract class Animal {
    private String race;
    private String nom;
    private int age;
    private EtatSante sante;


    public Animal(String race, String nom, int age, EtatSante sante) {
        this.race = race;
        this.nom = nom;
        this.age = age;
        this.sante = sante;
    }

//    public String getRace() {
//        return race;
//    }
//
//    public void setRace(String race) {
//        this.race = race;
//    }
//
//    public String getNom() {
//        return nom;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public EtatSante getSante() {
//        return this.sante;
//    }
//
//    public void setSante(EtatSante sante) {
//        this.sante = sante;
//    }
//
//    public abstract String bruit();
//
//    public abstract String soinQuotidien();

    public String toString() {
        return "Race : " + this.race + "\n" + "Nom : " + this.nom + "\n" + "Âge : " + this.age + " ans\n" + "État de santé : " + this.sante + "\n";
    }
}
