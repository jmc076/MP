package org.mp.sesion02;

import java.util.Iterator;

public class IteradorPrimos implements Iterator<Integer> {

	private int limite;
	private int actual;

	public IteradorPrimos(int limite) {
		this.limite = limite;
		this.actual = 1;
	}

	public Object getLimite() {
		return limite;
	}

	public Object getActual() {
		if (actual == 1) return actual + 1;
		return actual;
	}

	@Override
	public boolean hasNext() {
		while(actual < limite){
			actual++;
			if(esPrimo (actual)) return true;
		}
		return false;
	}

	@Override
	public Integer next() {
		if (hasNext() == false){
			throw new UnsupportedOperationException("No se puede acceder a más números primos");
			}
			else return actual;
	}


	public static boolean esPrimo(int numero){
		int contador = 2;
		  boolean primo = true;
		  while ((primo) && (contador != numero)){
		    if (numero % contador == 0) primo = false;
		    contador++;
		  }
		  return primo;
	}

	public String mostrarPrimos() {
		int cont = 0;
	     String cadena = "";
	        while (hasNext()) {
	            cadena += "\t" + actual;
	            cont ++;
	            if(cont % 10 == 0){
	                cadena += "\n";
	            }
	        }
	        return cadena;
	}
	
	public void remove() {
		throw new UnsupportedOperationException("Método no soportado");
	}


}
