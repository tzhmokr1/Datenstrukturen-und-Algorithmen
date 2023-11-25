
public class BubbleSortExample {
	
	public BubbleSortExample() {}
	
	
	public int[] bubbleSort(int[] array) {
		
		int temp; // Zwischenspeicher 
		
		for(int i = 0; i < array.length - 1; i++) { // 0-12
			
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
		
		int[] array = {7,11,4,18,1,9,8,2,12,19,16,5,15}; // 13

		System.out.println("Unsortiert\n");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("\n");
		System.out.println("Sortiert\n");
		
		BubbleSortExample bubbleSortExample = new BubbleSortExample();
		int[] sortiert = bubbleSortExample.bubbleSort(array);
		
		for (int i = 0; i < sortiert.length; i++) {
			System.out.println(sortiert[i]);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
