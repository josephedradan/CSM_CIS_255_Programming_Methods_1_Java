import java.util.*;

public class ListQueue<T> {
	
	private List<T> list;
	
	public ListQueue() {
		list = new LinkedList<T>();
	}
	
	public void enqueue(T newElement) {
		list.add(newElement); // add to the end of the list- which represents the end of our queue
	}
	
	public T dequeue() {
		// two options for dequeuing from empty:
		// 1) throw an exception- but make it a meaningful one! NOT IndexOutOfBoundsException
		// either create your own to describe the situation or use a more appropriate one from Java
		/*
		try {
			return list.remove(0); // remove from the front of the list- which represents the front of our queue
		} catch(IndexOutOfBoundsException ex) {
			throw new MyChosenException();
		}
		*/
		// 2) return a null
		if(isEmpty()) {
			return null;
			// or could implement choice 1) by throwing the exception from here
		} else {
			return list.remove(0);
		}
	}
	
	public T getFront() {
		if(isEmpty()) {
			return null;
		} else {
			return list.get(0); // look at the element at the front of the list
		}
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	@Override
	public String toString() {
		return "FRONT " + list.toString() + " BACK";
	}
	
	

}
