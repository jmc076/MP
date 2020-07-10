package org.mp.sesion02;

public class Estudiante extends Persona{
	
	protected int nivel;
	
	public Estudiante(String nombre, String direccion, String telefono, String email, int nivel) {
		super(nombre, direccion, telefono, email);
		this.nivel = nivel;
	}

	public int getNivel() {
		return nivel;
	}

	@Override
	public String toString() {
		if(nivel == 1) {
			return "Estudiante de Grado\n"
					+ "Nombre = " + nombre + ", Dirección = " + direccion + ", Teléfono = " 
					+ telefono + ", email = " + email;
		}
		if(nivel == 2) {
			return "Estudiante de Máster\n"
					+ "Nombre = " + nombre + ", Dirección = " + direccion + ", Teléfono = " 
					+ telefono + ", email = " + email;
		}
		return "Estudiante de Doctorado\n"
		+ "Nombre = " + nombre + ", Dirección = " + direccion + ", Teléfono = " 
		+ telefono + ", email = " + email;
		
	}

}
