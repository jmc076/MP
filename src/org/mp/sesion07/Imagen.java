package org.mp.sesion07;

import java.util.ArrayList;
import java.util.Iterator;

public class Imagen{
	private String formatoImagen;
	private ArrayList<Banda<?>> bandas;
	private int lineas;
	private int columnas;
	private String tipoImagen;

	public Imagen(int lineas, int columnas, String formatoImagen, String tipoImagen) {
		this.formatoImagen = formatoImagen;
		this.lineas = lineas;
		this.columnas = columnas;
		this.tipoImagen = tipoImagen;bandas = new ArrayList<Banda<?>>();
	}

	public Number[] getDatosPixel(int x, int y) throws XYFueraImagenException {
		Number[] pixel = new Number[bandas.size()];
		for (int i = 0; i < pixel.length; i++) {
			pixel[i] = bandas.get(i).getDatoXY(x, y);
		}
		return pixel;
	}

	public Imagen extraerImagen(int x1, int y1, int x2, int y2) throws XYFueraImagenException {
		if (!XYValida(x1, y1, x2, y2)) {
			throw new XYFueraImagenException("Coordenadas fuera de la imagen");
		}

		int lineas = y2 -y1 + 1;
		int columnas = x2 -x1 + 1;
		Imagen aux = new Imagen(lineas, columnas, this.formatoImagen, tipoImagen);
		for (int k = 0; k < bandas.size(); k++) {
			Banda b = bandas.get(k);
			String nombreBanda = b.getNombreBanda();
			Number[][] data = new Number[lineas][columnas];
			for (int i = y1, m = 0; i <= y2;i++, m++) {
				for (int j = x1, n = 0; j <= x2; j++, n++) {
					data[m][n] = b.getDatoXY(j, i); // CUIDADO CORDENADAS VAN AL REVES
				}
			}
			Banda nueva = new Banda(nombreBanda, data);
			aux.anadirBanda(nueva);
			}
		return aux;
	}

	public void anadirBanda(Banda banda) {
		this.bandas.add(banda);
	}

	public void eliminarBanda(int i) {
		this.bandas.remove(i);
	}

	public Banda getBanda(int i) {
		return this.bandas.get(i);
	}

	public ArrayList<Banda<?>> getBandas() {
		return this.bandas;
	}

	public int getNumeroBandas() {
		return this.bandas.size();
	}

	public int getLineas() {
		return this.lineas;
	}

	int getColumnas() {
		return this.columnas;
	}

	public String getFormatoImagen() {
		return this.formatoImagen;
	}

	public void setFormatoImagen(String formato) {
		this.formatoImagen = formato;
	}

	public String getTipoImagen() {
		return this.tipoImagen;
	}

	public void setTipoImagen(String tipoImagen) {
		this.tipoImagen = tipoImagen;
	}

	public void setBandas(ArrayList<Banda<?>> bandas) {
		this.bandas = new ArrayList<Banda<?>>(bandas);
	}

	private boolean XYValida(int x1, int y1, int x2, int y2) {
		if (x1 < 0 || x1 >= columnas || y1 < 0 || y1 >= lineas || x2 < 0 || x2 >= columnas || y2 >= lineas) {
			return false;
		}
		return true;
	}

}
