
public class PersonList {

	// Head -> Anfangselement einer Liste
	private Person firstPerson;

	public PersonList(Person firstPerson) {
		this.firstPerson = firstPerson;
	}

	/*
	 * Typische Methode einer Liste
	 * 
	 * Einfügen, Löschen, Suchen
	 * 
	 */

	// 1. Methode: Erhalte das letzte Element aus der Liste
	public Person getLastPerson() {
		Person currentPerson = firstPerson; // Head

		while (currentPerson.getNextPerson() != null) {
			currentPerson = currentPerson.getNextPerson();
		}
		System.out.println("Letztes Element der Liste\n + Username: " + currentPerson.getUsername());
		return currentPerson;
	}

	// 2. Methode: Füge ein neues Element am Ende der Liste hinzu
	public void addPerson(Person newPerson) {
		Person lastPerson = getLastPerson();
		lastPerson.setNextPerson(newPerson);
	}

	// 3. Methode: Element in der Liste finden
	public boolean search(String username) {
		int pos = 1;
		Person currentPerson = firstPerson;
		while(currentPerson != null) {
			if (currentPerson.getUsername().equals(username)) {
				System.out.println(username + " gefunden " + " an der Position: " + pos);
				return true;
			} else {
				currentPerson = currentPerson.getNextPerson();
			}
			pos++;
		}
		return false;
	}
	
	// 4. Methode: Alle Elemente einer Liste ausgeben
	public void writeList() {
		Person currentPerson = firstPerson;
		while(currentPerson != null) {
			System.out.println("Typ: " + currentPerson.getKindUser());
			System.out.println("Username: " + currentPerson.getUsername());
			currentPerson = currentPerson.getNextPerson(); // Nächste Element / Person
		}
	}
	
	// 5. Methode: Element aus Liste löschen
	public void delete(String username) {
		Person currentPerson = firstPerson;
		while(currentPerson.getNextPerson() != null && !currentPerson.getUsername().equals(username)) {
			if (currentPerson.getNextPerson().getUsername().equals(username)) {
				if (currentPerson.getNextPerson().getNextPerson() != null) {
					currentPerson.setNextPerson(currentPerson.getNextPerson().getNextPerson());
				} else {
					currentPerson.setNextPerson(null);
					break;
				}
			}
			currentPerson = currentPerson.getNextPerson();
		}
	}
	
	
	
	// Liste erstellen
	public static void main(String[] args) {

		Person person1 = new Person("Admin", "Frank");
		Person person2 = new Person("User", "Laura");

		System.out.println(person1);
		System.out.println(person2);

		PersonList pList = new PersonList(person1);
		
		// Elemente (Personen) hinzufügen
		System.out.println("Liste erweitern... \n");
		pList.addPerson(new Person("Student", "user123")); // Position 2
		pList.addPerson(new Person("Student", "user234")); // Position 3
		pList.addPerson(new Person("Worker", "Peter")); // Position 4
		pList.addPerson(new Person("Worker", "Heiko")); // Position 5
		pList.addPerson(new Person("Trainee", "Christoph")); // Position 6
		pList.addPerson(new Person("Trainee", "Laura")); // Position 7
		
		// Letzte Person ausgeben
		Person lauraPerson = pList.getLastPerson();
		System.out.println(lauraPerson.getUsername());
		
		// Name suchen
		System.out.println("\nSuche Ergebnis: \n");
		
		if (pList.search("Lena")) {
			System.out.println("Gefunden");
		} else {
			System.out.println("Kein Eintrag gefunden");
		}
		
		// Liste ausgeben
		pList.writeList();
		

	}
}











