
public class BubbleSortExample2 {
	
	public BubbleSortExample2() {}

	public String[] sortString(String[] stringArray) {
		
		String tempString;
		
		for(int i = 0; i < stringArray.length - 1; i++) {
			
			for(int j = 0; j < stringArray.length - 1; j++) {
				if (stringArray[j].compareTo(stringArray[j+1]) > 0) {
					tempString = stringArray[j];
					stringArray[j] = stringArray[j + 1];
					stringArray[j+1] = tempString;
				}
			}
		}
		
		return stringArray;
	}

	
	public static void main(String[] args) {

		String str[] = { "s", "k", "c", "r", "v", "n", "b", "f", "a", "d" };
		
		System.out.println("Unsortiert\n");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		BubbleSortExample2 bubbleSortExample2 = new BubbleSortExample2();
		bubbleSortExample2.sortString(str);
		
		System.out.println("Sortiert\n");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		String str2[] = { "Pata", "Peter", "Andi", "Franki", "Olaf", "Asterix", "Laura", "Christoph", "Bernd", "Xena" };
		
		System.out.println("Unsortiert\n");
		for (int i = 0; i < str2.length; i++) {
			System.out.println(str2[i]);
		}
		
		BubbleSortExample2 bubbleSortExample3 = new BubbleSortExample2();
		bubbleSortExample2.sortString(str2);
		
		System.out.println("Sortiert\n");
		for (int i = 0; i < str2.length; i++) {
			System.out.println(str2[i]);
		}
		

	}

}











