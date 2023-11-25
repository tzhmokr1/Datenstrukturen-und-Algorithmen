import java.util.Arrays;

public class ArrayListExample<E> { // E - Platzhalter für den Typ der Objekte in der Liste

	
	private int size = 0;
	private static final int DEFAULT_CAPACITY = 10;
	private Object elements[];
	
	
	public ArrayListExample() {
		elements = new Object[DEFAULT_CAPACITY];
	}
	
	public void add(E e) {
		if (size == elements.length) {
			ensureCapacity();
		}
		
		elements[size++] = e;
	}
	
	private void ensureCapacity() {
		int newSize = elements.length * 2;
		elements = Arrays.copyOf(elements, newSize);
	}
	
	public E get(int index) {
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + " , Size " + index);
		}
		return (E) elements[index];
	}
	
	public E removE(int index) {
		E removeItem = (E) elements[index];
		
		// Verschieben vom Index
		for(int i = index; i < size; i++) {
			elements[index] = elements[i + 1];
		}
		size--;
		return removeItem;
	}
	
	public void writeList() {
		for (int i = 0; i < elements.length; i++) {
			System.out.println("Liste Index: " + i + ", " + elements[i]);
		}
	}
	
	public static void main(String[] args) {
		
		ArrayListExample<String> listExample = new ArrayListExample<String>();
		
		listExample.add("Person 1"); // Index 0
		listExample.add("Person 2"); // Index 1
		listExample.add("Person 3"); // Index 2
		listExample.add("Person 4"); // Index 3
		listExample.add("Person 5");
		listExample.add("Person 6");
		listExample.add("Person 7"); // Index 6
		
//		System.out.println(listExample.get(6));
		
		listExample.writeList();
		System.out.println("\n");
		

		
	}
	
	
	
	
	
}













