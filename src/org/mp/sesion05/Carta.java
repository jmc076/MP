package org.mp.sesion05;

public class Carta implements Comparable {

	
	private String palo;
	private int numero;
	private int valor;
	
	public Carta(String string, int i) {
		this.palo = string;
		this.numero = i;
		
		if (palo == "O") valor = numero;
		else if (palo == "C") this.valor = numero + 12;
		else if (palo == "E") this.valor = numero + 24;
		else this.valor = numero + 36;
	}
	
	public Object getValor() {
		return valor;
	}
	public Object getPalo() {
		return palo;
	}
	public Object getNumero() {
		return numero;
	}
	@Override
	public int compareTo(Object o) {
		Carta carta =  (Carta) o;
		if (this.valor == carta.valor) return 0;
		else if (this.valor > carta.valor) return 1;
		return -1;
	}


}
