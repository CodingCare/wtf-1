package codingcare.wtf1;

import java.util.Optional;

public class UtilisateurAgence {

    private final Utilisateur utilisateur;
    private final Agence agence;
    private final Role role;

    public UtilisateurAgence(Utilisateur utilisateur, Agence agence, Role role) {
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

    public Optional<Role> getRole() {
        return Optional.ofNullable(role);
    }

    public boolean sameAgence(int idAgence) {
        return this.agence.getId() == idAgence;
    }

    public boolean hasRole(Role role) {
        return this.role != null && this.role == role;
    }
}
