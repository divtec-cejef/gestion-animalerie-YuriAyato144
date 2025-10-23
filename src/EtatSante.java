public enum EtatSante {
    SAIN("sain"),
    SOIN_LEGER("soin leger"),
    SOIN_INTENSIF("soin intensif");

    private final String nom;

    EtatSante(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return nom;
    }
}
