package org.mp.sesion06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ConjuntoDatos {
	
	private String separador;
	private int numeroLineas;
	private int numeroColumnas;
	private File archivoTexto;
	private Locale locale;
	private double [][] datos;
	private List<String> cabecera;
	

	public ConjuntoDatos(File archivoTexto, String separador, Locale locale) {
		this.archivoTexto = archivoTexto;
		this.separador = separador;
		this.locale = locale;
		this.cabecera = cabecera (archivoTexto);
		this.numeroLineas = numeroLineas(archivoTexto);
		this.numeroColumnas = numeroColumnas(archivoTexto);
		this.datos = leerDatos(archivoTexto, numeroLineas, numeroColumnas);
		
	}

	private double[][] leerDatos(File archivoTexto, int numeroLineas, int numeroColumnas) {
		double [][] datos = new double[numeroLineas][numeroColumnas];
		try {
			Scanner scanner = new Scanner(archivoTexto);
			scanner.nextLine();
			for (int i = 0; i < datos.length; i++) {
				String string = scanner.nextLine();
				String [] tokens = string.split(separador);
				for (int j = 0; j < datos[0].length; j++) {
					datos[i][j] = Double.parseDouble(tokens[j]);
				}
			}
			scanner.close();
		}catch (FileNotFoundException e){
				e.printStackTrace();
		}
		return datos;
	}

	private int numeroColumnas(File archivoTexto) {
		return cabecera(archivoTexto).size();
	}

	private int numeroLineas(File archivoTexto) {
		int numLineas = 0;
		try{
			Scanner scanner = new Scanner(archivoTexto);
			scanner.nextLine();
			while (scanner.hasNext()) {
				scanner.nextLine();
				numLineas++;
			}
		scanner.close();
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}
		return numLineas;
	}

	private List<String> cabecera(File archivoTexto) {
		List<String> lista = new ArrayList<String>();
		try {
			Scanner scanner = new Scanner(archivoTexto);
			String string = scanner.nextLine();
			String [] tokens = string.split(separador);
			for (int i = 0; i < tokens.length; i++) {
				lista.add(tokens[i]);
			}
			scanner.close();
		}catch (FileNotFoundException e){
				e.printStackTrace();
			
		}
		return lista;
	}

	public File getArchivoTexto() {
		return archivoTexto;
	}

	public int getNumeroColumnas() {
		return this.numeroColumnas;
	}

	public int getNumeroLineas() {
		return this.numeroLineas;
	}

	public Object getSeparador() {
		return separador;
	}

	public Locale getLocale() {
		return locale;
	}

	public ArrayList getCabecera() {
		return (ArrayList) cabecera;
	}

	public double[][] getDatos() {
		return datos;
	}

	public double[] getColumna(int columnas) {
		if (columnas < 0 || columnas >= numeroColumnas)
			throw new RuntimeException("Columnas fuera de Rango");
		double[] datosColumna = new double [numeroLineas];
		for (int i = 0; i < datosColumna.length; i++) {
			datosColumna[i] = this.datos[i][columnas];
		}
		return datosColumna;
		
	}

	public double[] getColumna(String columna) {
		return getColumna(cabecera.indexOf(columna));
	}

	public void exportar(String[] cabeceraAB, String archivoTexto, String separador) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(new File (archivoTexto));
		for (int i = 0; i < cabeceraAB.length; i++) {
			pw.print(cabeceraAB[i]);
			if (i < cabeceraAB.length)
				pw.print(separador);
		}
		pw.println();
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < cabeceraAB.length; j++) {
				int k = this.cabecera.indexOf(cabeceraAB[j]);
				pw.print(datos[i][k]);
				if (j < cabeceraAB.length - 1)
					pw.print(separador);
			}
			pw.println();
		}
		pw.close();
	}

	public ConjuntoDatos conjuntoDatos(String[] cabeceraC, String archivoTexto, String separador, Locale locale) throws FileNotFoundException{
		exportar(cabeceraC, archivoTexto, separador);
		return new ConjuntoDatos(new File(archivoTexto), separador, locale);
	}

}
