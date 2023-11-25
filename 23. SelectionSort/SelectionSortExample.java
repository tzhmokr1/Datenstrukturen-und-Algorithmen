
public class SelectionSortExample {
	
	public int[] selectionSort(int[] sortieren) {
		for(int i = 0; i < sortieren.length - 1; i++) { // Außen: 0-13
			for(int j = i + 1; j < sortieren.length; j++) { // Innen: 1-14
				if (sortieren[i] > sortieren[j]) {
					int temp = sortieren[i];
					sortieren[i] = sortieren[j];
					sortieren[j] = temp;
				}
			}
		}
		return sortieren;
	}
	
	public static void main(String[] args) {
   // Index:                0   1   2   3  4   5   6  7  8   9   10  11 12  13
		int[] unSortiert = {16, 23, 14, 7, 21, 20, 6, 1, 17, 13, 12, 9, 3, 19};
		
		SelectionSortExample selectionSortExample = new SelectionSortExample();
		
		System.out.println("Unsortiert");
		for (int i = 0; i < unSortiert.length; i++) {
			System.out.println(unSortiert[i]);	
		}
		
		System.out.println("\nSortiert");
		int[] sortiert = selectionSortExample.selectionSort(unSortiert);
		for (int i = 0; i < sortiert.length; i++) {
			System.out.println(sortiert[i]);	
		}
	}
}
