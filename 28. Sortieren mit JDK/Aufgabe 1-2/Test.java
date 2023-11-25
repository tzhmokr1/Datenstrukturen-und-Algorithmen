import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		float[] numbers = {2.3f, 4.5f, 100.43f, -234.43f, -10.4f};
		
		Arrays.sort(numbers);

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println("\n \n");
		
		String[] names = {"Bernt", "Olaf", "Alex", "Jurgen"};
		
		Arrays.sort(names);
		
		for (String string : names) {
			System.out.println(string);
		}
	}
}
