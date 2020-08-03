package org.mp.sesion05;

import java.util.Comparator;

public class NumeroPaloComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Carta carta1 = (Carta)o1;
		Carta carta2 = (Carta)o2;
		int num1 = (int) carta1.getNumero();
		int num2 = (int) carta2.getNumero();
		String palo1 = (String) carta1.getPalo();
		String palo2 = (String) carta2.getPalo();
		char[] palos = {'O', 'C', 'E', 'B'};
		if (num1 < num2) return -1;
		else if (num1 > num2) return 1;
		else{
			int valor1 = 0;
			int valor2 = 0;
			for (int i = 0; i < palos.length; i++) {
				if (palos[i] == palo1.charAt(0)) valor1 = i;
				if (palos[i] == palo2.charAt(0)) valor2 = i;
			}
			if (valor1 == valor2) return 0;
			if (valor1 > valor2) return 0;
			return -1;
		}
	}
}
