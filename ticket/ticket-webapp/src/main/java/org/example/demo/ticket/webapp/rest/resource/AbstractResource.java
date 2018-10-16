package org.example.demo.ticket.webapp.rest.resource;

import org.example.demo.ticket.business.ManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractResource {
	
	protected ManagerFactory managerFactory;
	
	@Autowired
	public AbstractResource(ManagerFactory managerFactory) {
		System.out.println("\n\n**************************\n"
				+ "DWAPS INFO ==> managerFactory ? : " + managerFactory
				+ "\n****************************\n\n");
		this.managerFactory = managerFactory;
	}
	public AbstractResource() {}
	
}
