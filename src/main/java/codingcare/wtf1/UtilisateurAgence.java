package codingcare.wtf1;

public class UtilisateurAgence {

    private final Utilisateur utilisateur;
    private final Agence agence;
    private final String role;

    public UtilisateurAgence(Utilisateur utilisateur, Agence agence, String role) {
        this.utilisateur = utilisateur;
        this.agence = agence;
        this.role = role;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public Agence getAgence() {
        return agence;
    }

    public String getRole() {
        return role;
    }
}
