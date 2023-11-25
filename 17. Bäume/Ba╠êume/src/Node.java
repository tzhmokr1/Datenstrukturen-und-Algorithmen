import java.util.ArrayList;

public class Node<T> { // Node = Knoten
	
	// Daten
	private T data = null;
	
	private ArrayList<Node<T>> childreNodes = new ArrayList<Node<T>>();
	
	private Node<T> parent = null;

	public Node(T data) {
		this.data = data;
	}
	
	//-------------------------
	// Nur einen Nachfolger
	public void addChild(Node<T> child) {
		childreNodes.add(child);
		child.setParent(this);
	}

	// Mehrere Nachfolger
	public void addChildren(ArrayList<Node<T>> childrenList) {
		childreNodes.addAll(childrenList);
		
		for (Node<T> node : childrenList) {
			node.setParent(this);
		}
	}
	
	//-------------------------
	// Traversing = Durchlaufen -> Perfekt für Rekursion
	//  depth first traversal (Tiefensuche)

	public void writeTree(Node<T> root) {
		System.out.println(root.getData());
		
		ArrayList<Node<T>> childrenList = root.getChildreNodes();
		for (Node<T> node : childrenList) {
			writeTree(node);
		}
		
	}
	
	// Getter & Setter
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public ArrayList<Node<T>> getChildreNodes() {
		return childreNodes;
	}

	public void setChildreNodes(ArrayList<Node<T>> childreNodes) {
		this.childreNodes = childreNodes;
	}

	public Node<T> getParent() {
		return parent;
	}

	public void setParent(Node<T> parent) {
		this.parent = parent;
	}
	
	// Baum erstellen
	public static void main(String[] args) {
		Node<String> root = new Node<String>("root"); // Wurzel
		
		Node<String> node1 = new Node<String>("node1"); 
		Node<String> node2 = new Node<String>("node2"); 
		Node<String> node3 = new Node<String>("nod3"); 
		
		// root -> node1 -> node2 -> node3 -> Node10, Node20, Node30, Node40
		
		root.addChild(node1);
		node1.addChild(node2);
		node2.addChild(node3);
		
		ArrayList<Node<String>> chiList = new ArrayList<Node<String>>();
		chiList.add(new Node<String>("Node 40"));
		chiList.add(new Node<String>("Node 10"));
		chiList.add(new Node<String>("Node 20"));
		chiList.add(new Node<String>("Node 30"));
		
		
		node3.addChildren(chiList);
		
		root.writeTree(root);
		
		
	}
	
	
}






















