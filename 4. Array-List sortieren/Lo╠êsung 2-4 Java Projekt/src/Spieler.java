
public class Spieler implements Comparable<Spieler> {

	private String name;
	private int groeße;

	public Spieler(String name, int groeße) {
		this.name = name;
		this.groeße = groeße;
	}

	public String getName() {
		return name;
	}

	public int getGroeße() {
		return groeße;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGroeße(int groeße) {
		this.groeße = groeße;
	}

	/*
	 * Die Methode compareTo vergleicht die Spieler untereinander
	 * 
	 * return 0 -> beide Werte sind gleich
	 * return > 1 -> Spieler1.compareTo(Spieler2) Spieler 1 ist größer als Spieler 2 
	 * return < 0 -> Spieler1.compareTo(Spieler2) Spieler 1 ist kleiner als Spieler 2 
	 */
	@Override
	public int compareTo(Spieler o) {
		if (groeße < o.getGroeße()) {
			return -1;
		} else if (groeße > o.getGroeße()) {
			return 1;
		} else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		return 
				"Name: " + name + "\n" +
				"Größe: " + groeße + "cm\n";
	}

}
