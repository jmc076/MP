package org.mp.sesion04;

import java.util.StringTokenizer;

public class Evaluador {

	private GenericStack<Integer> pila;

	public Evaluador(){
		pila = new GenericStack<Integer>();
	}

	public String[] eliminarBlancos(String expresion) {
		StringTokenizer tokenizer = new StringTokenizer(expresion, "+-*/() ", true);
		GenericQueue<String> cola = new GenericQueue<String>();
		while (tokenizer.hasMoreTokens()) {
			String temporal = tokenizer.nextToken();
			if (!temporal.equals(" "))
				cola.enqueue(temporal);
		}
		String[] salida = new String[cola.getSize()];
		for (int i = 0; i < salida.length; i++) {
			salida[i] = cola.dequeue();
		}
		return salida;
	}

	public void procesarUnOperador(char op, GenericStack<Integer> operandosPila) {
		int op1, op2;
		Integer resultado = null;
		op1 = operandosPila.pop();
		op2 = operandosPila.pop();
		switch (op) {
		case'+':
			resultado = op1 + op2;
			break;
		case'-':
			resultado = op1 - op2;
			break;
		case'*':
			resultado = op1 * op2;
			break;
		case'/':
			if (op2 == 0)
				throw new ArithmeticException("No es posible una división por cero");
			resultado = op1 / op2;
			break;
		}
		operandosPila.push(resultado);
	}

	private boolean esOperador(String token) {
		return token.contentEquals("+") || token.contentEquals("-") || token.contentEquals("/")
				|| token.contentEquals("*");
	}

	private boolean soloDigitos(String expresion) {
		for (int i = 0; i < expresion.length(); i++) {
			if (!Character.isDigit(expresion.charAt(i)))
				return false;
			}
		return true;
	}

	public Object evaluarExpresion(String expresion) {
		String stringSinBlancos[] = eliminarBlancos(expresion);
		String digitos = "";
		String tokens = "";
		for (int i = 0; i < stringSinBlancos.length; i++) {
			digitos += stringSinBlancos[i];
		}
		if (soloDigitos(digitos))
			pila.push(new Integer(digitos));
		else {
			for (int i = 0; i < stringSinBlancos.length; i++) {
				tokens = stringSinBlancos[i];
				if (esOperador(tokens)) {
					char operador = tokens.charAt(0);
					procesarUnOperador(operador, pila);
				} else {
					pila.push(new Integer(tokens));
					}
				}
			}
		return ((Integer) (pila.pop())).intValue();
	}
}
