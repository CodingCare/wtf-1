package codingcare.wtf1;

import java.util.Arrays;
import java.util.List;

public class AgenceController {

    public Integer compterUtilisateurs(int idAgence, Role roleUtilisateur) {
        return (int) getListeUtilisateurAgence()
                .stream()
                .filter(ua -> ua.sameAgence(idAgence))
                .filter(ua -> ua.hasRole(roleUtilisateur))
                .count();
    }

    private List<UtilisateurAgence> getListeUtilisateurAgence() {
        // Cette méthode fetch la base pour récupérer l'ensemble des données
        // Pas top mais ce n'est pas l'objet de la vidéo
        Agence agence1 = new Agence(1);
        Agence agence2 = new Agence(2);
        Utilisateur utilisateur1 = new Utilisateur();
        UtilisateurAgence ua1 = new UtilisateurAgence(utilisateur1, agence1, Role.SECRETAIRE);
        UtilisateurAgence ua2 = new UtilisateurAgence(utilisateur1, agence2, Role.ACCUEIL);
        return Arrays.asList(ua1, ua2);
    }
}
