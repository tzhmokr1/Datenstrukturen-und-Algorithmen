

public class QuickSort {

	public static int[] quickSort(int[] sortieren, int low, int high) {
		
		// pivot, i und j bestimmen
		int pivot = sortieren[high]; // 7
		int i = low; // 0
		int j = high; // 6
		
		// i und j laufen lassen und Zahlen vertasuchen
		while (i <= j) {
			
			while (sortieren[i] < pivot) { // i++
				i++;
			}

			while (sortieren[j] > pivot) { // j--
				j--;
			}

			if (i <= j) { // Zahlen vertauschen
				int zahl = sortieren[i];
				sortieren[i] = sortieren[j];
				sortieren[j] = zahl;
				i++;
				j--;
			}
		}

		// Beim kreuzen beginnt alls von vorne
		if (low < j) {
			quickSort(sortieren, low, j);
		}

		if (high > i) {
			quickSort(sortieren, i, high);
		}
		
		return sortieren;
	}
	
	public static void main(String[] args) {
		
		int[] unsortiert = { 8, 4, 19, 3, 5, 12, 7 };
		
		System.out.println("Unsortiert \n");
		for (int i = 0; i < unsortiert.length; i++) {
			System.out.print(unsortiert[i] + " ");
		}
		
		System.out.println("\n\nSortiert");
		int low = 0;
		int high = unsortiert.length - 1; // 6 
		
		int[] sortiert = QuickSort.quickSort(unsortiert, low, high);
		
		for (int i = 0; i < sortiert.length; i++) {
			System.out.print(sortiert[i] + " ");
		}
	}
}





















