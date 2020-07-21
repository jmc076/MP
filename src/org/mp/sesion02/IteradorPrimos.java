package org.mp.sesion02;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteradorPrimos implements Iterator<Integer> {

	private int limite;
	private int actual;

	public IteradorPrimos(int limite) {
		this.limite = limite;
		this.actual = 2;
	}

	public Object getLimite() {
		return limite;
	}

	public Object getActual() {
		return actual;
	}

	@Override
	public boolean hasNext() {
		return (actual <= limite);
		
	}

	@Override
	public Integer next() {
		if (limite < actual) {
			throw new NoSuchElementException("No se puede acceder a más números primos");
		}
		int temp = actual;
		do {
			actual++;
		}while(!esPrimo(actual));
		return temp;
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
	            cadena += "\t" + next();
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
