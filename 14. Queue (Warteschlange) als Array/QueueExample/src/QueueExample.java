import java.util.concurrent.LinkedBlockingQueue;

public class QueueExample {
	
	private int arr[]; // Array wo sich die Daten befinden
	private int front; // das erste Element in der Warteschlange
	private int rear; // das letzte Element in der Warteschlange
	private int capacity; // Kapazität der Warteschlange -> Wie viele Operationen können ausgeführt werden
	private int count; // Aktuelle Anzahl der Elemente in der Datenstruktur
	
	public QueueExample(int size) {
		arr = new int[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
	}
	
	// Hinzufügen
	public void enqueue(int item) {
		if (isFull()) {
			System.out.println("Keine Daten mehr hizufügen, da voll");
			System.exit(1);
		}
		System.out.println("Datei hinzufügen: " + item);
		
		rear = (rear + 1) % capacity;
		System.out.println("Rear Wert: " + rear);
		arr[rear] = item;
		count++;
	}
	
	// Laden und löschen
	public void dequeue() {
		if (isEmpty()) {
			System.out.println("Keine Daten vorhanden");
			System.exit(1);
		}
		System.out.println("Löschen: " + arr[front]);
		front = (front + 1) % capacity;
		count--;
	}
	
	// Das erste Element erhalten -> Der erste in der Warteschlange wird als erstes bedient
	public int peek() {
		if (isEmpty()) {
			System.out.println("Keine Daten vorhanden");
			System.exit(1);
		}
		return arr[front];
	}
	
	// Aktuelle Größe zurückgeben
	public int size() {
		return count;
	}
	
	// Sind Daten vorhanden oder nicht?
	public Boolean isEmpty() {
		return (size() == 0);
	}
	
	// Ist die Datenstruktur evtl. schon voll?
	public Boolean isFull() {
		return (size() == capacity);
	}
	
	// Ausgabe aller Elemente
	public void writeQueue() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		QueueExample eQueueExample = new QueueExample(10);
		
		eQueueExample.enqueue(30);
		eQueueExample.enqueue(1);
		eQueueExample.enqueue(10);
		eQueueExample.enqueue(4);
		eQueueExample.enqueue(100);
		
		eQueueExample.writeQueue();
		
		System.out.println("\n");
		
		int value = eQueueExample.peek();
		System.out.println(value);
		
		eQueueExample.dequeue();
		
		int value1 = eQueueExample.peek();
		System.out.println(value1);
		
		LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>();
		
		try {
			queue.put(30);
			queue.put(300);
			queue.put(1);
			queue.put(5);
			queue.put(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (Integer integer : queue) {
			System.out.println(integer);
		}
		
		System.out.println(queue.peek()); // FIFO
		
		
	}
}





















