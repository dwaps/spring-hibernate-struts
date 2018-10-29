package fr.dwaps.shs.model.bean;

import java.io.Serializable;

public class Client implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	
	public void setId(int id) { this.id = id; }
	public void setEmail(String email) { this.email = email; }
	public void setFirstname(String firstname) { this.firstname = firstname; }
	public void setLastname(String lastname) { this.lastname = lastname; }
	
	public int getId() { return id; }
	public String getFirstname() { return firstname; }
	public String getLastname() { return lastname; }
	public String getEmail() { return email; }
	
	@Override
	public String toString() {
		return "Client [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email+ "]";
	}
}
