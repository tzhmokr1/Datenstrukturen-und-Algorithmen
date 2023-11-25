
public class BreakExample {
	
	public static void main(String[] args) {
		
		// mit break verlässt man die Schleife komplett
		for(int i = 0; i < 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println("zahl: " + i);
		}
		
		System.out.println("hier geht es weiter...");
		
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;
			if (i == 4) {
				break;
			}
		}
		
		
		
	}
}
