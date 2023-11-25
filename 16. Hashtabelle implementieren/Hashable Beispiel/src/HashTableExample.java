import java.util.ArrayList;

public class HashTableExample<K, V> {
	
	// Daten werden in einer (key, value) Kombination gespeichert ähnlich wie bei Array (index, value)
	// Die Schlüssel Keys sind unique (Einzigartig)
	
	private ArrayList<HashNode<K, V>> bucketArrayList;
	private int numBucket; ; // Gesamtgröße der Tabelle / Array
	
	private int size;  // Aktuelle Anzahl der Nodes
	
	public HashTableExample() {
		bucketArrayList = new ArrayList<>();
		
		numBucket = 10;
		size = 0;
		
		for(int i = 0; i < numBucket; i++) {
			bucketArrayList.add(null);
		}
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}

	private int getBucketIndex(K key) {
		int hashcode = key.hashCode();
		int index = hashcode % numBucket;
		
		return index;
	}
	
	// Neues Objekt hinzufügen
	public void add(K key, V value) {
		
		// Index suchen / erstellen
		int bucketIndex = getBucketIndex(key);
		HashNode<K, V> head = bucketArrayList.get(bucketIndex);
		
		// Suchen nach dem Key
		while(head != null) {
			if (head.getKey().equals(key)) {
				head.setValue(value);
				return;
			} else {
				head = head.getNext();
			}
		}
		
		// Fügen neues Element hinzu
		size++;
		head = bucketArrayList.get(bucketIndex);
		HashNode<K, V> newNode = new HashNode<K,V>(key, value);
		newNode.setNext(head);
		bucketArrayList.set(bucketIndex, newNode);
	}
	
	// Suchen
	public V get(K key) {
		int bucketIndex = getBucketIndex(key);
		HashNode<K, V> head = bucketArrayList.get(bucketIndex);
		
		while(head != null) {
			if (head.getKey().equals(key)) {
				return head.getValue();
			} else {
				head = head.getNext();
			}
		}
		
		return null;
	}
	
	// Löschen
	public V remove(K key) {
		int bucketIndex = getBucketIndex(key);
		
		HashNode<K, V> head = bucketArrayList.get(3);
		
		HashNode<K, V> prev = null;
		while(head != null) {
			if (head.getKey().equals(key)) {
				break;
			} else {
				prev = head;
				head = head.getNext();
			}
		}
		
		if (head == null) {
			return null;
		}
		
		size--;
		
		// Löschen
		if (prev != null) {
			prev.getNext().setNext(head.getNext());
		} else {
			bucketArrayList.set(bucketIndex, head.getNext());
		}
		
		return head.getValue();
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		HashNode<Integer, String> hashNode = new HashNode<Integer, String>(30, "Leo");
		System.out.println(hashNode.hashCode() % 10);
		
		HashNode<Integer, String> hashNode1 = new HashNode<Integer, String>(30, "Leo");
		System.out.println(hashNode1.hashCode() % 10);
		
	}
	
	
}























