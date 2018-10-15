package org.example.demo.ticket.webapp.rest.resource;

import org.example.demo.ticket.business.ManagerFactory;

public abstract class AbstractResource {
	protected static ManagerFactory managerFactory = ManagerFactory.getInstance();
}
