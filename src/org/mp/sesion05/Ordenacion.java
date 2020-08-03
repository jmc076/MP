package org.mp.sesion05;

import java.util.Arrays;

public class Ordenacion {

	public static void ordenacionPorInsercion(Comparable[] temp) {
		for(int i= 1; i< temp.length; i++) {
			Comparable aux= temp[i];
			int j;
			for(j = i-1; j >= 0 && aux.compareTo(temp[j]) < 0; j--) {
				temp[j + 1] = temp[j];
				}
			temp[j+ 1] = aux;
		}
	}

	public static void ordenacionPorInsercion(Comparable[] temp, int izq, int der) {
		int j;
		for(int p= izq + 1; p <= der; p++) {
			Comparable aux = temp[p];
			for(j = p; j > izq && aux.compareTo(temp [j - 1]) < 0; j--) {
				temp[j] = temp[j - 1];
				}
			temp[j] = aux;
		}
	}

	private static void mergeSort(Comparable[] a, Comparable[] vectorTemp, int izq, int der) {
		if(izq< der) {
			int centro= (izq+ der) / 2;
			mergeSort(a, vectorTemp, izq, centro);
			mergeSort(a, vectorTemp, centro+ 1, der);
			mezclar(a, vectorTemp, izq, centro+ 1, der);
			}
		}


	public static void mergeSort(Comparable [] temp) {
		Comparable[] vectorTemp= new Comparable[temp.length];
		mergeSort(temp, vectorTemp, 0, temp.length-1);
	}

	private static void mezclar(Comparable[] a, Comparable[] vectorAux, int posIzq, int posDer, int posFin) {
		int finIzq = posDer-1;
		int posAux= posIzq;
		int numElementos = posFin-posIzq+ 1;
		while((posIzq<= finIzq) && (posDer<= posFin)) {
			if(a[posIzq].compareTo(a[posDer])<= 0)
				vectorAux[posAux++] = a[posIzq++];
			else
				vectorAux[posAux++] = a[posDer++];
		}
		while(posIzq<= finIzq)
			vectorAux[posAux++] = a[posIzq++];
		while(posDer<= posFin)
			vectorAux[posAux++] = a[posDer++];
		for(int i= 0; i< numElementos; i++, posFin--)
			a[posFin] = vectorAux[posFin];
	}

	public static void sort(Comparable[] a) {
		Arrays.sort(a);
	}
}
