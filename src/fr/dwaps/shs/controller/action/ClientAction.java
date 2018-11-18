package fr.dwaps.shs.controller.action;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import fr.dwaps.shs.model.bean.Client;
import fr.dwaps.shs.util.AppListener;

public class ClientAction {
	
	private EntityManager em = AppListener.getEmf().createEntityManager();
	
	private static List<Client> clients;
	
	private int idClient; // from url
	private Client client;
	
	public void setClient(Client client) { this.client = client; }
	public void setIdClient(int idClient) { this.idClient = idClient; }
	
	public Client getClient() { return client; }
	public int getIdClient() { return idClient; }
	public List<Client> getClients() { return clients; }

	@SuppressWarnings("unchecked")
	public String allClient() {
		Query query = em.createNativeQuery("SELECT * FROM client", Client.class);
		clients = (List<Client>) query.getResultList();
		return "success";
	}
	
	public String oneClient() {
		client = em.find(Client.class, idClient);
		return "success";
	}
	
	public String newClient() {
		if (client != null) {
			EntityTransaction transaction = em.getTransaction();
			
			try {
				transaction.begin();
				System.out.println("DWAPS FORMATION ==> " + client.getId());
				if (client.getId() > 0) {
					Client c = em.merge(client);
					client = c;
				}
				em.persist(client);
				transaction.commit();
			}
			catch (Exception e) {
				e.printStackTrace();
				transaction.rollback();
			}
			
			return "success";
		}
		return "input";
	}
	
	public String editClient() {
		client = em.find(Client.class, idClient);
		return "success";
	}
	
	public String deleteClient() {
		EntityTransaction transaction = em.getTransaction();
		client = em.find(Client.class, idClient);
		
		try {
			transaction.begin();
			em.remove(client);
			transaction.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		
		return "success";
	}
}
