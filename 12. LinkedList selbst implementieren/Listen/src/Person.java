
public class Person {
	
	private String kindUser;
	private String username;
	
	private Person nextPerson; // Referenz (Adresse) zum nächsten Element
	
	public Person(String kindUser, String username) {
		this.kindUser = kindUser;
		this.username = username;
	}

	// Getter & Setter
	public String getKindUser() {
		return kindUser;
	}

	public void setKindUser(String kindUser) {
		this.kindUser = kindUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	// Getter & Setter für nextPerson;
	public Person getNextPerson() {
		return nextPerson;
	}

	public void setNextPerson(Person nextPerson) {
		this.nextPerson = nextPerson;
	}
	
	

}
