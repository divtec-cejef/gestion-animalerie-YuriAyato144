import java.util.ArrayList;

public class Concours {
    String nomConcours;
    String lieuxConcours;
    int capacite;
    ArrayList<Animal> participantAniaml;

    public Concours(String nomConcours, String lieuxConcours, int capacite, ArrayList<Animal> participantAniaml) {
        this.nomConcours = nomConcours;
        this.lieuxConcours = lieuxConcours;
        this.capacite = capacite;
        this.participantAniaml = participantAniaml;
    }

    public static String nomConcours(String nomConcours) {
        return nomConcours;
    }

    public static String lieuxConcours(String lieuxConcours) {
        return lieuxConcours;
    }

}
