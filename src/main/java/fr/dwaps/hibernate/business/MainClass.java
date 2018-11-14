package fr.dwaps.hibernate.business;

import javax.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("fr.dwaps.hibernate.jpa");
	}

}
