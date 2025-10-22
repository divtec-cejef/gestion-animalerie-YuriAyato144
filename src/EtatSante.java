public enum EtatSante {
    SAIN("Sain"),
    SOIN_LEGER("Soin leger"),
    SOIN_INTENSIF("Soin intensif");

    private final String nom;

    EtatSante(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return nom;
    }
}
