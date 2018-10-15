package org.example.demo.ticket.webapp.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.example.demo.ticket.business.ManagerFactory;
import org.example.demo.ticket.business.manager.ProjetManagerImpl;
import org.example.demo.ticket.business.manager.TicketManagerImpl;
import org.example.demo.ticket.webapp.rest.resource.AbstractResource;


public class DependencyInjectionListener implements ServletContextListener {
	
	private ManagerFactory managerFactory;

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		managerFactory = ManagerFactory.getInstance();
		
		managerFactory.setProjetManager(new ProjetManagerImpl());
		managerFactory.setTicketManager(new TicketManagerImpl());
		
		AbstractResource.setManagerFactory(managerFactory);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		managerFactory = null;
	}

}
