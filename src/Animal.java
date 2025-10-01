import java.util.ArrayList;

public abstract class Animal {

    private String nom;
    private int age;
    private String sante;


    public Animal(String nom, int age, String sante){
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

    public void setSante(String sante) {
        this.sante = sante;
    }

    public String getSante() {
        return sante;
    }

    public abstract String bruit();

    public abstract void soinQuotidien();

    public String toString() {
        return toString();
    }
}

//TODO : attributs privés, getters/setters, Constructeur à corriger, méthode toString, définir les méthodes en abstract
