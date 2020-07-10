package org.mp.sesion02;

public class Persona {
	
	protected String nombre = ""; 
	protected String direccion = "";
	protected String telefono = ""; 
	protected String email = "";
	
	public Persona(String nombre, String direccion, String telefono, String email) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", email=" + email
				+ "]";
	}
	
	

}
