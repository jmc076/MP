package org.mp.sesion02;

import java.util.Iterator;

public class IteradorPrimos implements Iterator<Integer> {
	
	private int limite;
	private int actual;

	public IteradorPrimos(int limite) {
		this.limite = limite;
	}
	
	public Object getLimite() {
		return limite;
	}

	public Object getActual() {
		return actual;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		return null;
	}


	public static Object esPrimo(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public String mostrarPrimos() {
		// TODO Auto-generated method stub
		return null;
	}

}
