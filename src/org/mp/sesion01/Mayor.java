package org.mp.sesion01;

public class Mayor {

	
	 
	public static int elEnteroMayor(int[] a) {

	
		int max = Integer.MIN_VALUE;
		
		if(a.length == 0 || a == null) throw new RuntimeException("Array vacio");
	
		for (int indice = 0; indice < a.length; indice++) {  
			if (a[indice] > max) {
				max = a[indice];
			}
		}
		return max;
	}

}
