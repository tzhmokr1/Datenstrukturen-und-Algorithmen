
public class Person implements Comparable<Person>{

	String vorname;
	String nachname;
	int alter;
	int telNr;
	long plz;

	public Person(String vorname, String nachname, int alter, int telNr, long plz) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
		this.telNr = telNr;
		this.plz = plz;
	}

	public String getVorname() {
		return vorname;
	}

	public int getAlter() {
		return alter;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	@Override
	public int compareTo(Person o) {
		return vorname.compareTo(o.vorname);
	}
	
	@Override
	public String toString() {
		return 
				"Vorname: " + vorname + "\n" + 
				"Nachname: " + nachname + "\n" + 
				"Alter: " + alter + "\n" + 
				"Telefon: " + telNr + "\n" + 
				"PLZ: " + plz;
	}

}























