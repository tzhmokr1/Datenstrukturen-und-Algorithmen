
public class InsertionSort {

	public int[] insertionSort(int[] sortieren) {
		for (int i = 1; i < sortieren.length; i++) { // 1-14
			int zahl = sortieren[i];
			int j = i;
			while (j > 0 && sortieren[j - 1] > zahl) {
				sortieren[j] = sortieren[j - 1];
				j--;
			}
			sortieren[j] = zahl;
		}
		return sortieren;
	}

	public static void main(String[] args) {
		// Index:            0   1   2   3  4   5   6  7  8   9   10 11 12  13
		int[] unSortiert = { 16, 23, 14, 7, 21, 20, 6, 1, 17, 13, 12, 9, 3, 19 };

		InsertionSort insertionSort = new InsertionSort();

		System.out.println("Unsortiert");
		for (int i = 0; i < unSortiert.length; i++) {
			System.out.println(unSortiert[i]);
		}

		System.out.println("\nSortiert");
		int[] sortiert = insertionSort.insertionSort(unSortiert);
		for (int i = 0; i < sortiert.length; i++) {
			System.out.println(sortiert[i]);
		}
	}

}
