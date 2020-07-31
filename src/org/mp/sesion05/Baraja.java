package org.mp.sesion05;

import java.util.Random;

public class Baraja {

	private String nombreBaraja;
	private Carta[] cartas;

	public Baraja(String string, Carta[] cartas2) {
		this.nombreBaraja = string;
		this.cartas = cartas2;
	}

	public Carta[] getCartas() {
		return cartas;
	}

	public void insercion(Carta[] cartas2) {
		for (int i = 0; i < cartas2.length - 1; i++)
			this.cartas[i] = cartas2[i];
		barajar();
	}

	private void barajar() {
		// Bubble sort
		for (int i = 0; i < this.cartas.length - 1; i++) {
			for (int j = 0; j < this.cartas.length - 1; j++) {
				if (this.cartas[j + 1].compareTo(this.cartas[j]) < 0) {
					Carta intercambiar = cartas[j + 1];
					cartas[j + 1] = cartas[j];
					cartas[j] = intercambiar;
				}
			}
		}
	}

}
