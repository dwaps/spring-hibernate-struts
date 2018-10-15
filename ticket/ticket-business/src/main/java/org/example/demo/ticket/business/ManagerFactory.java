package org.example.demo.ticket.business;

import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.recherche.projet.RechercheProjet;
import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;
import org.ticket.api.IManager;

public final class ManagerFactory {
	
	private static ManagerFactory INSTANCE;
	
	private IManager<Projet, RechercheProjet> projetManager;
	private IManager<Ticket, RechercheTicket> ticketManager;
	
	static { INSTANCE = new ManagerFactory(); }
	private ManagerFactory() {}
	
	public static ManagerFactory getInstance() {
		return INSTANCE;
	}
	
	// GETTERS AND SETTERS
	
	public void setProjetManager(IManager<Projet, RechercheProjet> projetManager) {
		this.projetManager = projetManager;
	}
	
	public void setTicketManager(IManager<Ticket, RechercheTicket> ticketManager) {
		this.ticketManager = ticketManager;
	}
	
	public IManager<Projet, RechercheProjet> getProjetManager() {
		return projetManager;
	}
	
	public IManager<Ticket, RechercheTicket> getTicketManager() {
		return ticketManager;
	}
	
}
