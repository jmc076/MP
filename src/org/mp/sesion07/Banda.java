package org.mp.sesion07;



public class Banda<T extends Number> {

	private String nombreBanda;
	private T[][] datos;

	public Banda(String nombre, int x, int y) {
		this.nombreBanda= nombre;
		this.datos= (T[][])new Number[y][x];
		}

	public Banda(String nombre, T[][] datos) {
		this.nombreBanda= nombre;
		this.datos= (T[][])new Number[datos.length][datos[0].length];
		for(int i= 0; i< datos.length; i++) {
			for(int j= 0; j< datos[0].length; j++) {
				this.datos[i][j] = datos[i][j];
			}
		}
	}

	public String getNombreBanda(){
		return nombreBanda;
	}

	public void setNombreBanda(String nombreBanda){
		this.nombreBanda = nombreBanda;
	}

	public T[][] getDatos() {
		return datos;
	}

	public void setDatos(T[][] datos) {
		this.datos= datos;
	}

	//obtiene el dato de la matriz en la posicion x e y
	public T getDatoXY(int x, int y){
		return datos[y][x];
	}

	//cambia el dato de la posicion x e y porel dato que agreguemos
	public void setDatoXY(T dato, int x, int y) {
		datos[y][x] = dato;
	}

	public String toString() {
		String response= nombreBanda+": \n";
		for(int i= 0; i< datos.length; i++) {
			for(int j= 0; j< datos[0].length; j++) {
				response+= datos[i][j] + " ";
			}
			response+= "\n";
		}
		return response;}

}
