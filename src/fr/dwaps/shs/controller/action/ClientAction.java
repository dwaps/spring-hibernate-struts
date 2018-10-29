package fr.dwaps.shs.controller.action;

import java.util.ArrayList;
import java.util.List;

import fr.dwaps.shs.model.bean.Client;

public class ClientAction {
	
	private static int id = 0; // tmp
	private static List<Client> clients = new ArrayList<>();
	
	private int idClient; // tmp : from url
	private Client client;
	
	public void setClient(Client client) { this.client = client; }
	public void setIdClient(int idClient) { this.idClient = idClient; }
	
	public Client getClient() { return client; }
	public int getIdClient() { return idClient; }
	public List<Client> getClients() { return clients; }

	public String allClient() {
		return "success";
	}
	
	public String oneClient() {
		clients.forEach(c -> {
			if (c.getId() == idClient) {
				client = c;
				return;
			}
		});
		return "success";
	}
	
	public String newClient() {
		if (client != null) {
			client.setId(++id);
			clients.add(client);
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
