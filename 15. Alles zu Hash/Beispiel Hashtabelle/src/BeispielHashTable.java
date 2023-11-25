
public class BeispielHashTable {
	
	public static void calculateIndex(String name) {
		// Leo L e o
		Character character1 = name.charAt(0);
		Character character2 = name.charAt(1);
		Character character3 = name.charAt(2);
		
		System.out.println(character1 + " " + character2 + " " + character3);
		
		int ascii1 = (int) character1;
		int ascii2 = (int) character2;
		int ascii3 = (int) character3;
		
		System.out.println(ascii1 + " " + ascii2 + " " + ascii3);
		
		int summe = ascii1 + ascii2 + ascii3;
		System.out.println("Summe: " + summe);
		
		System.out.println("Index: " + summe % 11);
		
	}
	
	
	
	public static void main(String[] args) {
		// Wiederholung remainder % 
		
		int j = 288;
		int i = 11;
		
		System.out.println(j / i);
		
		System.out.println(j % i);
		
		// Buchstaben als Zahlen ausgeben
		calculateIndex("Leo");
		System.out.println("\n");
		calculateIndex("Max");
		System.out.println("\n");
		calculateIndex("Jan");
	}

}











