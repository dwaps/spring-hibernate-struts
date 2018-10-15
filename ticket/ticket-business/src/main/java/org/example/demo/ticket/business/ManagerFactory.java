package org.example.demo.ticket.business;

import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.ticket.api.IManager;

public final class ManagerFactory {
	
	private static ManagerFactory INSTANCE;
	
	private IManager<Projet> projetManager;
	private IManager<Ticket> ticketManager;
	
	static { INSTANCE = new ManagerFactory(); }
	private ManagerFactory() {}
	
	public static ManagerFactory getInstance() {
		return INSTANCE;
	}
	
	// GETTERS AND SETTERS
	
	public void setProjetManager(IManager<Projet> projetManager) {
		this.projetManager = projetManager;
	}
	
	public void setTicketManager(IManager<Ticket> ticketManager) {
		this.ticketManager = ticketManager;
	}
	
	public IManager<Projet> getProjetManager() {
		return projetManager;
	}
	
	public IManager<Ticket> getTicketManager() {
		return ticketManager;
	}
	
}
