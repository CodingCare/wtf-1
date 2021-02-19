package codingcare.wtf1;

import java.util.Arrays;
import java.util.List;

public class AgenceController {

    public Integer agenceUtilisateurs(Integer idAgence, String roleUtilisateur) {
        Integer n = 0;
        for (UtilisateurAgence ua : getListeUtilisateurAgence()) {
            if (ua.getAgence().getId() == idAgence && ua.getRole() != null) {
                if (ua.getRole().equals(roleUtilisateur)) {
                    n++;
                }
            }
        }
        return n;
    }

    private List<UtilisateurAgence> getListeUtilisateurAgence() {
        // Cette méthode fetch la base pour récupérer l'ensemble des données
        // Pas top mais ce n'est pas l'objet de la vidéo
        Agence agence1 = new Agence(1);
        Agence agence2 = new Agence(2);
        Utilisateur utilisateur1 = new Utilisateur();
        UtilisateurAgence ua1 = new UtilisateurAgence(utilisateur1, agence1, "secretaire");
        UtilisateurAgence ua2 = new UtilisateurAgence(utilisateur1, agence2, "accueil");
        return Arrays.asList(ua1, ua2);
    }
}
