import java.util.ArrayList;

public class Node<T> { // T = Datentyp -> String, Zahl, andere Klasse
	
	T valueT = null;
	
	// 1 Nachfolger 
	Node<T> child = null;
	
	// Mehr als 1 Nachfolger
	ArrayList<Node<T>> childNodes = new ArrayList<Node<T>>();
	
	
	
}














