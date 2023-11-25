// Stack als Liste 
public class StackExample {
	
	private final int MAX_STACK_SIZE = 10;  // Größe vom Stack
	private URLElement topElement = null;  // Top = Immer DAS Oberste Element vom Stack
	private int currentHeight = 0; // Aktuelle Höhe des Stack

	/*
	 * Methoden vom Stack (Stapel)
	 * 
	 * push() - Erzeugt ein neues Element und legt es oben drauf 
	 * pop() - Oberste Element auslesen und es entfernen
	 * peek() - Oberste Element auslesen ohne es zu entfernen
	 * 
	 */
	
	public void push(String url) throws OverflowException {
		if (currentHeight == MAX_STACK_SIZE) {
			throw new OverflowException();
		} else {
			URLElement eUrlElement = new URLElement(url, topElement);
			topElement = eUrlElement;
			currentHeight++;
		}
	}
	
	public String pop() throws UnderflowException {
		if (currentHeight == 0) {
			throw new UnderflowException();
		} else {
			String urlString = topElement.getUrl();
			topElement = topElement.getNext();
			currentHeight--;
			return urlString;
		}
	}
	
	public String peek() throws UnderflowException {
		if (currentHeight == 0) {
			throw new UnderflowException();
		} else {
			return topElement.getUrl();
		}
	}
	
	public static void main(String[] args) {
		StackExample stackExample = new StackExample();
		
		
		try {
			stackExample.push("www.google.de");
			System.out.println(stackExample.peek());
			stackExample.push("www.youtube.de");
			System.out.println(stackExample.peek());
			stackExample.push("www.news.de");
			System.out.println(stackExample.peek());
			stackExample.push("www.gaming.de");
			System.out.println(stackExample.peek());
			
			// Drücken den zurück Button
			System.out.println("\nZurück");
			System.out.println(stackExample.pop());
			System.out.println("\nZurück");
			System.out.println(stackExample.pop());
			System.out.println("\nZurück");
			System.out.println(stackExample.pop());
			System.out.println("\nZurück");
			System.out.println(stackExample.pop());
			System.out.println("\nZurück");
			System.out.println(stackExample.pop());
			
			
		} catch (OverflowException e) {
			
			e.printStackTrace();
		} catch (UnderflowException e) {
			
		}
		
		
	}

}
























