
/*
 * Juan José Méndez Contreras
 * Metodología de la Programación
 * Universidad de Almería, 2020
*/
package org.mp.sesion02;

import java.util.GregorianCalendar;

public abstract class ObjetoGeometrico {

	protected String color = "blanco";
	protected boolean relleno = false;
	protected GregorianCalendar fechaCreado;

	protected ObjetoGeometrico() {
		super();
		fechaCreado = new GregorianCalendar();
	}

	protected ObjetoGeometrico(String color, boolean relleno) {
		super();
		fechaCreado = new GregorianCalendar();
		this.color = color;
		this.relleno = relleno;
	}


	public abstract double getArea();

	public abstract double getPerimetro();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean esRelleno() {
		return relleno;
	}

	public void setRelleno(boolean relleno) {
		this.relleno = relleno;
	}

	public GregorianCalendar getFechaCreado() {
		return fechaCreado;
	}

	public String toString() {
		return "Creado el " + fechaCreado + "\ncolor: " + color
				+ " y relleno: " + relleno;
	}


}