package fr.dwaps.shs.controller.action;

public class ClientAction {
	
	private int id;
	private String firstname;
	private String lastname;
	private String pseudo;
	private String password;
	
	public void setPseudo(String pseudo) { this.pseudo = pseudo; }
	public void setFirstname(String firstname) { this.firstname = firstname; }
	public void setLastname(String lastname) { this.lastname = lastname; }
	public void setPassword(String password) { this.password = password; }
	
	public int getId() { return id; }
	public String getFirstname() { return firstname; }
	public String getLastname() { return lastname; }
	public String getPseudo() { return pseudo; }
	public String getPassword() { return password; }
	
	public String allClient() {
		return "success";
	}
	
	public String oneClient() {
		return "success";
	}
	
	public String newClient() {
		if (lastname != null && !lastname.isEmpty() &&
				firstname != null && !firstname.isEmpty() &&
				pseudo != null && pseudo.equalsIgnoreCase("dwaps") &&
				password != null && !password.isEmpty()) {
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
