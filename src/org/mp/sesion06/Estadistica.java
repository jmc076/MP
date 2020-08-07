package org.mp.sesion06;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class Estadistica {
	
	private ConjuntoDatos conjuntoDatos;
	private DescriptiveStatistics ds;

	public Estadistica(ConjuntoDatos conjuntoDatos) {
		super();
		this.conjuntoDatos = conjuntoDatos;
	}

	public double max(String columna) throws Exception {
		double[] array = conjuntoDatos.getColumna(columna);
		ds = new DescriptiveStatistics(array);
		return ds.getMax();
	}

	public double min(String columna) throws Exception{
		double[] array = conjuntoDatos.getColumna(columna);
		ds= new DescriptiveStatistics(array);
		return ds.getMin();
	}

	public double suma(String columna) throws Exception{
		double[] array = conjuntoDatos.getColumna(columna);
		ds= new DescriptiveStatistics(array);
		return ds.getSum();
	}

	public double media(String columna) throws Exception{
		double[] array = conjuntoDatos.getColumna(columna);
		ds= new DescriptiveStatistics(array);
		return ds.getMean();
	}

}
