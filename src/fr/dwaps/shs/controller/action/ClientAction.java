package fr.dwaps.shs.controller.action;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Persistence;

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
		Persistence.createEntityManagerFactory("fr.dwaps.shs.jpa");
		return "success";
	}
	
	public String oneClient() {
		findCurrentClient();
		return "success";
	}
	
	public String newClient() {
		if (client != null) {			
			if (!updatingClient()) {
				client.setId(++id);
				clients.add(client);
			}
			return "success";
		}
		return "input";
	}
	
	public String editClient() {
		findCurrentClient();
		return "success";
	}
	
	public String deleteClient() {
		findCurrentClient();
		clients.remove(client);
		return "success";
	}
	
	private boolean updatingClient() {
		for (int i = 0; i < clients.size(); i++) {
			if (clients.get(i).getId() == client.getId()) {
				clients.set(i, client);
				return true;
			}
		}
		return false;
	}
	
	private void findCurrentClient() {
		clients.forEach(c -> {
			if (c.getId() == idClient) {
				client = c;
				return;
			}
		});
	}
}
