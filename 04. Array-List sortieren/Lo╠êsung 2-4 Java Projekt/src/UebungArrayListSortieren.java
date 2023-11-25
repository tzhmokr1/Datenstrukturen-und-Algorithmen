import java.util.ArrayList;
import java.util.List;

public class UebungArrayListSortieren {

	public List<Spieler> sort(List<Spieler> list) { 

		Spieler temp; 

		for (int i = 0; i < list.size() - 1; i++) { // Außenschleife

			for (int j = 0; j < list.size() - 1; j++) { // Innenschleife
				if (list.get(j).compareTo(list.get(j + 1)) > 0) {
					temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {

		ArrayList<Spieler> list = new ArrayList<Spieler>();

		list.add(new Spieler("Spieler 1", 180));
		list.add(new Spieler("Spieler 2", 160));
		list.add(new Spieler("Spieler 3", 210));
		list.add(new Spieler("Spieler 4", 154));
		list.add(new Spieler("Spieler 5", 175));
		list.add(new Spieler("Spieler 6", 186));
		list.add(new Spieler("Spieler 7", 184));
		list.add(new Spieler("Spieler 8", 194));
		list.add(new Spieler("Spieler 9", 178));
		
		System.out.println("Ausgabe Liste unsortiert:");
		for (Spieler spieler : list) {
			System.out.println(spieler.toString());
		}
		
		
		System.out.println("Liste sortiert:");
		UebungArrayListSortieren uSortieren = new UebungArrayListSortieren();
		
		List<Spieler> sortiert = uSortieren.sort(list);
		
		for (Spieler spieler : sortiert) {
			System.out.println(spieler.toString());
		}

	}

}
