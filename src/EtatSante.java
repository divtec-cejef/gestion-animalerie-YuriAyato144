public enum EtatSante {
    SAIN("sain (santé maximal)"),
    SOIN_LEGER("soin leger (santé moyenne)"),
    SOIN_INTENSIF("soin intensif (santé critique)");

    private final String nom;

    EtatSante(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return nom;
    }
}
