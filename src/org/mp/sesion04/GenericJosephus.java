package org.mp.sesion04;

import org.mp.sesion03.*;

public class GenericJosephus<E> extends LinkedList<E>{
	
	private int k;
	private int n;
	private GenericQueue<E> cola;


	public GenericJosephus(int k, int n, E[] objects) {
		super(objects);
		this.k = k;
		this.n = n;
	}

	public Object getCola() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object ordenEliminar(Object cola) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		return "Problema de Josephus: k=" + this.k + ", n="
				+ this.n + "\n" + cola;
		
	}

}
