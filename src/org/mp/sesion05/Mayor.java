package org.mp.sesion05;

import java.util.Arrays;

public class Mayor {



	public static int elEnteroMayor(int[] a) {


		int max = Integer.MIN_VALUE;

		if(a.length == 0 || a == null){
			throw new RuntimeException("Array vacio");
		} else{
			Arrays.sort(a);
			return a[a.length -1];
		}

		/*for (int indice = 0; indice < a.length; indice++) {
			if (a[indice] > max) {
				max = a[indice];
			}
		}*/

	}

}
