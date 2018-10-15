package org.example.demo.ticket.webapp.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.example.demo.ticket.business.ManagerFactory;
import org.example.demo.ticket.webapp.rest.resource.AbstractResource;


public class DependencyInjectionListener implements ServletContextListener {
	
	private ManagerFactory managerFactory;

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		managerFactory = ManagerFactory.getInstance();
		AbstractResource.setManagerFactory(managerFactory);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		managerFactory = null;
	}

}