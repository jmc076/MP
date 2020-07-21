package org.mp.sesion03;

import java.util.Iterator;
import java.util.Arrays;

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
	  if (size == data.length) {
		  E[] auxiliar = (E[])new Object[CAPACIDAD_INICIAL *2 +1];
		  System.arraycopy(data, 0, auxiliar, 0, CAPACIDAD_INICIAL);
		  data = auxiliar;
	  }
  }

  @Override /**Elimina todos los elementos de la lista  */
  public void clear() {
	  data = (E[])new Object[CAPACIDAD_INICIAL];
	  size = 0;
  }

  @Override /** Devuelve true si la lista contiene el elemento */
  public boolean contains(E e) {
	  for (int i = 0; i < data.length; i++) {
		if(data[i].equals(e)) return true;
	}
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

  @Override /** Devuelve el �ndice de la primera
   *  ocurrencia del elemento en la lista.
   *  Devuelve -1 si no está. */
  public int indexOf(E e) {
	  for (int i = 0; i < data.length; i++) {
		  if (data[i].equals(e)) return i;
	}
       return -1;
  }

  @Override /** Devuelve el índice de la última ocurrencia del elemento
   *  en la lista. Devuelve -1 si no está. */
  public int lastIndexOf(E e) {
	  for (int i = data.length -1; i >= 0; i--) {
		  if (data[i].equals(e)) return i;
	}
       return -1;
  }

  @Override /**Elimina el elemento en la posición especificada
   *  en la lista. Desplaza la subsecuencia de elementos a la izquierda.
   *  Devuelve el elemento eliminado. */
  public E remove(int index) {
	 E elemento = data [index];
	 for(int i = index; i < data.length; i++) {
		if(i + 1 == data.length) 
			data[i] = null;
		else
			data[i] = data [i+1];
	}
	 return elemento;
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
	  if (size < data.length) {
          data = (size == 0)? EMPTY_ELEMENTDATA: Arrays.copyOf(data, size);
      }
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