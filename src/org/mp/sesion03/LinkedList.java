package org.mp.sesion03;

import java.util.Iterator;


public class LinkedList<E> extends AbstractList<E> {

	private Node<E> head;
	private Node<E> tail;

	//Propiedades

	/** Crea una lista enlazada por defecto */
	public LinkedList() {
	}

	/** Crea una lista enlazada a partir de un array de objetos */
	public LinkedList(E[] objects) {

	}

	/** Devuelve el primer elemento de la lista */
	public E getFirst() {
		return null;
	}
	/** Devuelve el último elemento de la lista */
	public E getLast() {
		return null;
	}

	/** Añade un elemento a la cabeza de la lista */
	public void addFirst(E e) {
		Node<E> nuevoNodo = new Node<E>(e); // Crea un nodo
		nuevoNodo.next = head; // enlaza el nuevoNodo con la cabeza
		head = nuevoNodo; //la cabeza apunta al nuevoNodo
		size++; // Incrementa el tamaño de la lista

		if (tail == null) // si la lista está vacía
			tail = head;  // el nuevo nodo es el único en la lista
	}

	/** Añade un elemento al final de la lista */
	public void addLast(E e) {
		Node<E> nuevoNodo = new Node<E>(e); // Crea un nodo para e e

		if (tail == null) {
			head = tail = nuevoNodo; // El nodo nuevo es el único de la lista
		} else {
			tail.next = nuevoNodo; //enlaza el nuevo nodo con el último nodo
			tail = tail.next; // la cola apunta ahora al último nodo
		}

		size++; // Incrementa el tamaño
	}

	/**
	 * Añade el elemento e en la posición index. La posición del elemento
	 * head es 0
	 */
	public void add(int index, E e) {
		if (index == 0) { // Inserta al principio
			addFirst(e);
		} else if (index >= size) { // Inserta al final
			addLast(e);
		} else { // Inserta en medio
			Node<E> current = head;
			for (int i = 1; i < index; i++) {
				current = current.next;   // Situo current
			}
			Node<E> temp = current.next;   //Situo temp
			current.next = new Node<E>(e); // Inserto elnuevo nodo
			(current.next).next = temp;
			size++; // incrementa el tamaño
		}
	}

	/**
	 * Elimina el primer elemento de la lista y devuelve el elemento
	 * eliminado.
	 */
	public E removeFirst() {
		if (size == 0) { //Nada que borrar
			return null;
		} else {
			Node<E> temp = head; // conserva el primer nodo temporalmente
			head = head.next; //mueve head para apuntar al siguiente nodo
			size--; // disminuye el tamaño
			if (head == null) {
				tail = null;  //la lista se pone vacía
			}
			return temp.element; //devuelve el elemento borrado
		}
	}

	/**
	 * Elimina el último elemento de la lista y devuelve el elemento
	 * eliminado.
	 */
	public E removeLast() {
		if (size == 0) { // Nada que eliminar
			return null;
		} else if (size == 1) { // solo un elemento en la lista
			Node<E> temp = head;
			head = tail = null; // la lista la hacemos vacía
			size = 0;
			return temp.element;
		} else {
			Node<E> current = head;

			for (int i = 0; i < size - 2; i++) {
				current = current.next;
			}

			Node<E> temp = tail;
			tail = current;
			tail.next = null;
			size--;
			return temp.element;
		}
	}

	/**
	 * Elimina el elemento en la posición index. Devuelve el
	 * elemento que fué eliminado de la lista.
	 */
	public E remove(int index) {
		if (index < 0 || index >= size) { // Fuera de rango
			return null;
		} else if (index == 0) { // Elimina el primero
			return removeFirst();
		} else if (index == size - 1) { // Elimina el último
			return removeLast();
		} else {
			Node<E> previous = head;

			for (int i = 1; i < index; i++) {
				previous = previous.next;
			}

			Node<E> current = previous.next;
			previous.next = current.next;
			size--;
			return current.element;
		}
	}

	@Override /** Sobre-escribe toString() */
	public String toString() {

		return null;
	}

	/** Elimina todos los elementos de la lista */
	public void clear() {

	}

	/** Devuelve true si la lista contiene el elemento e */
	public boolean contains(E e) {

		return true;
	}

	/**Devuelve el elemento en la posición index especificada  */
	public E get(int index) {

		return null;
	}

	/**
	 * Devuelve el índice de la primera ocurrencia del elemento en la lista.
	 * Devuelve -1 si no está
	 */
	public int indexOf(E e) {

		return 0;
	}

	/**
	 * Devuelve el índice de la última ocurrencia del elemento
	 * en la lista. Devuelve -1 si no está.
	 */
	public int lastIndexOf(E e) {

		return 0;
	}

	/**
	 * Sustituye el elemento de la posición especificada
	 * en la lista por el elemento especificado.
	 */
	public E set(int index, E e) {

		return null;
	}

	@Override
	/** Sobre-escribe el método iterator() definido en Iterable */
	public Iterator<E> iterator() {
		return null;
		// Devuelve una instancia de LinkedListIterator
	}

	/** Esta clase implementa la interface Iterator*/
	private class LinkedListIterator implements Iterator<E> {

		@Override
		public boolean hasNext() {
			return true;
		}

		@Override
		public E next() {
			return null;
		}

		@Override
		public void remove() {

		}
	}

	// Esta clase solo se usa en LinkedList, por eso es private.
	// Esta clase no necesita acceder a ningún miembro de instancia de LinkedList,
	// por lo que se define estática.

	private static class Node<E> {
		// Propiedades

		public Node(E element) {

		}
	}
}
