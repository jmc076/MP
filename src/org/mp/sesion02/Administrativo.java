package org.mp.sesion02;

import java.util.GregorianCalendar;

public class Administrativo extends Empleado{
	
	protected String unidadDestino = "";

	public Administrativo(String nombre, String direccion, String telefono, String email, String despacho, int salario,
			GregorianCalendar fechaContratacion, String unidadDestino) {
		super(nombre, direccion, telefono, email, despacho, salario, fechaContratacion);
		this.unidadDestino = unidadDestino;
	}

	public String getUnidadDestino() {
		return unidadDestino;
	}

	@Override
	public String toString() {
		return "Administrativo\n"
				+ "Nombre = " + nombre + ", Dirección = " + direccion + ", Teléfono = " 
				+ telefono + ", email = " + email + "\nDespacho = " + despacho + ", salario = " + salario
				+ ", Fecha de contratación = " + super.fechaContratacion.get(GregorianCalendar.DAY_OF_MONTH) + "/" + (super.fechaContratacion.get(GregorianCalendar.MONTH)+1) + "/"
				+ super.fechaContratacion.get(GregorianCalendar.YEAR) +"\nDestinado en la unidad " + unidadDestino;
	}

	
	
	

}
