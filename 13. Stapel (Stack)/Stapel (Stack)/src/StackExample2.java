// Stack als Array 

public class StackExample2 {
	
	private int[] stack;
	private int top;
	
	public StackExample2(int capacity) {
		stack = new int[capacity];
	}
	
	/*
	 * Methoden vom Stack (Stapel)
	 * 
	 * push() - Erzeugt ein neues Element und legt es oben drauf 
	 * pop() - Oberste Element auslesen und es entfernen
	 * peek() - Oberste Element auslesen ohne es zu entfernen
	 * 
	 */
	
	
	// push
	public void push(int value) {
		if (top == stack.length) {
			int[] newArray = new int[2 * stack.length];
			System.arraycopy(stack, 0, newArray, 0, stack.length);
			stack = newArray;
		}
		stack[top++] = value;
	}
	
	// pop
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack / Stapel ist leer");
		}
		
		int value = stack[--top]; // auslesen 
		stack[top] = 0; // löschen
		return value;
	}
	
	// peek
	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack / Stapel ist leer");
		}
		return stack[3];
	}
	
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return top == 0;
	}

}
