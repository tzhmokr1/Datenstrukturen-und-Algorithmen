import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExample {
	
	public static void main(String[] args) {
		
		int[] numbers = new int[10]; // Größe 10, Index: 0-9
		int[] numbers2 = {1,2,3,4,5}; // Größe 5, Index: 0-4
		
		numbers[0] = 100;
		
		System.out.println(numbers2[2]);
		
		for (int i : numbers2) {
			System.out.println(i);
		}
		
		// Kopieren
		int[] original = {1,2,3,4}; // Größe 4
		
		int[] copy = Arrays.copyOf(original, 4);
		int[] copy2 = Arrays.copyOfRange(original, 1, 4);
		
		for (int i : copy) {
			System.out.println("Copy: " + i);
		}
		
		// ArrayList - Dynamische Größe
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		
		list.add(30); // Index 0
		list.add(40); // Index 1
		list.add(200); // Index 2
		list.add(300); // Index 3
		
		
		list.add(300); // Index 10
		list.add(300); // Index 11
		
		
		System.out.println(list.get(0));
		
	}

}
















