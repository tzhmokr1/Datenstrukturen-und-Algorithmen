
public class MergeSort {
	
	static int[] intArray = {0, 12, 40, 10, 4, 3, 8}; // 0-6 da 7 Elemente
	
	public int[] sort(int a, int b) { // a = Anfang , b = Ende
		
		if (a < b) {
			int mid = (a + b) / 2;
			
			sort(a, mid);
			sort(mid + 1, b);
			merge(a, mid, b);
		}
		
		return intArray;
	}
	
	public void merge(int a, int mid, int b) {
		int[] arr = new int[intArray.length];
		
		int i,j;
		
		for(i = a; i <= mid; i++) {
			arr[i] = intArray[i];
		}
		
		for(j = mid + 1; j <= b; j++) {
			arr[b + mid + 1 - j] = intArray[j];
		}
		
		i = a;
		j = b;
	
		for(int k = i; k <= b; k++) {
			if (arr[i] <= arr[j]) {
				intArray[k] = arr[i];
				i++;
			} else {
				intArray[k] = arr[j];
				j--;
			}
		}
		
	}
	
	public static void main(String[] args) {
		MergeSort mSort = new MergeSort();
		int[] arr = mSort.sort(0, intArray.length - 1);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		
	}

}










