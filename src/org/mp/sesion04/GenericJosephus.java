package org.mp.sesion04;

import org.mp.sesion03.*;

public class GenericJosephus<E>{

	private int k;
	private int n;
	private GenericQueue<E> cola;


	public GenericJosephus(int k, int n, E[] objects) {
		this.k = k;
		this.n = n;
		cola = new GenericQueue<E>();
		if(objects != null)
			for (int i = 0; i < objects.length; i++) {
				cola.enqueue(objects[i]);
			}
	}

	public GenericQueue<E> getCola() {
		return cola;
	}

	public String ordenEliminar(Object cola) {
		if (k==0)
			throw new RuntimeException ("No hay ninguna persona");
		else if (k==1)
			return "Solo hay una persona";
		else{
			String s = "Orden de eliminación: \n";
			while (this.cola.getSize() > 0){
				for (int i = 1; i < k; i++) {
					E element = this.cola.dequeue();
					this.cola.enqueue(element);
				}
				s = s + "Debe morir " + this.cola.dequeue() + "\n";
			}
		return s;
		}
	}

	public String toString() {
		return "Problema de Josephus: k=" + this.k + ", n="
				+ this.n + "\n" + cola.toString();

	}

}
