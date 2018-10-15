package org.example.demo.ticket.business;

import org.example.demo.ticket.business.manager.ProjetManager;
import org.example.demo.ticket.business.manager.TicketManager;

public final class ManagerFactory {
	
	private static ManagerFactory INSTANCE;
	
	static { INSTANCE = new ManagerFactory(); }
	private ManagerFactory() {}
	
	public static ManagerFactory getInstance() {
		return INSTANCE;
	}
	
	public ProjetManager getProjetManager() {
		return new ProjetManager();
	}
	
	public TicketManager getTicketManager() {
		return new TicketManager();
	}
	
}
