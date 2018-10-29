package fr.dwaps.shs.controller.action;

import fr.dwaps.shs.model.bean.Client;

public class ClientAction {
	
	private Client client;
	
	public void setClient(Client client) { this.client = client; }
	public Client getClient() { return client; }
	
	public String allClient() {
		return "success";
	}
	
	public String oneClient() {
		return "success";
	}
	
	public String newClient() {
		if (client != null && client.getPseudo().equalsIgnoreCase("dwaps")) {
			return "success";
		}
		return "input";
	}
	
	public String editClient() {
		return "success";
	}
	
	public String deleteClient() {
		return "success";
	}
}
