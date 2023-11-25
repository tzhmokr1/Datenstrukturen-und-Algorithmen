
public class Person  {

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


}























