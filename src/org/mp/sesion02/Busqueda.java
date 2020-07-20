package org.mp.sesion02;

public class Busqueda<E extends Comparable<E>> {

	public static <E extends Comparable<E>> int busquedaBinaria(E[] array,E valor)throws ExcepcionArrayVacio {
		if(array.length <= 0){
			throw new ExcepcionArrayVacio("Array vacío");
		}
		int primero = 0;
		int ultimo = array.length - 1;
		int central;

		if((valor.compareTo(array[0])<0) || (valor.compareTo(array[array.length-1])>0)){
			return -1;
		}else{
			while(ultimo>=primero) {
			central = (primero + ultimo) / 2;
			   if (array[central].compareTo(valor) > 0) {
			    	ultimo = central - 1;
			        central = (primero + ultimo) / 2;
			    } else if(array[central].compareTo(valor) < 0){
			    	primero = central + 1;
			        central = (primero + ultimo) / 2;
			    }else{
			    	return central;
			    }
			}
		}
			return -1;
	}

	public static <E extends Comparable<E>> int busquedaBinaria(Fraccion[] fracciones,Fraccion fraccion)throws ExcepcionArrayVacio {
		if(fracciones.length <= 0){
			throw new ExcepcionArrayVacio("Array vacío");
		}
		int primero = 0;
		int ultimo = fracciones.length - 1;
		int central;

		if((fraccion.compareTo(fracciones[0])<0) || (fraccion.compareTo(fracciones[fracciones.length-1])>0)){
			return -1;
		}else{
			while(ultimo>=primero) {
			central = (primero + ultimo) / 2;
			   if (fracciones[central].compareTo(fraccion) > 0) {
			    	ultimo = central - 1;
			        central = (primero + ultimo) / 2;
			    } else if(fracciones[central].compareTo(fraccion) < 0){
			    	primero = central + 1;
			        central = (primero + ultimo) / 2;
			    }else{
			    	return central;
			    }
			}
		}
			return -1;
	}


}