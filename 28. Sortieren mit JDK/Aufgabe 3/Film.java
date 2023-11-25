import java.util.Arrays;

public class Film implements Comparable<Film> {

	private String title;
	private int erscheinungsJahr;
	private double rating;

	public Film(String title, int erscheinungsJahr, double rating) {
		this.title = title;
		this.erscheinungsJahr = erscheinungsJahr;
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getErscheinungsJahr() {
		return erscheinungsJahr;
	}

	public void setErscheinungsJahr(int erscheinungsJahr) {
		this.erscheinungsJahr = erscheinungsJahr;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	/*
	 * Rückgabewerte
	 * -1 = 5 ist kleiner als 10 
	 * 0 = beide gleich
	 * 1 = 10 ist größer als 5
	 */
	
	// 1. Nach Titel sortieren
//	@Override
//	public int compareTo(Film o) {
//		return this.title.compareToIgnoreCase(o.getTitle());
//	}
	
	// 2. Nach Erscheiungsjahr sortieren
//	@Override
//	public int compareTo(Film o) {
//		if (this.erscheinungsJahr == o.getErscheinungsJahr()) {
//			return 0;
//		} else if (this.erscheinungsJahr > o.getErscheinungsJahr()) {
//			return 1;
//		} else {
//			return -1;
//		}
//	}
	
	// 3. Nach Rating sortieren - klein nach oben 
//	@Override
//	public int compareTo(Film o) {
//		if (this.rating == o.getRating()) {
//			return 0;
//		} else if (this.rating > o.getRating()) {
//			return 1;
//		} else {
//			return -1;
//		}
//	}
	
	// Zusatz - Nach Rating sortieren - oben nach unten 
	@Override
	public int compareTo(Film o) {
		if (this.rating == o.getRating()) {
			return 0;
		} else if (this.rating < o.getRating()) {
			return 1;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {

		Film film1 = new Film("Krieg der Sterne", 1977, 8.6);
		Film film2 = new Film("Schindler's List", 1993, 8.9);
		Film film3 = new Film("Casablanca", 1942, 8.5);
		Film film4 = new Film("Der Pate", 1972, 9.2);
		Film film5 = new Film("Die Verurteilten", 1994, 9.3);

		Film[] filme = { film1, film2, film3, film4, film5 };
		
		Arrays.sort(filme);
		
		for (Film film : filme) {
			System.out.println("Titel: " + film.getTitle() + " Erscheinungsjahr: " + film.getErscheinungsJahr() + " Rating: " + film.getRating());
		}
	}
}



















