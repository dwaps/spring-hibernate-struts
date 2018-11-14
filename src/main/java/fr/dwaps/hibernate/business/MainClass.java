package fr.dwaps.hibernate.business;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.dwaps.hibernate.model.bean.Contact;
import fr.dwaps.hibernate.model.bean.ContactDirectory;

public class MainClass {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("fr.dwaps.hibernate.jpa");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction transaction = em.getTransaction();
		
		Contact c1 = new Contact("Michael", "Cornillon", "0651279211", "contact@dwaps.fr", true);
		Contact c2 = new Contact("Daphné", "Cornillon", "0651279211", "contact@dwaps.fr", false);
		ContactDirectory rep = new ContactDirectory("Famille", Arrays.asList(c1, c2));
		
		try {
			transaction.begin();
			em.persist(rep);
			em.persist(c1);
			em.persist(c2);
			transaction.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		
		em.close();
		emf.close();
	}

}
