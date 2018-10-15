package org.example.demo.ticket.business.manager;


import java.util.ArrayList;
import java.util.List;

import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.model.recherche.projet.RechercheProjet;
import org.ticket.api.IManager;


/**
 * Manager des beans du package Projet.
 *
 * @author lgu
 */
public class ProjetManager implements IManager<Projet, RechercheProjet> {

    /**
     * Renvoie le projet demandé
     *
     * @param pId l'identifiant du projet
     * @return Le {@link Projet}
     * @throws NotFoundException Si le projet n'est pas trouvé
     */
	@Override
	public Projet getOne(Long pNumero) throws NotFoundException {
        // Je n'ai pas encore codé la DAO
        // Je mets juste un code temporaire pour commencer le cours...
        if (pNumero < 1) {
            throw new NotFoundException("Projet non trouvé : ID=" + pNumero);
        }
        Projet vProjet = new Projet(Math.toIntExact(pNumero));
        vProjet.setNom("Projet n°" + pNumero);
        return vProjet;
    }


    /**
     * Renvoie la liste des {@link Projet}
     *
     * @return List
     */
	@Override
	public List<Projet> getList() {
        // Je n'ai pas encore codé la DAO
        // Je mets juste un code temporaire pour commencer le cours...
        List<Projet> vList = new ArrayList<>();
        for (int vI = 0; vI < 9; vI++) {
            Projet vProjet = new Projet(vI);
            vProjet.setNom("Projet n°" + vI);
            vList.add(vProjet);
        }
        return vList;
    }

	@Override
	public List<Projet> getList(RechercheProjet search) {
		// TODO Auto-generated method stub
		return null;
	}
}
