package org.mp.sesion05;

public class SolucionesBusqueda {

	public static int busquedaLineal(Busqueda busqueda) 
			throws ElementoNoEncontradoException{
		int[] datos = busqueda.getDatos();
		boolean encontrado = false;
		int buscado = busqueda.getNumBuscado();
		for (int i = 0; i < datos.length; i++) {
			if (buscado == datos[i])
				encontrado = true;
				break;
		}
		if(!encontrado)
			throw new ElementoNoEncontradoException("No encontrado");
		return buscado;
	}

	public static int busquedaBinariaIter(Busqueda busqueda)
			throws ElementoNoEncontradoException{
		
		int[] datos = busqueda.getDatos();
		boolean encontrado = false;
		int primero = 0;
		int ultimo = datos.length -1;
		int central;
		int buscado = busqueda.getNumBuscado();
		if (buscado < datos[0] || buscado > datos[datos.length -1]) {
			return -1;
		} else {
			while (ultimo >= primero) {
				central = (primero + ultimo) /2;
				if (buscado < datos[central])
					ultimo = central -1;
				else if (buscado > datos[central])
					primero = central +1;
				else
					return central;
			}
			encontrado = true;
		}
		if (!encontrado)
			throw new ElementoNoEncontradoException("No encontrado");
		return buscado;
	}

	public static int busquedaBinariaRec(Busqueda busqueda) 
			throws ElementoNoEncontradoException {
		int[] datos = busqueda.getDatos();
		boolean encontrado = false;
		int inicio = 0;
		int fin = datos.length -1;
		int buscado = busqueda.getNumBuscado();
		busquedaBinariaRec(datos,buscado,inicio, fin);
		return buscado;
	}
	
	public static int busquedaBinariaRec(int[] datos, int buscado, int inicio, int fin) 
			throws ElementoNoEncontradoException {
		int medio = (inicio + fin) /2;
		if (inicio > fin)
			throw new ElementoNoEncontradoException("No encontrado");
		if (buscado > medio)
			busquedaBinariaRec(datos, buscado, medio + 1, fin);
		else if (buscado < medio)
			busquedaBinariaRec(datos, buscado, inicio, medio -1);
		return buscado;
	}

}
