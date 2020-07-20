/*
 * Juan José Méndez Contreras
 * Metodología de la Programación
 * Universidad de Almería, 2020
*/
package org.mp.sesion02;

import java.util.GregorianCalendar;

public class Octogono extends ObjetoGeometrico implements Comparable,Cloneable,DeColor{
	protected double lado;

	protected Octogono() {
		super();
		fechaCreado = new GregorianCalendar();
	}

	protected Octogono(String color, boolean relleno,double lado) {
		super();
		fechaCreado = new GregorianCalendar();
		this.color = color;
		this.relleno = relleno;
		this.lado = lado;
	}

	public double getLado(){
		return lado;
	}

	public void setLado(double lado){
		this.lado = lado;
	}

	public double getArea() {
		return (2 + (4 / Math.sqrt(2))) * lado * lado;
	}

	public double getPerimetro() {
		return 8 * lado;
	}


	public int compareTo(Object o) {
		Octogono otro = (Octogono) o;

		if (lado > otro.getLado()) return 1;
		if (lado < otro.getLado()) return -1;
		return 0;
	}

	public Object clone(){
		try {
			return super.clone();
		}
		catch(CloneNotSupportedException ex){
			return null;
		}

	}

	public String comoColorear() {
		return "Colorear los 8 lados de " + getColor();
	}

	public String toString() {
		return super.toString();
	}
}

