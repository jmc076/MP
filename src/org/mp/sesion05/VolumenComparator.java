package org.mp.sesion05;

import java.util.Comparator;

public class VolumenComparator implements Comparator<Object> {

	public int compare(Object o1, Object o2) {
		Accion accion1= (Accion) o1;
		Accion accion2= (Accion) o2;
		long volumen1= accion1.getVolumen();
		long volumen2= accion2.getVolumen();
		if (volumen1> volumen2) return 1;
		if (volumen1< volumen2) return-1;
		return 0;
}

}
