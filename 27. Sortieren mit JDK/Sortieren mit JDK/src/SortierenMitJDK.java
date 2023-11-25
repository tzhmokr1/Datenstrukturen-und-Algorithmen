import java.util.Arrays;

public class SortierenMitJDK {
	
	// Muss ich die Sortieralgorithmen immer selbst implementieren?
	// Nein -> Da wir das JDK nutzen 
	// Dort findet man einige fertige Sortieralgorithmen ("Methoden")
	// https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
	
	public static void main(String[] args) {
		
		int[] intArray = {-34, 30, -100, 1, 5, 300, 22, 55};
		
		Arrays.sort(intArray);
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		String[] namen = {"Ben", "Olaf", "Felix", "Xena", "Alex", "Sabine"};
		
		Arrays.sort(namen);
		
		for (int i = 0; i < namen.length; i++) {
			System.out.println(namen[i]);
		}
		
		Person[] personen = {
				new Person("Peter", "Alex", 45, 456787654, 87654),
				new Person("Laura", "Blex", 44, 4645645, 6543),
				new Person("Lisa", "Vlex", 13, 87654, 4567),
				new Person("Lukas", "Clex", 39, 012345, 234),
				new Person("Xena", "Flex", 12, 12345, 98765),
				new Person("Asterix", "Hlex", 89, 408765, 2345),
				new Person("Bernd", "Tlex", 90, 345676, 98765),
				new Person("Olaf", "Slex", 100, 7654345, 234556),
				new Person("Franki", "Qlex", 2, 4567654, 48257)
		};
		
		Arrays.sort(personen);
		
		System.out.println("\n");
		
		for (int i = 0; i < personen.length; i++) {
			System.out.println(personen[i]);
		}
		
	}

}










