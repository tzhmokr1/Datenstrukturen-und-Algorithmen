

public class UebungRekursion {

	static int fakultaetIterativ(int n) {
		int ergebnis = 1;
		for (int i = 1; i <= n; i++) {
			ergebnis = ergebnis * i;
		}
		return ergebnis;
	}

	static int fakultaetRekursiv(int n) {
		if (n == 1) {
			return 1;
		} else {
			return fakultaetRekursiv(n - 1) * n;
		}
	}
	
	static int erstelleGegener(int n) {
		if (n == 0) {
			return 0;
		} else {
			System.out.println("Feind Nr. + " + n + " + erstellt");
			return erstelleGegener(n - 1);
		}
	}

	
	static void erstelleGegenerIterativ(int n) {
		for(int i = n; i > 0; i--) {
			System.out.println("Feind Nr. + " + i + " + erstellt");
		}
	}
	
	public static void main(String[] args) {

		int zahl = 5;
		int zahl2 = 7;

		System.out.println(fakultaetRekursiv(5));
		
		System.out.println(erstelleGegener(100));
		
		erstelleGegenerIterativ(100);

	}

}
