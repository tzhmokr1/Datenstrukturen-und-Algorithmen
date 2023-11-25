import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		// Hinzufügen
		list.add("Peter Müller");
		list.add("Laura");
		list.add("Rolf");
		list.addFirst("Chris");
		list.addLast("Olaf");
		
		for (String string : list) {
			System.out.println(string);
		}
		
		
		// Suchen
		boolean status = list.contains("Laura");
		
		if (status == true) {
			System.out.println("Laura gefunden");
		} else {
			System.out.println("Laura nicht gefunden");
		}
		
		// Löschen
		System.out.println("\n");
		list.remove("Chris");
		
		for (String string : list) {
			System.out.println(string);
		}
		
		
	}

}
