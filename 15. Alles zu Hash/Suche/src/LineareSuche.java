
public class LineareSuche {

	
	public static void main(String[] args) {
		
		String[] names = new String[11];
		
		names[0] = "Max";
		names[1] = "Lea";
		names[2] = "Leon";
		names[3] = "Anna";
		names[4] = "Joe";
		names[5] = "Petra";
		names[6] = "Leo";
		names[7] = "Jan";
		names[8] = "Oli";
		names[9] = "Mia";
		names[10] = "Pia";
		
		
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("Leo")) {
				System.out.println("Gefunden an der Stelle " + i);
			}
		}
		
		System.out.println("Leo gefunden: " + names[6]);
		
		
		
	}
}
