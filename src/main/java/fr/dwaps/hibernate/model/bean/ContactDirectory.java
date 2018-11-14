package fr.dwaps.hibernate.model.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ContactDirectory")
public class ContactDirectory implements Serializable {
	private static final long serialVersionUID = -8930793949494896528L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(length=100, nullable=false, unique=true)
	private String name;
	
	@OneToMany(targetEntity=Contact.class)
	@JoinColumn(
		name="cd_id",
		referencedColumnName="id",
		foreignKey=@ForeignKey(name="FK_ContactDirectory_Contact"))
	private List<Contact> contacts;
	
	public ContactDirectory() {}
	public ContactDirectory(String name, List<Contact> contacts) {
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
