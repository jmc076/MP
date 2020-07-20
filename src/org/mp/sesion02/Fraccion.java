package org.mp.sesion02;

public class Fraccion implements Comparable<Object> {

	private int numerador;
	private int denominador;

	public Fraccion() {
		numerador = 0;
		denominador = 1;
	}

	public Fraccion(int numerador, int denominador) {

		this.numerador = ((denominador > 0) ? 1 : -1) * numerador;
		this.denominador = Math.abs(denominador);

	}

	@Override
	public boolean equals(Object obj) {
		Fraccion otro = (Fraccion) obj;
		if (!(obj instanceof Fraccion)) return false;
		if (denominador != otro.denominador) return false;
		if (numerador != otro.numerador) return false;
		return true;
	}

	public int getNumerador() {
		return numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	@Override
	public String toString() {
		if (denominador == 1) return numerador + "";
		return numerador + "/" + denominador;
	}

	public Fraccion sumar(Fraccion b) {
		int num = numerador * b.getDenominador() + denominador * b.getNumerador();
		int den = denominador * b.getDenominador();
		return new Fraccion(num, den);

	}

	public Fraccion restar(Fraccion b) {
		int num = numerador * b.getDenominador() - denominador * b.getNumerador();
		int den = denominador * b.getDenominador();
		return new Fraccion(num, den);
	}

	public Fraccion multiplicar(Fraccion b) {
		return new Fraccion(numerador * b.getNumerador(), denominador * b.getDenominador());
	}

	public Fraccion dividir(Fraccion b) {
		return new Fraccion(numerador * b.getDenominador(), denominador * b.getNumerador());
	}

	private static int mcd(int u, int v) {
		int r;
		u = Math.abs(u);
		v = Math.abs(v);
		if (v == 0) return u;
		while (v != 0) {
			r = u % v;
			u = v;
			v = r;
		}
		return u;
	}

	public Fraccion simplificar() {
		int dividir = mcd(numerador, denominador);
		numerador /= dividir;
		denominador /= dividir;
		return this;
	}

	public int compareTo(Object o) {
		Fraccion otro = (Fraccion) o;
		double valorFraccion = (double) numerador / denominador;
		double valorOtro = (double) otro.getNumerador() / otro.getDenominador();

		if (valorFraccion > valorOtro) return 1;
		if (valorFraccion < valorOtro) return -1;
		return 0;

	}

	public Object intValue() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object longValue() {
		// TODO Auto-generated method stub
		return null;
	}

	public double floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}

}
