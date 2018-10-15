package org.example.demo.ticket.business;

import org.example.demo.ticket.business.manager.ProjetManager;
import org.example.demo.ticket.business.manager.TicketManager;

public final class ManagerFactory {
	
	private static ManagerFactory INSTANCE;
	
	private ProjetManager projetManager;
	private TicketManager ticketManager;
	
	static { INSTANCE = new ManagerFactory(); }
	private ManagerFactory() {}
	
	public static ManagerFactory getInstance() {
		return INSTANCE;
	}
	
	// GETTERS AND SETTERS
	
	public void setProjetManager(ProjetManager projetManager) {
		this.projetManager = projetManager;
	}
	
	public void setTicketManager(TicketManager ticketManager) {
		this.ticketManager = ticketManager;
	}
	
	public ProjetManager getProjetManager() {
		return projetManager;
	}
	
	public TicketManager getTicketManager() {
		return ticketManager;
	}
	
}
