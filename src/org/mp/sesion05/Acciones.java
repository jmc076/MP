package org.mp.sesion05;

import java.util.*;

public class Acciones {

	private List<Accion> acciones;

	public Acciones(){
		acciones = new LinkedList<Accion>();
	}

	public void add (Accion accion){
		acciones.add(accion);
	}

	public List getAcciones(){
		return acciones;
	}

}
