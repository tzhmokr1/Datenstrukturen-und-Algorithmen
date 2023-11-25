
public class BeispielAlgorithmen {
	
	public BeispielAlgorithmen() {}
	
	public int smallest(int[] a) {
		int smallest = 10;
		for (int i = 1; i < a.length; i++) {
			if (smallest > a[i]) {
				smallest = a[i];
			}
		}
		return smallest;
	}
	
	public static void main(String[] args) {
		
		int[] numbers = {10,30,-20,-18,3,4,-200};
		
		BeispielAlgorithmen bAlgorithmen = new BeispielAlgorithmen();
		System.out.println(bAlgorithmen.smallest(numbers));
		
	}

}
