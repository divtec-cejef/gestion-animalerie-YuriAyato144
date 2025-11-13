import java.util.ArrayList;

public class Concours {
    String nomConcours;
    String lieuxConcours;
    int capacité;
    ArrayList<Animal> participantAniaml;

    public Concours(String nomConcours, String lieuxConcours, int capacité, ArrayList<Animal> participantAniaml) {
        this.nomConcours = nomConcours;
        this.lieuxConcours = lieuxConcours;
        this.capacité = capacité;
        this.participantAniaml = participantAniaml;
    }

    public static String nomConcours(String nomConcours) {
        return nomConcours;
    }

    public static String lieuxConcours(String lieuxConcours) {
        return lieuxConcours;
    }
}
