public class Person implements Comparable<Person> {

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
	
	public long getPlz() {
		return plz;
	}

	public void setPlz(long plz) {
		this.plz = plz;
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

	/*
	 * Rückgabewerte
	 * -1 = 5 ist kleiner als 10 
	 * 0 = beide gleich
	 * 1 = 10 ist größer als 5
	 */
	
	@Override
	public int compareTo(Person o) {
		if (this.plz == o.getPlz()) {
			return 0;
		} else if (this.plz > o.getPlz()) {
			return 1;
		} else {
			return -1;
		}
	}

}
























