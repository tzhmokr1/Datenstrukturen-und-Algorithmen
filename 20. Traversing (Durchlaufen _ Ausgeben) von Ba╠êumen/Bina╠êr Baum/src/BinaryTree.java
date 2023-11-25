
public class BinaryTree {
	
	Node rootNode;

	
	// Node's Hinzufügen
	public Node addRecursive(Node current, int value) {
		if (current == null) {
			return new Node(value);
		}
		
		if (value < current.value) {
			current.leftNode = addRecursive(current.leftNode, value);
		} else if(value > current.value) {
			current.rightNode = addRecursive(current.rightNode, value);
		} else {
			return current;
		}
		
		return current;
	}
	
	public void add(int value) {
		rootNode = addRecursive(rootNode, value);
	}
	
	// Depth-First (The in-order traversal) -> Besucht erst den linken Baum, dann root Node und dann rechter Baum
	public void traversInOrder(Node node) {
		if (node != null) {
			traversInOrder(node.leftNode);
			System.out.println("Wert: " + node.value);
			traversInOrder(node.rightNode);
		}
	}
	
	public void traversePreOder(Node node) { // Ausgabe: Root, linker Teil, rechter Teil
		if (node != null) {
			System.out.println("Wert: " + node.value);
			traversePreOder(node.leftNode);
			traversePreOder(node.rightNode);
		}
	}
	
	public void traversPostOder(Node node) { // Ausgabe: Links, Rechts, root
		if (node!= null) {
			traversPostOder(node.leftNode);
			traversPostOder(node.rightNode);
			System.out.println("Wert: " + node.value);
		}
	}
	
	// Suche in einem Baum
	public boolean containsNodeRecursive(Node current, int value) {
		if (current == null) {
			return false;
		}
		
		if (current.value == value) {
			System.out.println("Wert gefunden");
			return true;
		}
		
		if (value < current.value) {
			containsNodeRecursive(current.leftNode, value);
		} else {
			containsNodeRecursive(current.rightNode, value);
		}
		
		return false;
	}
	
	// Löschen
	public Node deleteNodeRecursive(Node current, int value) {
		if (current == null) {
			return null;
		}
		
		if (current.value == value) {
			// löschen
			
			// 1. Fall - Keine Kinder
			if (current.rightNode == null && current.leftNode == null) {
				return null;
			}
			
			// 2. Fall - Nur ein Kind
			if (current.rightNode == null) {
				return current.leftNode;
			}
			
			if (current.leftNode == null) {
				return current.rightNode;
			}
			
			// 3. Fall - Zwei Kinder
			int smallestValue = findSmallestValue(current.rightNode);
			current.value = smallestValue;
			current.rightNode = deleteNodeRecursive(current.rightNode, smallestValue);
			return current;
			
		}
		
		if (value < current.value) {
			current.leftNode = deleteNodeRecursive(current.leftNode, value);
			return current;
		} else {
			current.rightNode = deleteNodeRecursive(current.rightNode, value);
			return current;
		}
	}
	
	private int findSmallestValue(Node node) {
		if (node.leftNode == null) {
			return node.value;
		} else {
			return findSmallestValue(node.leftNode);
		}
	}
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		
		tree.add(100);
		tree.add(40);
		tree.add(30);
		tree.add(200);
		tree.add(300);
		tree.add(3);
		tree.add(34);
		
		tree.traversInOrder(tree.rootNode);
		
		System.out.println("\n");
		
		tree.containsNodeRecursive(tree.rootNode, 3);
		
	}
	
	
	

}
















