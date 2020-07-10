package org.mp.sesion02;

import java.util.GregorianCalendar;

public class Empleado extends Persona{
	
	protected String despacho = "";
	protected int salario = 0;
	protected GregorianCalendar fechaContratacion = new GregorianCalendar();

	public Empleado(String nombre, String direccion, String telefono, String email, String despacho, int salario, GregorianCalendar fechaContratacion) {
		super(nombre, direccion, telefono, email);
		this.despacho = despacho;
		this.salario = salario;
		this.fechaContratacion = fechaContratacion;
		//fechaContratacion.set(2007, 6, 22);
		//fechaContratacion.getTime().getDay() * + "//" + fechaContratacion.getTime().getMonth() +
	}

	public String getDespacho() {
		return despacho;
	}

	public int getSalario() {
		return salario;
	}

	public GregorianCalendar getFechaContratacion() {
		return fechaContratacion;
	}

	@Override
	public String toString() {
		return "Empleado [despacho=" + despacho + ", salario=" + salario + ", fechaContratacion=" + fechaContratacion
				+ ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", email=" + email
				+ "]";
	}
	
	
	
	
	
}
