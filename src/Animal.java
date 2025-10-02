public abstract class Animal {

    private String nom;
    private int age;
    private EtatSante sante;


    public Animal(String nom, int age, EtatSante sante){
        this.nom = nom;
        this.age = age;
        this.sante = sante;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public EtatSante setSante(EtatSante sante) {
        return EtatSante.SAIN;
    }

    public EtatSante getSante() {
        return EtatSante.SAIN;
    }

    public abstract String bruit();

    public abstract String soinQuotidien();

    public String toString() {
        return toString();
    }
}
