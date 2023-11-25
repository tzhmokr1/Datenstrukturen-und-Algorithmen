
public class UebungArraySortieren {
	

	public int[] bubbleSort(int[] array) {
		
		int temp; 
		
		for(int i = 0; i < array.length - 1; i++) { 
			
			for(int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		
		int[] numbers = {3, 5, 0, -10, 400, 1, 40, 33, -1, 3040, 12};
		
		UebungArraySortieren uSortieren = new UebungArraySortieren();
		
		int[] loesung = uSortieren.bubbleSort(numbers);
		
		for (int i = 0; i < loesung.length; i++) {
			System.out.println(loesung[i]);
		}
		
	}

}
