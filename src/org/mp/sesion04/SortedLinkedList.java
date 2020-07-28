package org.mp.sesion04;

import java.util.Iterator;
import org.mp.sesion03.*;

public class SortedLinkedList<E extends Comparable<E>> extends LinkedList<E>{
	

	public SortedLinkedList(Comparable<E>[] cadenas) {
		super();
		for (int i = 0; i < cadenas.length; i++) {
			addSorted(cadenas[i]);
		}
	}

	public SortedLinkedList() {
		super();
	}

	public void add(String string) {
		throw new UnsupportedOperationException ("No garantiza orden");
	}

	public void addFirst(String string) {
		throw new UnsupportedOperationException ("No garantiza orden");
	}
	

	public void add(int index, String string) {
		throw new UnsupportedOperationException ("No garantiza orden");

	}

	public void set(int i, String string) {
		throw new UnsupportedOperationException ("No garantiza orden");

	}

	public int size() {
		return super.size();
	}

	public void addSorted(Comparable<E> e) {
		if(super.isEmpty())
			super.addFirst((E) e);
		else if (e.compareTo(head.element) < 0)
			super.addFirst((E) e);
	    else if (e.compareTo(tail.element) > 0)
	    	super.addLast((E) e);
	    else {
	    	Node<E> current = head.next;
	    	Node<E> anterior = head;
	    	while (e.compareTo(current.element) > 0) {
	    		anterior = current;
	    		current = current.next;
	    		}
	    	Node<E> nuevo = new Node<E>((E) e);
	    	nuevo.next = current;
	    	anterior.next = nuevo;
	    	size++;
	    }
	}

	
	@Override
	  public String toString() {
		return "Lista ordenada: " + super.toString();
		
	  }

}
