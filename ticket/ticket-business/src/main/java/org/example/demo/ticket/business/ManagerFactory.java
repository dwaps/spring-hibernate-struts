package org.example.demo.ticket.business;

public final class ManagerFactory {
	
	private static ManagerFactory INSTANCE;
	
	private IProjetManager projetManager;
	private ITicketManager ticketManager;
	
	static { INSTANCE = new ManagerFactory(); }
	private ManagerFactory() {}
	
	public static ManagerFactory getInstance() {
		return INSTANCE;
	}
	
	// GETTERS AND SETTERS
	
	public void setProjetManager(IProjetManager projetManager) {
		this.projetManager = projetManager;
	}
	
	public void setTicketManager(ITicketManager ticketManager) {
		this.ticketManager = ticketManager;
	}
	
	public IProjetManager getProjetManager() {
		return projetManager;
	}
	
	public ITicketManager getTicketManager() {
		return ticketManager;
	}
	
}
