package org.mp.sesion02;

import java.util.GregorianCalendar;

public class Profesor extends Empleado{
	
	protected String horarioTutoria = "";
	protected int categoria;

	public Profesor(String nombre, String direccion, String telefono, String email, String despacho, int salario,
			GregorianCalendar fechaContratacion, String horarioTutoria, int categoria) {
		super(nombre, direccion, telefono, email, despacho, salario, fechaContratacion);
		this.horarioTutoria = horarioTutoria;
		this.categoria = categoria;
	}

	public String getHorarioTutoria() {
		return horarioTutoria;
	}

	public int getCategoria() {
		return categoria;
	}

	@Override
	public String toString() {
		if(categoria == 1) {
			return "Profesor Ayudante\n"
					+ "Nombre = " + nombre + ", Dirección = " + direccion + ", Teléfono = " 
					+ telefono + ", email = " + email + "\nDespacho = " + despacho + ", salario = " + salario
					+ ", Fecha de contratación = " + super.fechaContratacion.get(GregorianCalendar.DAY_OF_MONTH) + "/" + (super.fechaContratacion.get(GregorianCalendar.MONTH)+1) + "/"
					+ super.fechaContratacion.get(GregorianCalendar.YEAR) +"\nHorario = " + horarioTutoria;
		}
		if(categoria == 2) {
			return "Profesor Titular de Universidad\n"
					+ "Nombre = " + nombre + ", Dirección = " + direccion + ", Teléfono = " 
					+ telefono + ", email = " + email + "\nDespacho = " + despacho + ", salario = " + salario
					+ ", Fecha de contratación = " + super.fechaContratacion.get(GregorianCalendar.DAY_OF_MONTH) + "/" + (super.fechaContratacion.get(GregorianCalendar.MONTH)+1) + "/"
					+ super.fechaContratacion.get(GregorianCalendar.YEAR) +"\nHorario = " + horarioTutoria;
		}
		return "Profesor Catedrático de Universidad\n"
			+ "Nombre = " + nombre + ", Dirección = " + direccion + ", Teléfono = " 
			+ telefono + ", email = " + email + "\nDespacho = " + despacho + ", salario = " + salario
			+ ", Fecha de contratación = " + super.fechaContratacion.get(GregorianCalendar.DAY_OF_MONTH) + "/" + (super.fechaContratacion.get(GregorianCalendar.MONTH)+1) + "/"
			+ super.fechaContratacion.get(GregorianCalendar.YEAR) +"\nHorario = " + horarioTutoria;
	}
	
	/*"Profesor Ayudante\n"
	+ "Nombre = Antonio López Giménez, Dirección = C. Tirso de Molina 6, Teléfono = 950014678, email = alopez@ual.es\n"
	+ "Despacho = CITE II 224, salario = 1500, Fecha de contratación = 15/1/2001\n"
	+ "Horario = Lunes y jueves de 10 a 12"; */
	
}
