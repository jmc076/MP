package org.mp.sesion05;

public class Accion<E> implements Comparable {

	private String nombre;
	private long volumen;

	public Accion(String nombre, long volumen){
		this.nombre = nombre;
		this.volumen = volumen;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public long getVolumen(){
		return volumen;
	}

	public void setVolumen(long volumen){
		this.volumen = volumen;
	}

	public boolean equals(Object obj) {
		Accion otro= (Accion) obj;
		return((this.volumen== otro.getVolumen()) &&
				(this.nombre.equals(otro.getNombre())));
	}

	public String toString(){
		return nombre + ": " + volumen;
	}

	public int compareTo(Object o) {
		Accion accion= (Accion<E>) o;
		return this.nombre.compareTo(accion.getNombre());
	}



}
