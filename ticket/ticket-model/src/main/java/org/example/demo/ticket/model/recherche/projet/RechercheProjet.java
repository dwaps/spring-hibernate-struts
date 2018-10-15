package org.example.demo.ticket.model.recherche.projet;

public class RechercheProjet {

    // ==================== Attributs ====================
    private Integer ticketId;
    private Integer auteurId;


    // ==================== Constructeurs ====================
    /**
     * Constructeur par défaut.
     */
    public RechercheProjet() {

    }


    // ==================== Getters/Setters ====================
    public Integer getAuteurId() {
        return auteurId;
    }

    /**
     * Assigne le critère de recherche : id de l'auteur.
     *
     * @param pAuteurId -
     * @return {@code this}
     */
    public RechercheProjet setAuteurId(Integer pAuteurId) {
        auteurId = pAuteurId;
        return this;
    }

    public Integer getTicketId() {
        return ticketId;
    }

    /**
     * Assigne le critère de recherche : id du projet.
     *
     * @param pProjetId -
     * @return {@code this}
     */
    public RechercheProjet setTicketId(Integer pTicketId) {
        ticketId = pTicketId;
        return this;
    }
}
