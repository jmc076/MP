package org.mp.sesion03;

import java.util.Iterator;

public class ArrayList<E> extends AbstractList<E> {

  private static final int CAPACIDAD_INICIAL = 16;
  private E[] data = (E[])new Object[CAPACIDAD_INICIAL];

  /** Crea una lista por defecto */
  public ArrayList() {
  }

  /** Crea una lista a partir de un array de objetos */
  public ArrayList(E[] objects) {
    for (int i = 0; i < objects.length; i++)
      add(objects[i]); // Advertencia: no usar super(objects)!
  }

  @Override /** Añade un nuevo elemento en la posición index */
  public void add(int index, E e) {
    ensureCapacity();

    // Mueve los elementos a la derecha desde la posición especificada por index
    for (int i = size - 1; i >= index; i--)
      data[i + 1] = data[i];

    // Inserta un nuevo elemento en data[index]
    data[index] = e;

    // Incrementa el tamaño en 1
    size++;
  }

  /** Crea un nuevo array con el doble tamaño más 1 */
  private void ensureCapacity() {

  }

  @Override /**Elimina todos los elementos de la lista  */
  public void clear() {

  }

  @Override /** Devuelve true si la lista contiene el elemento */
  public boolean contains(E e) {
       return false;
  }

  @Override /**Devuelve el elemento en la posición index especificada  */
  public E get(int index) {
    checkIndex(index);
    return data[index];
  }

  private void checkIndex(int index) {
    if (index < 0 || index >= size)
      throw new IndexOutOfBoundsException
        ("Indice: " + index + ", Tamaño: " + size);
  }

  @Override /** Devuelve el índice de la primera
   *  ocurrencia del elemento en la lista.
   *  Devuelve -1 si no está. */
  public int indexOf(E e) {
       return -1;
  }

  @Override /** Devuelve el índice de la última ocurrencia del elemento
   *  en la lista. Devuelve -1 si no está. */
  public int lastIndexOf(E e) {
       return -1;
  }

  @Override /**Elimina el elemento en la posición especificada
   *  en la lista. Desplaza la subsecuencia de elementos a la izquierda.
   *  Devuelve el elemento eliminado. */
  public E remove(int index) {
    return null;
  }

  @Override /** Sustituye el elemento de la posición especificada
   *  en la lista por el elemento especificado. */
  public E set(int index, E e) {
    checkIndex(index);
    E antiguo = data[index];
    data[index] = e;
    return antiguo;
  }

  @Override
  public String toString() {
    StringBuilder resultado = new StringBuilder("[");

    for (int i = 0; i < size; i++) {
      resultado.append(data[i]);
      if (i < size - 1) resultado.append(", ");
    }

    return resultado.toString() + "]";
  }

  /** Ajusta la capacidad del array al tamaño de la lista */
  public void trimToSize() {

  }

  @Override /** Sobre-escribe el método iterator() definido en Iterable */
  public Iterator<E> iterator() {
    return null;
    // Devuelve una instancia de ArrayListIterator
  }

	private class ArrayListIterator implements Iterator<E> {
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


}