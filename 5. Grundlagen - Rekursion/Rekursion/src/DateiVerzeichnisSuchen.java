import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DateiVerzeichnisSuchen {

	public ArrayList<File> getPaths(File file, ArrayList<File> list) {
		if (file == null || list == null || !file.isDirectory()) {
			return null;
		}

		File[] files = file.listFiles();

		for (File file2 : files) {
			if (file2.isDirectory()) {
				getPaths(file2, list); // Rekusion
			}

			list.add(file2);
		}

		return list;
	}

	public static void main(String[] args) {
		// File kann ein Ordner oder eine Datei sein -> Daher mit file.isDirectory() zu
		// prüfen

		DateiVerzeichnisSuchen dVerzeichnisSuchen = new DateiVerzeichnisSuchen();

		String datenverzeichnisPfad = "/Users/codingenieur/Desktop/Datenverzeichnis";
		// Windows Beispiel Pfad: C:\\Users\\Franky\\Desktop\\Datenverzeichnis

		File dateiverzeichnisFile = new File(datenverzeichnisPfad);

		ArrayList<File> files = dVerzeichnisSuchen.getPaths(dateiverzeichnisFile, new ArrayList<File>());

		try {
			for (int i = 0; i < files.size(); i++) {
				System.out.println("Datei: " + files.get(i).getCanonicalPath());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Suchen
		
		System.out.println("\n");
		
		String userInputString = "Adressen";
		
		
		for (File file : files) {
			String fileName = file.getName(); // Dateinamen
			System.out.println("Dateiname: " + fileName);
			
			if (fileName.equalsIgnoreCase(userInputString + ".txt")) {
				System.out.println("Datei Gefunden");
			} 
		}
		
		
		
	}
}












