
public class ContinueExample {
	
	public static void main(String[] args) {
		
		// continue überspringt einen Schleifendurchgang
				for(int i = 0; i < 10; i++) {
					if (i == 4) {
						continue;
					}
					System.out.println("zahl: " + i);
				}
				
				System.out.println("hier geht es weiter...");
				
				
				
				
	}

}
