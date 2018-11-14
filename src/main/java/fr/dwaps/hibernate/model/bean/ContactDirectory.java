package fr.dwaps.hibernate.model.bean;

import java.io.Serializable;
import java.util.List;

public class ContactDirectory implements Serializable {
	private static final long serialVersionUID = -8930793949494896528L;
	
	private int id;
	private String name;
	private List<Contact> contacts;
	
	public ContactDirectory() {}
	public ContactDirectory(int id, String name, List<Contact> contacts) {
		this.id = id;
		this.name = name;
		this.contacts = contacts;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Contact> getContacts() {
		return contacts;
	}
	public void addContact(Contact contact) {
		this.contacts.add(contact);
	}
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	
	@Override
	public String toString() {
		return "ContactDirectory [id=" + id + ", name=" + name + ", contacts=" + contacts + "]";
	}
}
